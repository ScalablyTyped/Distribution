package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelUserevent extends Event {
  /**
    * A bridge that is signaled with the user event.
    */
  var bridge: js.UndefOr[Bridge] = js.undefined
  /**
    * A channel that is signaled with the user event.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  /**
    * A endpoint that is signaled with the user event.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  /**
    * The name of the user event.
    */
  var eventname: String
  /**
    * Custom Userevent data.
    */
  var userevent: IndexableObject
}

object ChannelUserevent {
  @scala.inline
  def apply(
    application: String,
    eventname: String,
    timestamp: Date,
    `type`: String,
    userevent: IndexableObject,
    asterisk_id: String = null,
    bridge: Bridge = null,
    channel: Channel = null,
    endpoint: Endpoint = null
  ): ChannelUserevent = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventname = eventname.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userevent = userevent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (bridge != null) __obj.updateDynamic("bridge")(bridge.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUserevent]
  }
}

