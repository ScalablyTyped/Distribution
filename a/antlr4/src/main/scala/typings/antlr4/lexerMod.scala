package typings.antlr4

import typings.antlr4.errorsMod.RecognitionException
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lexerMod {
  
  @JSImport("antlr4/Lexer", "Lexer")
  @js.native
  open class Lexer () extends Recognizer {
    
    def charIndex(): Double = js.native
    
    var column: Any = js.native
    
    def emit(): Token = js.native
    
    def emitEOF(): Token = js.native
    
    def emitToken(): Unit = js.native
    
    def getAllTokens(): js.Array[Token] = js.native
    
    def getCharErrorDisplay(c: String): String = js.native
    
    def getErrorDisplay(s: String): String = js.native
    
    def getErrorDisplayForChar(c: String): String = js.native
    
    var inputStream: Any = js.native
    
    var line: Any = js.native
    
    def more(): Unit = js.native
    
    def nextToken(): Token = js.native
    
    def notifyListeners(e: RecognitionException): Unit = js.native
    
    def popMode(): Any = js.native
    
    def pushMode(mode: Any): Unit = js.native
    
    def recover(re: RecognitionException): Unit = js.native
    
    def reset(): Unit = js.native
    
    def skip(): Unit = js.native
    
    var sourceName: Any = js.native
    
    var text: String = js.native
    
    var `type`: Any = js.native
  }
  /* static members */
  object Lexer {
    
    @JSImport("antlr4/Lexer", "Lexer.DEFAULT_MODE")
    @js.native
    val DEFAULT_MODE: Double = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.DEFAULT_TOKEN_CHANNEL")
    @js.native
    val DEFAULT_TOKEN_CHANNEL: Any = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.HIDDEN")
    @js.native
    val HIDDEN: Any = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.MAX_CHAR_VALUE")
    @js.native
    val MAX_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.MIN_CHAR_VALUE")
    @js.native
    val MIN_CHAR_VALUE: Double = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.MORE")
    @js.native
    val MORE: Double = js.native
    
    @JSImport("antlr4/Lexer", "Lexer.SKIP")
    @js.native
    val SKIP: Double = js.native
  }
}
