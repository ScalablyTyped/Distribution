package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelVarset extends Event {
  /**
    * The channel on which the variable was set. If missing, the variable is a global variable.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  /**
    * The new value of the variable.
    */
  var value: String
  /**
    * The variable that changed.
    */
  var variable: String
}

object ChannelVarset {
  @scala.inline
  def apply(
    application: String,
    timestamp: Date,
    `type`: String,
    value: String,
    variable: String,
    asterisk_id: String = null,
    channel: Channel = null
  ): ChannelVarset = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelVarset]
  }
}

