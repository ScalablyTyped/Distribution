package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.MediaBookmarks")
@js.native
class MediaBookmarks protected () extends js.Object {
  val Count: Double = js.native
  @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks = js.native
  def Add(Position: Double, Name: String): MediaBookmark = js.native
  def Item(Index: Double): MediaBookmark = js.native
}

