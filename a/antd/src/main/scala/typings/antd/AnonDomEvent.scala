package typings.antd

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEvent extends js.Object {
  var domEvent: MouseEvent
  var key: String
}

object AnonDomEvent {
  @scala.inline
  def apply(domEvent: MouseEvent, key: String): AnonDomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEvent]
  }
}

