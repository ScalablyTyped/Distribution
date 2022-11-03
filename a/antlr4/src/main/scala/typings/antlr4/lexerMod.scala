package typings.antlr4

import typings.antlr4.antlr4Ints.`-2`
import typings.antlr4.antlr4Ints.`-3`
import typings.antlr4.antlr4Ints.`0`
import typings.antlr4.antlr4Ints.`0x0000`
import typings.antlr4.antlr4Ints.`0x10ffff`
import typings.antlr4.antlr4Ints.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexerMod {
  
  @JSImport("antlr4/Lexer", JSImport.Default)
  @js.native
  open class default () extends Lexer {
    def this(input: typings.antlr4.inputStreamMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antlr4/Lexer", "default.DEFAULT_MODE")
    @js.native
    val DEFAULT_MODE: `0` = js.native
    
    @JSImport("antlr4/Lexer", "default.DEFAULT_TOKEN_CHANNEL")
    @js.native
    val DEFAULT_TOKEN_CHANNEL: `0` = js.native
    
    @JSImport("antlr4/Lexer", "default.HIDDEN")
    @js.native
    val HIDDEN: `1` = js.native
    
    @JSImport("antlr4/Lexer", "default.MAX_CHAR_VALUE")
    @js.native
    val MAX_CHAR_VALUE: `0x10ffff` = js.native
    
    @JSImport("antlr4/Lexer", "default.MIN_CHAR_VALUE")
    @js.native
    val MIN_CHAR_VALUE: `0x0000` = js.native
    
    @JSImport("antlr4/Lexer", "default.MORE")
    @js.native
    val MORE: `-2` = js.native
    
    @JSImport("antlr4/Lexer", "default.SKIP")
    @js.native
    val SKIP: `-3` = js.native
  }
  
  @js.native
  trait Lexer
    extends typings.antlr4.recognizerMod.default {
    
    def charIndex(): Double = js.native
    
    def column: Double = js.native
    def column_=(column: Double): Unit = js.native
    
    def emit(): typings.antlr4.commonTokenMod.default = js.native
    
    def emitEOF(): typings.antlr4.commonTokenMod.default = js.native
    
    def emitToken(token: typings.antlr4.tokenMod.default): Unit = js.native
    
    def getAllTokens(): js.Array[typings.antlr4.tokenMod.default] = js.native
    
    def getCharErrorDisplay(c: String): String = js.native
    
    def getErrorDisplay(s: String): String = js.native
    
    def getErrorDisplayForChar(c: String): String = js.native
    
    def inputStream: typings.antlr4.inputStreamMod.default = js.native
    def inputStream_=(input: typings.antlr4.inputStreamMod.default): Unit = js.native
    
    def line: Double = js.native
    def line_=(line: Double): Unit = js.native
    
    def mode(m: Double): Unit = js.native
    
    def more(): Unit = js.native
    
    def nextToken(): typings.antlr4.tokenMod.default = js.native
    
    def notifyListeners(e: typings.antlr4.errorRecognitionExceptionMod.default): Unit = js.native
    
    def popMode(): Double = js.native
    
    def pushMode(mode: Double): Unit = js.native
    
    /**
      * Lexers can normally match any char in it's vocabulary after matching
      * a token, so do the easy thing and just kill a character and hope
      * it all works out. You can instead use the rule invocation stack
      * to do sophisticated error recovery if you are in a fragment rule.
      */
    def recover(re: typings.antlr4.errorRecognitionExceptionMod.default): Unit = js.native
    
    def reset(): Unit = js.native
    
    def skip(): Unit = js.native
    
    def text: String = js.native
    def text_=(text: String): Unit = js.native
    
    def `type`: Double = js.native
    def type_=(`type`: Double): Unit = js.native
  }
}
