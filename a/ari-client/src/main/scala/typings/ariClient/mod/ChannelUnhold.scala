package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelUnhold extends Event {
  /**
    * The channel that initiated the unhold event.
    */
  var channel: Channel
}

object ChannelUnhold {
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: Date, `type`: String, asterisk_id: String = null): ChannelUnhold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUnhold]
  }
}

