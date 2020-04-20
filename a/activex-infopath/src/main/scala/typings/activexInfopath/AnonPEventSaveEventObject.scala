package typings.activexInfopath

import typings.activexInfopath.InfoPath.SaveEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPEventSaveEventObject extends js.Object {
  val pEvent: SaveEventObject
}

object AnonPEventSaveEventObject {
  @scala.inline
  def apply(pEvent: SaveEventObject): AnonPEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventSaveEventObject]
  }
}

