import java.util.Scanner;

/**
 * 最新AI智能对话系统
 * 估值几个亿
 */
public class AIConversation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        while (true){
            str=sc.next();
            str =str.replace("吗","");
            str =str.replace("?","!");
            str =str.replace("？","!");
            System.out.println(str);
        }
    }
}
