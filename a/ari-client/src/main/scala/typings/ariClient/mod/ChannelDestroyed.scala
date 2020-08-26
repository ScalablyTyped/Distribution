package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDestroyed extends Event {
  /**
    * Integer representation of the cause of the hangup.
    */
  var cause: Double = js.native
  /**
    * Text representation of the cause of the hangup.
    */
  var cause_txt: String = js.native
  /**
    * Channel.
    */
  var channel: Channel = js.native
}

object ChannelDestroyed {
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    cause_txt: String,
    channel: Channel,
    timestamp: Date,
    `type`: String
  ): ChannelDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], cause_txt = cause_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDestroyed]
  }
  @scala.inline
  implicit class ChannelDestroyedOps[Self <: ChannelDestroyed] (val x: Self) extends AnyVal {
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
    def setCause(value: Double): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def setCause_txt(value: String): Self = this.set("cause_txt", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

