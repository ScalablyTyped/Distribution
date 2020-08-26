package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var Borders: typings.activexWord.Word.Borders = js.native
  val Creator: Double = js.native
  var Height: Double = js.native
  var HeightRule: WdFrameSizeRule = js.native
  var HorizontalDistanceFromText: Double = js.native
  var HorizontalPosition: Double = js.native
  var LockAnchor: Boolean = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  val Shading: typings.activexWord.Word.Shading = js.native
  var TextWrap: Boolean = js.native
  var VerticalDistanceFromText: Double = js.native
  var VerticalPosition: Double = js.native
  var Width: Double = js.native
  var WidthRule: WdFrameSizeRule = js.native
  @JSName("Word.Frame_typekey")
  var WordDotFrame_typekey: Frame = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

object Frame {
  @scala.inline
  def apply(
    Application: Application,
    Borders: Borders,
    Copy: () => Unit,
    Creator: Double,
    Cut: () => Unit,
    Delete: () => Unit,
    Height: Double,
    HeightRule: WdFrameSizeRule,
    HorizontalDistanceFromText: Double,
    HorizontalPosition: Double,
    LockAnchor: Boolean,
    Parent: js.Any,
    Range: Range,
    RelativeHorizontalPosition: WdRelativeHorizontalPosition,
    RelativeVerticalPosition: WdRelativeVerticalPosition,
    Select: () => Unit,
    Shading: Shading,
    TextWrap: Boolean,
    VerticalDistanceFromText: Double,
    VerticalPosition: Double,
    Width: Double,
    WidthRule: WdFrameSizeRule,
    WordDotFrame_typekey: Frame
  ): Frame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), Delete = js.Any.fromFunction0(Delete), Height = Height.asInstanceOf[js.Any], HeightRule = HeightRule.asInstanceOf[js.Any], HorizontalDistanceFromText = HorizontalDistanceFromText.asInstanceOf[js.Any], HorizontalPosition = HorizontalPosition.asInstanceOf[js.Any], LockAnchor = LockAnchor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RelativeHorizontalPosition = RelativeHorizontalPosition.asInstanceOf[js.Any], RelativeVerticalPosition = RelativeVerticalPosition.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shading = Shading.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], VerticalDistanceFromText = VerticalDistanceFromText.asInstanceOf[js.Any], VerticalPosition = VerticalPosition.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WidthRule = WidthRule.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frame_typekey")(WordDotFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeightRule(value: WdFrameSizeRule): Self = this.set("HeightRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalDistanceFromText(value: Double): Self = this.set("HorizontalDistanceFromText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHorizontalPosition(value: Double): Self = this.set("HorizontalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockAnchor(value: Boolean): Self = this.set("LockAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("Range", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeHorizontalPosition(value: WdRelativeHorizontalPosition): Self = this.set("RelativeHorizontalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeVerticalPosition(value: WdRelativeVerticalPosition): Self = this.set("RelativeVerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => Unit): Self = this.set("Select", js.Any.fromFunction0(value))
    @scala.inline
    def setShading(value: Shading): Self = this.set("Shading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextWrap(value: Boolean): Self = this.set("TextWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalDistanceFromText(value: Double): Self = this.set("VerticalDistanceFromText", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticalPosition(value: Double): Self = this.set("VerticalPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthRule(value: WdFrameSizeRule): Self = this.set("WidthRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotFrame_typekey(value: Frame): Self = this.set("Word.Frame_typekey", value.asInstanceOf[js.Any])
  }
  
}

