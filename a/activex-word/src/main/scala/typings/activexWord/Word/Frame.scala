package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frame")
@js.native
class Frame protected () extends js.Object {
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

