package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBookmark extends js.Object {
  val Index: Double
  val Name: String
  val Position: Double
  @JSName("PowerPoint.MediaBookmark_typekey")
  var PowerPointDotMediaBookmark_typekey: MediaBookmark
  def Delete(): Unit
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
}

