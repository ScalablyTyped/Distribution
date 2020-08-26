package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalStyle extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  var BottomPadding: Double = js.native
  val Creator: Double = js.native
  var Font: typings.activexWord.Word.Font = js.native
  var LeftPadding: Double = js.native
  var ParagraphFormat: typings.activexWord.Word.ParagraphFormat = js.native
  val Parent: js.Any = js.native
  var RightPadding: Double = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var TopPadding: Double = js.native
  @JSName("Word.ConditionalStyle_typekey")
  var WordDotConditionalStyle_typekey: ConditionalStyle = js.native
}

object ConditionalStyle {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    Creator: Double,
    Font: Font,
    LeftPadding: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: js.Any,
    RightPadding: Double,
    Shading: Shading,
    TopPadding: Double,
    WordDotConditionalStyle_typekey: ConditionalStyle
  ): ConditionalStyle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ConditionalStyle_typekey")(WordDotConditionalStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalStyle]
  }
  @scala.inline
  implicit class ConditionalStyleOps[Self <: ConditionalStyle] (val x: Self) extends AnyVal {
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
    def setBorders(value: Borders): Self = this.set("Borders", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomPadding(value: Double): Self = this.set("BottomPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: Font): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftPadding(value: Double): Self = this.set("LeftPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraphFormat(value: ParagraphFormat): Self = this.set("ParagraphFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightPadding(value: Double): Self = this.set("RightPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setShading(value: Shading): Self = this.set("Shading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopPadding(value: Double): Self = this.set("TopPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotConditionalStyle_typekey(value: ConditionalStyle): Self = this.set("Word.ConditionalStyle_typekey", value.asInstanceOf[js.Any])
  }
  
}

