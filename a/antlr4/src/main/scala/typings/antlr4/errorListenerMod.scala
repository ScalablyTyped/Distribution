package typings.antlr4

import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorListenerMod {
  
  @JSImport("antlr4/error/ErrorListener", "ConsoleErrorListener")
  @js.native
  class ConsoleErrorListener () extends ErrorListener
  
  @JSImport("antlr4/error/ErrorListener", "ErrorListener")
  @js.native
  class ErrorListener () extends StObject {
    
    def reportAmbiguity(
      recognizer: Recognizer,
      dfa: js.Any,
      startIndex: Double,
      stopIndex: Double,
      exact: js.Any,
      ambigAlts: js.Any,
      configs: js.Any
    ): Unit = js.native
    
    def reportAttemptingFullContext(
      recognizer: Recognizer,
      dfa: js.Any,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: js.Any,
      configs: js.Any
    ): Unit = js.native
    
    def reportContextSensitivity(
      recognizer: Recognizer,
      dfa: js.Any,
      startIndex: Double,
      stopIndex: Double,
      conflictingAlts: js.Any,
      configs: js.Any
    ): Unit = js.native
    
    def syntaxError(
      recognizer: Recognizer,
      offendingSymbol: Token,
      line: Double,
      column: Double,
      msg: String,
      e: js.Any
    ): Unit = js.native
  }
  
  @JSImport("antlr4/error/ErrorListener", "ProxyErrorListener")
  @js.native
  class ProxyErrorListener () extends ErrorListener
}
