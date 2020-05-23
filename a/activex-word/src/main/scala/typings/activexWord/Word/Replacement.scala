package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replacement extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Font: typings.activexWord.Word.Font
  val Frame: typings.activexWord.Word.Frame
  var Highlight: Double
  var LanguageID: WdLanguageID
  var LanguageIDFarEast: WdLanguageID
  var NoProofing: Double
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat
  val Parent: js.Any
  var Style: js.Any
  var Text: String
  @JSName("Word.Replacement_typekey")
  var WordDotReplacement_typekey: Replacement
  def ClearFormatting(): Unit
}

object Replacement {
  @scala.inline
  def apply(
    Application: Application,
    ClearFormatting: () => Unit,
    Creator: Double,
    Font: Font,
    Frame: Frame,
    Highlight: Double,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    Style: js.Any,
    Text: String,
    WordDotReplacement_typekey: Replacement
  ): Replacement = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFormatting = js.Any.fromFunction0(ClearFormatting), Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Replacement_typekey")(WordDotReplacement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
}

