package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaBookmarks extends js.Object {
  val Count: Double = js.native
  @JSName("PowerPoint.MediaBookmarks_typekey")
  var PowerPointDotMediaBookmarks_typekey: MediaBookmarks = js.native
  def Add(Position: Double, Name: String): MediaBookmark = js.native
  def Item(Index: Double): MediaBookmark = js.native
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
  @scala.inline
  implicit class MediaBookmarksOps[Self <: MediaBookmarks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: (Double, String) => MediaBookmark): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => MediaBookmark): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setPowerPointDotMediaBookmarks_typekey(value: MediaBookmarks): Self = this.set("PowerPoint.MediaBookmarks_typekey", value.asInstanceOf[js.Any])
  }
  
}

