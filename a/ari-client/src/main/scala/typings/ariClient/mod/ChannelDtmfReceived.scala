package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDtmfReceived extends Event {
  /**
    * The channel on which DTMF was received.
    */
  var channel: Channel = js.native
  /**
    * DTMF digit received (0-9, A-E, # or *).
    */
  var digit: String = js.native
  /**
    * Number of milliseconds DTMF was received.
    */
  var duration_ms: Double = js.native
}

object ChannelDtmfReceived {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    digit: String,
    duration_ms: Double,
    timestamp: Date,
    `type`: String
  ): ChannelDtmfReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDtmfReceived]
  }
  @scala.inline
  implicit class ChannelDtmfReceivedOps[Self <: ChannelDtmfReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigit(value: String): Self = this.set("digit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration_ms(value: Double): Self = this.set("duration_ms", value.asInstanceOf[js.Any])
  }
  
}

