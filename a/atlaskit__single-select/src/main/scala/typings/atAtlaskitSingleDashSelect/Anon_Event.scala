package typings.atAtlaskitSingleDashSelect

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[_, Event]
  var isOpen: Boolean
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[_, Event], isOpen: Boolean): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

