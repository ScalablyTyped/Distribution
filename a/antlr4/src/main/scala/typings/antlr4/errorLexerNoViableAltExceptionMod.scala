package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorLexerNoViableAltExceptionMod {
  
  @JSImport("antlr4/error/LexerNoViableAltException", JSImport.Default)
  @js.native
  open class default protected () extends LexerNoViableAltException {
    def this(
      lexer: typings.antlr4.lexerMod.default,
      input: typings.antlr4.inputStreamMod.default,
      startIndex: Double,
      deadEndConfigs: typings.antlr4.atnAtnconfigsetMod.default
    ) = this()
  }
  
  @js.native
  trait LexerNoViableAltException
    extends typings.antlr4.errorRecognitionExceptionMod.default {
    
    val deadEndConfigs: typings.antlr4.atnAtnconfigsetMod.default = js.native
    
    val startIndex: Double = js.native
  }
}
