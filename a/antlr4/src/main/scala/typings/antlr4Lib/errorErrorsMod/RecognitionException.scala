package typings
package antlr4Lib.errorErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/error/Errors", "RecognitionException")
@js.native
class RecognitionException ()
  extends stdLib.Error {
  var ctx: antlr4Lib.parserrulecontextMod.ParserRuleContext = js.native
  var input: antlr4Lib.inputstreamMod.InputStream = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var offendingState: antlr4Lib.antlr4LibNumbers.`-1` = js.native
  var offendingToken: antlr4Lib.tokenMod.Token = js.native
  var recognizer: antlr4Lib.recognizerMod.Recognizer = js.native
  def getExpectedTokens(): js.Array[antlr4Lib.tokenMod.Token] = js.native
}

