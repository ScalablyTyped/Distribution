package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDtmfReceived extends Event {
  /**
    * The channel on which DTMF was received.
    */
  var channel: Channel
  /**
    * DTMF digit received (0-9, A-E, # or *).
    */
  var digit: String
  /**
    * Number of milliseconds DTMF was received.
    */
  var duration_ms: Double
}

object ChannelDtmfReceived {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    digit: String,
    duration_ms: Double,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelDtmfReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDtmfReceived]
  }
}

