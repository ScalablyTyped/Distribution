package typings.atlaskitSingleSelect.anon

import typings.react.mod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: SyntheticEvent[_, typings.std.Event]
  var isOpen: Boolean
}

object Event {
  @scala.inline
  def apply(event: SyntheticEvent[_, typings.std.Event], isOpen: Boolean): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

