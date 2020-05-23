package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConnectedLine extends Event {
  /* Properties */
  var channel: Channel
}

object ChannelConnectedLine {
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: Date, `type`: String, asterisk_id: String = null): ChannelConnectedLine = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConnectedLine]
  }
}

