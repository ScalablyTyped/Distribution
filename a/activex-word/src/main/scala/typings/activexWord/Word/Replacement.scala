package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacement extends js.Object {
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
  @scala.inline
  implicit class ReplacementOps[Self <: Replacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearFormatting(value: () => Unit): Self = this.set("ClearFormatting", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrame(value: Frame): Self = this.set("Frame", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighlight(value: Double): Self = this.set("Highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageID(value: WdLanguageID): Self = this.set("LanguageID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageIDFarEast(value: WdLanguageID): Self = this.set("LanguageIDFarEast", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoProofing(value: Double): Self = this.set("NoProofing", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = this.set("ParagraphFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("Style", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotReplacement_typekey(value: Replacement): Self = this.set("Word.Replacement_typekey", value.asInstanceOf[js.Any])
  }
  
}

