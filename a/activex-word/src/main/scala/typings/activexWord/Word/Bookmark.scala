package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Bookmark")
@js.native
class Bookmark protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Column: Boolean = js.native
  val Creator: Double = js.native
  val Empty: Boolean = js.native
  var End: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Range: typings.activexWord.Word.Range = js.native
  var Start: Double = js.native
  val StoryType: WdStoryType = js.native
  @JSName("Word.Bookmark_typekey")
  var WordDotBookmark_typekey: Bookmark = js.native
  def Copy(Name: String): Bookmark = js.native
  def Delete(): Unit = js.native
  def Select(): Unit = js.native
}

