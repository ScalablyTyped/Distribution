package typings.activexWord.global.Word

import typings.activexWord.Word.WdStoryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Bookmark")
@js.native
class Bookmark protected ()
  extends typings.activexWord.Word.Bookmark {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Column: Boolean = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Empty: Boolean = js.native
  /* CompleteClass */
  override var End: Double = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Range: typings.activexWord.Word.Range = js.native
  /* CompleteClass */
  override var Start: Double = js.native
  /* CompleteClass */
  override val StoryType: WdStoryType = js.native
  /* CompleteClass */
  @JSName("Word.Bookmark_typekey")
  override var WordDotBookmark_typekey: typings.activexWord.Word.Bookmark = js.native
  /* CompleteClass */
  override def Copy(Name: String): typings.activexWord.Word.Bookmark = js.native
  /* CompleteClass */
  override def Delete(): Unit = js.native
  /* CompleteClass */
  override def Select(): Unit = js.native
}

