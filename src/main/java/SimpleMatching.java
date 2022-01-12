/**
 * 1、串的朴素匹配
 */
public class SimpleMatching {

    public static void main(String[] args) {
        String S = "abcdefj";
        String t = "bc";
        int i = simpleMatching(S, t);
        System.out.println(i);
    }

    /**
     * 在S中查找t所在的位置
     *
     * @param S
     * @param t
     * @return 下标
     */
    public static int simpleMatching(String S, String t) {
        if (S.length() <= 0 || t.length() <= 0 || S.length() < t.length()) {
            return -1;
        }

        int i = 0;
        for (; i < S.length(); i++) {

            if (S.length() - i < t.length()) { //S的剩余长度不足t的长度，直接返回-1
                return -1;
            }

            int j = 0;
            for (; j < t.length(); j++) {
                if (i + j >= S.length() || S.charAt(i + j) != t.charAt(j)){
                    break;
                }
            }

            if (j == t.length()) { //j走完了所有t的字符都没有break
                return i;
            }

        }
        return -1;
    }
}
