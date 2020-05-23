package typings.activexWord.global.Word

import typings.activexWord.Word.WdListLevelAlignment
import typings.activexWord.Word.WdListNumberStyle
import typings.activexWord.Word.WdTrailingCharacter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ListLevel")
@js.native
class ListLevel protected ()
  extends typings.activexWord.Word.ListLevel {
  /* CompleteClass */
  override var Alignment: WdListLevelAlignment = js.native
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Font: typings.activexWord.Word.Font = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override var LinkedStyle: String = js.native
  /* CompleteClass */
  override var NumberFormat: String = js.native
  /* CompleteClass */
  override var NumberPosition: Double = js.native
  /* CompleteClass */
  override var NumberStyle: WdListNumberStyle = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PictureBullet: typings.activexWord.Word.InlineShape = js.native
  /* CompleteClass */
  override var ResetOnHigher: Double = js.native
  /* CompleteClass */
  override var ResetOnHigherOld: Boolean = js.native
  /* CompleteClass */
  override var StartAt: Double = js.native
  /* CompleteClass */
  override var TabPosition: Double = js.native
  /* CompleteClass */
  override var TextPosition: Double = js.native
  /* CompleteClass */
  override var TrailingCharacter: WdTrailingCharacter = js.native
  /* CompleteClass */
  @JSName("Word.ListLevel_typekey")
  override var WordDotListLevel_typekey: typings.activexWord.Word.ListLevel = js.native
  /* CompleteClass */
  override def ApplyPictureBullet(FileName: String): typings.activexWord.Word.InlineShape = js.native
}

