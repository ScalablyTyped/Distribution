package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHangupRequest extends Event {
  /**
    * Integer representation of the cause of the hangup.
    */
  var cause: Double
  /**
    * The channel on which the hangup was requested.
    */
  var channel: Channel
  /**
    * Whether the hangup request was a soft hangup request.
    */
  var soft: Boolean
}

object ChannelHangupRequest {
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    channel: Channel,
    soft: Boolean,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelHangupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], soft = soft.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHangupRequest]
  }
}

