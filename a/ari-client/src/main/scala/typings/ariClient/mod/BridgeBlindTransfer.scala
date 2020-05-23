package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeBlindTransfer extends Event {
  var bridge: Bridge
  /* Properties */
  var channel: Channel
  var context: String
  var exten: String
  var is_external: Boolean
  var replace_channel: js.UndefOr[Channel] = js.undefined
  var result: String
  var transferee: js.UndefOr[Channel] = js.undefined
}

object BridgeBlindTransfer {
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    channel: Channel,
    context: String,
    exten: String,
    is_external: Boolean,
    result: String,
    timestamp: Date,
    `type`: String,
    asterisk_id: String = null,
    replace_channel: Channel = null,
    transferee: Channel = null
  ): BridgeBlindTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (replace_channel != null) __obj.updateDynamic("replace_channel")(replace_channel.asInstanceOf[js.Any])
    if (transferee != null) __obj.updateDynamic("transferee")(transferee.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeBlindTransfer]
  }
}

