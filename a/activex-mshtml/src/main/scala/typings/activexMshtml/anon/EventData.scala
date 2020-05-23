package typings.activexMshtml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  val eventData: js.Any
  val name: String
}

object EventData {
  @scala.inline
  def apply(eventData: js.Any, name: String): EventData = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

