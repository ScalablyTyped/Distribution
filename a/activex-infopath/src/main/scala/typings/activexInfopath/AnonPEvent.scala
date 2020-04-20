package typings.activexInfopath

import typings.activexInfopath.InfoPath.DocActionEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPEvent extends js.Object {
  val pEvent: DocActionEventObject
}

object AnonPEvent {
  @scala.inline
  def apply(pEvent: DocActionEventObject): AnonPEvent = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEvent]
  }
}

