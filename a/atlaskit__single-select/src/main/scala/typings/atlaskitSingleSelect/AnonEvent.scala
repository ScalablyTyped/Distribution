package typings.atlaskitSingleSelect

import typings.react.mod.SyntheticEvent
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[_, Event_]
  var isOpen: Boolean
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[_, Event_], isOpen: Boolean): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEvent]
  }
}

