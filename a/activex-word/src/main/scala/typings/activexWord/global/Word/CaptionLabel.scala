package typings.activexWord.global.Word

import typings.activexWord.Word.WdCaptionLabelID
import typings.activexWord.Word.WdCaptionNumberStyle
import typings.activexWord.Word.WdCaptionPosition
import typings.activexWord.Word.WdSeparatorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.CaptionLabel")
@js.native
class CaptionLabel protected ()
  extends typings.activexWord.Word.CaptionLabel {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val BuiltIn: Boolean = js.native
  /* CompleteClass */
  override var ChapterStyleLevel: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val ID: WdCaptionLabelID = js.native
  /* CompleteClass */
  override var IncludeChapterNumber: Boolean = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override var NumberStyle: WdCaptionNumberStyle = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Position: WdCaptionPosition = js.native
  /* CompleteClass */
  override var Separator: WdSeparatorType = js.native
  /* CompleteClass */
  @JSName("Word.CaptionLabel_typekey")
  override var WordDotCaptionLabel_typekey: typings.activexWord.Word.CaptionLabel = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
}

