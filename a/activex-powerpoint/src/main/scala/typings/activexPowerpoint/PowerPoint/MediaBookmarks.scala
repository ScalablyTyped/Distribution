package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBookmarks extends js.Object {
  val Count: Double
  @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks
  def Add(Position: Double, Name: String): MediaBookmark
  def Item(Index: Double): MediaBookmark
}

object MediaBookmarks {
  @scala.inline
  def apply(
    Add: (Double, String) => MediaBookmark,
    Count: Double,
    Item: Double => MediaBookmark,
    PowerPointDotMediaBookmarks_typekey: MediaBookmarks
  ): MediaBookmarks = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("PowerPoint.MediaBookmarks_typekey")(PowerPointDotMediaBookmarks_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmarks]
  }
}

