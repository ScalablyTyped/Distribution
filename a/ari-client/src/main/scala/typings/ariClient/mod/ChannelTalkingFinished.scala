package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelTalkingFinished extends Event {
  /**
    * The channel on which talking completed.
    */
  var channel: Channel
  /**
    * The length of time, in milliseconds, that talking was detected on the channel.
    */
  var duration: Double
}

object ChannelTalkingFinished {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    duration: Double,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelTalkingFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTalkingFinished]
  }
}

