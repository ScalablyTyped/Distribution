package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCallerId extends Event {
  /**
    * The integer representation of the Caller Presentation value.
    */
  var caller_presentation: Double
  /**
    * The text representation of the Caller Presentation value.
    */
  var caller_presentation_txt: String
  /**
    * The channel that changed Caller ID.
    */
  var channel: Channel
}

object ChannelCallerId {
  @scala.inline
  def apply(
    application: String,
    caller_presentation: Double,
    caller_presentation_txt: String,
    channel: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelCallerId = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], caller_presentation = caller_presentation.asInstanceOf[js.Any], caller_presentation_txt = caller_presentation_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCallerId]
  }
}

