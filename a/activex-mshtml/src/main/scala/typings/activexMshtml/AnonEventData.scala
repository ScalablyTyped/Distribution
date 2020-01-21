package typings.activexMshtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventData extends js.Object {
  val eventData: js.Any
  val name: String
}

object AnonEventData {
  @scala.inline
  def apply(eventData: js.Any, name: String): AnonEventData = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventData]
  }
}

