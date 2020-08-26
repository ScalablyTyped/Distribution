package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaBookmark extends js.Object {
  val Index: Double = js.native
  val Name: String = js.native
  val Position: Double = js.native
  @JSName("PowerPoint.MediaBookmark_typekey")
  var PowerPointDotMediaBookmark_typekey: MediaBookmark = js.native
  def Delete(): Unit = js.native
}

object MediaBookmark {
  @scala.inline
  def apply(
    Delete: () => Unit,
    Index: Double,
    Name: String,
    Position: Double,
    PowerPointDotMediaBookmark_typekey: MediaBookmark
  ): MediaBookmark = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.MediaBookmark_typekey")(PowerPointDotMediaBookmark_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBookmark]
  }
  @scala.inline
  implicit class MediaBookmarkOps[Self <: MediaBookmark] (val x: Self) extends AnyVal {
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
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotMediaBookmark_typekey(value: MediaBookmark): Self = this.set("PowerPoint.MediaBookmark_typekey", value.asInstanceOf[js.Any])
  }
  
}

