package typings.antlr4

import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorErrorListenerMod {
  
  @JSImport("antlr4/error/ErrorListener", "ConsoleErrorListener")
  @js.native
  open class ConsoleErrorListener () extends ErrorListener
  
  @JSImport("antlr4/error/ErrorListener", "ErrorListener")
  @js.native
  open class ErrorListener () extends StObject {
    
    def reportAmbiguity(
      recognizer: Recognizer,
      dfa: Any,
      startIndex: Double,
      stopIndex: Double,
      exact: Any,
      ambigAlts: Any,
      configs: Any
    ): Unit = js.native
    
    def reportAttemptingFullContext(
      recognizer: Recognizer,
      dfa: Any,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: Any,
      configs: Any
    ): Unit = js.native
    
    def reportContextSensitivity(
      recognizer: Recognizer,
      dfa: Any,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: Any,
      configs: Any
    ): Unit = js.native
    
    def syntaxError(recognizer: Recognizer, offendingSymbol: Token, line: Double, column: Double, msg: String, e: Any): Unit = js.native
  }
  
  @JSImport("antlr4/error/ErrorListener", "ProxyErrorListener")
  @js.native
  open class ProxyErrorListener () extends ErrorListener
}
