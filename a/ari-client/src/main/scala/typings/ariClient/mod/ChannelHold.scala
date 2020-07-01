package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHold extends Event {
  /**
    * The channel that initiated the hold event.
    */
  var channel: Channel
  /**
    * The music on hold class that the initiator requested.
    */
  var musicclass: js.UndefOr[String] = js.undefined
}

object ChannelHold {
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    musicclass: String = null
  ): ChannelHold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (musicclass != null) __obj.updateDynamic("musicclass")(musicclass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHold]
  }
}

