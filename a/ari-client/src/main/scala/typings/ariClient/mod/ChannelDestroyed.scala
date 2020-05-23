package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDestroyed extends Event {
  /* Properties */
  var cause: Double
  var cause_txt: String
  var channel: Channel
}

object ChannelDestroyed {
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    cause_txt: String,
    channel: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null
  ): ChannelDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], cause_txt = cause_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDestroyed]
  }
}

