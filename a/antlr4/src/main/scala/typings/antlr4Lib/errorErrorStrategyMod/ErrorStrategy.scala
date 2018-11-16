package typings
package antlr4Lib.errorErrorStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/ErrorStrategy", "ErrorStrategy")
@js.native
class ErrorStrategy () extends js.Object {
  def inErrorRecoveryMode(recognizer: antlr4Lib.recognizerMod.Recognizer): scala.Unit = js.native
  def recover(recognizer: antlr4Lib.recognizerMod.Recognizer, e: stdLib.Error): scala.Unit = js.native
  def recoverInline(recognizer: antlr4Lib.recognizerMod.Recognizer): scala.Unit = js.native
  def reportError(recognizer: antlr4Lib.recognizerMod.Recognizer): scala.Unit = js.native
  def reset(recognizer: antlr4Lib.recognizerMod.Recognizer): scala.Unit = js.native
  def sync(recognizer: antlr4Lib.recognizerMod.Recognizer): scala.Unit = js.native
}

