package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelStateChange extends js.Object {
  var current: ChannelState
  var previous: ChannelState
  var reason: js.UndefOr[ErrorInfo] = js.undefined
  var resumed: scala.Boolean
}

object ChannelStateChange {
  @scala.inline
  def apply(current: ChannelState, previous: ChannelState, resumed: scala.Boolean, reason: ErrorInfo = null): ChannelStateChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.updateDynamic("resumed")(resumed)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[ChannelStateChange]
  }
}

