package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Borders: typings.activexWord.Word.Borders
  val Creator: Double
  var Height: Double
  var HeightRule: WdFrameSizeRule
  var HorizontalDistanceFromText: Double
  var HorizontalPosition: Double
  var LockAnchor: Boolean
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  var RelativeHorizontalPosition: WdRelativeHorizontalPosition
  var RelativeVerticalPosition: WdRelativeVerticalPosition
  val Shading: typings.activexWord.Word.Shading
  var TextWrap: Boolean
  var VerticalDistanceFromText: Double
  var VerticalPosition: Double
  var Width: Double
  var WidthRule: WdFrameSizeRule
  @JSName("Word.Frame_typekey")
  var WordDotFrame_typekey: Frame
  def Copy(): Unit
  def Cut(): Unit
  def Delete(): Unit
  def Select(): Unit
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
}

