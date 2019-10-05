package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStateChange extends js.Object {
  var current: ChannelState
  var previous: ChannelState
  var reason: js.UndefOr[ErrorInfo] = js.undefined
  var resumed: Boolean
}

object ChannelStateChange {
  @scala.inline
  def apply(current: ChannelState, previous: ChannelState, resumed: Boolean, reason: ErrorInfo = null): ChannelStateChange = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], resumed = resumed)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ChannelStateChange]
  }
}

