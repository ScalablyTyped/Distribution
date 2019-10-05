package typings.antlr4

import typings.antlr4.errorErrorListenerMod.ErrorListener
import typings.antlr4.recognizerMod.Recognizer
import typings.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/ErrorListener", JSImport.Namespace)
@js.native
object errorErrorListenerMod extends js.Object {
  @js.native
  class ConsoleErrorListener () extends ErrorListener
  
  @js.native
  class ErrorListener () extends js.Object {
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
  
  @js.native
  class ProxyErrorListener () extends ErrorListener
  
}

