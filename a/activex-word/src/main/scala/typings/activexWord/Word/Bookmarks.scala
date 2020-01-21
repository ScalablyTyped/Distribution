package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Bookmarks")
@js.native
class Bookmarks protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DefaultSorting: WdBookmarkSortBy = js.native
  val Parent: js.Any = js.native
  var ShowHidden: Boolean = js.native
  @JSName("Word.Bookmarks_typekey")
  var WordDotBookmarks_typekey: Bookmarks = js.native
  def Add(Name: String): Bookmark = js.native
  def Add(Name: String, Range: js.Any): Bookmark = js.native
  def Exists(Name: String): Boolean = js.native
  def Item(Index: String): Bookmark = js.native
  def Item(Index: Double): Bookmark = js.native
}

