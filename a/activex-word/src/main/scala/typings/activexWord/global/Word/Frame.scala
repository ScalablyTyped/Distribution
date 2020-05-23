package typings.activexWord.global.Word

import typings.activexWord.Word.WdFrameSizeRule
import typings.activexWord.Word.WdRelativeHorizontalPosition
import typings.activexWord.Word.WdRelativeVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Frame")
@js.native
class Frame protected ()
  extends typings.activexWord.Word.Frame {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var Borders: typings.activexWord.Word.Borders = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Height: Double = js.native
  /* CompleteClass */
  override var HeightRule: WdFrameSizeRule = js.native
  /* CompleteClass */
  override var HorizontalDistanceFromText: Double = js.native
  /* CompleteClass */
  override var HorizontalPosition: Double = js.native
  /* CompleteClass */
  override var LockAnchor: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override var RelativeHorizontalPosition: WdRelativeHorizontalPosition = js.native
  /* CompleteClass */
  override var RelativeVerticalPosition: WdRelativeVerticalPosition = js.native
  /* CompleteClass */
  override val Shading: typings.activexWord.Word.Shading = js.native
  /* CompleteClass */
  override var TextWrap: Boolean = js.native
  /* CompleteClass */
  override var VerticalDistanceFromText: Double = js.native
  /* CompleteClass */
  override var VerticalPosition: Double = js.native
  /* CompleteClass */
  override var Width: Double = js.native
  /* CompleteClass */
  override var WidthRule: WdFrameSizeRule = js.native
  /* CompleteClass */
  @JSName("Word.Frame_typekey")
  override var WordDotFrame_typekey: typings.activexWord.Word.Frame = js.native
  /* CompleteClass */
  override def Copy(): Unit = js.native
  /* CompleteClass */
  override def Cut(): Unit = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Select(): Unit = js.native
}

