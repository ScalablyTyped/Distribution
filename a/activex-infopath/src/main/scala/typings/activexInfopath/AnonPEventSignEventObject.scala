package typings.activexInfopath

import typings.activexInfopath.InfoPath.SignEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPEventSignEventObject extends js.Object {
  val pEvent: SignEventObject
}

object AnonPEventSignEventObject {
  @scala.inline
  def apply(pEvent: SignEventObject): AnonPEventSignEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPEventSignEventObject]
  }
}

