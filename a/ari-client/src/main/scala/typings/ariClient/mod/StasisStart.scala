package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StasisStart extends Event {
  /* Properties */
  var args: String | js.Array[String]
  var channel: Channel
  var replace_channel: js.UndefOr[Channel] = js.undefined
}

object StasisStart {
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    replace_channel: Channel = null
  ): StasisStart = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (replace_channel != null) __obj.updateDynamic("replace_channel")(replace_channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[StasisStart]
  }
}

