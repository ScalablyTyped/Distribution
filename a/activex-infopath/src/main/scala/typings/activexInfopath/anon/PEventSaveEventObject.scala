package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.SaveEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEventSaveEventObject extends js.Object {
  val pEvent: SaveEventObject
}

object PEventSaveEventObject {
  @scala.inline
  def apply(pEvent: SaveEventObject): PEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSaveEventObject]
  }
}

