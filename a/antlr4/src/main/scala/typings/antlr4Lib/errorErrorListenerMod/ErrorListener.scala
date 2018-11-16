package typings
package antlr4Lib.errorErrorListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/ErrorListener", "ErrorListener")
@js.native
class ErrorListener () extends js.Object {
  def reportAmbiguity(
    recognizer: antlr4Lib.recognizerMod.Recognizer,
    dfa: js.Any,
    startIndex: scala.Double,
    stopIndex: scala.Double,
    exact: js.Any,
    ambigAlts: js.Any,
    configs: js.Any
  ): scala.Unit = js.native
  def reportAttemptingFullContext(
    recognizer: antlr4Lib.recognizerMod.Recognizer,
    dfa: js.Any,
    startIndex: scala.Double,
    stopIndex: scala.Double,
    conflictingAlts: js.Any,
    configs: js.Any
  ): scala.Unit = js.native
  def reportContextSensitivity(
    recognizer: antlr4Lib.recognizerMod.Recognizer,
    dfa: js.Any,
    startIndex: scala.Double,
    stopIndex: scala.Double,
    conflictingAlts: js.Any,
    configs: js.Any
  ): scala.Unit = js.native
  def syntaxError(
    recognizer: antlr4Lib.recognizerMod.Recognizer,
    offendingSymbol: antlr4Lib.tokenMod.Token,
    line: scala.Double,
    column: scala.Double,
    msg: java.lang.String,
    e: js.Any
  ): scala.Unit = js.native
}

