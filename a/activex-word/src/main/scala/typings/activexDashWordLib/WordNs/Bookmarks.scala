package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Bookmarks")
@js.native
class Bookmarks protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DefaultSorting: WdBookmarkSortBy = js.native
  val Parent: js.Any = js.native
  var ShowHidden: scala.Boolean = js.native
  var `Word.Bookmarks_typekey`: Bookmarks = js.native
  def Add(Name: java.lang.String): Bookmark = js.native
  def Add(Name: java.lang.String, Range: js.Any): Bookmark = js.native
  def Exists(Name: java.lang.String): scala.Boolean = js.native
  def Item(Index: java.lang.String): Bookmark = js.native
  def Item(Index: scala.Double): Bookmark = js.native
}

