package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCallerId extends Event {
  /**
    * The integer representation of the Caller Presentation value.
    */
  var caller_presentation: Double = js.native
  /**
    * The text representation of the Caller Presentation value.
    */
  var caller_presentation_txt: String = js.native
  /**
    * The channel that changed Caller ID.
    */
  var channel: Channel = js.native
}

object ChannelCallerId {
  @scala.inline
  def apply(
    application: String,
    caller_presentation: Double,
    caller_presentation_txt: String,
    channel: Channel,
    timestamp: Date,
    `type`: String
  ): ChannelCallerId = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], caller_presentation = caller_presentation.asInstanceOf[js.Any], caller_presentation_txt = caller_presentation_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCallerId]
  }
  @scala.inline
  implicit class ChannelCallerIdOps[Self <: ChannelCallerId] (val x: Self) extends AnyVal {
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
    def setCaller_presentation(value: Double): Self = this.set("caller_presentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaller_presentation_txt(value: String): Self = this.set("caller_presentation_txt", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}

