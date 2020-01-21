package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Replacement")
@js.native
class Replacement protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var Font: typings.activexWord.Word.Font = js.native
  val Frame: typings.activexWord.Word.Frame = js.native
  var Highlight: Double = js.native
  var LanguageID: WdLanguageID = js.native
  var LanguageIDFarEast: WdLanguageID = js.native
  var NoProofing: Double = js.native
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var Style: js.Any = js.native
  var Text: String = js.native
  @JSName("Word.Replacement_typekey")
  var WordDotReplacement_typekey: Replacement = js.native
  def ClearFormatting(): Unit = js.native
}

