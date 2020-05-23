package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeAttendedTransfer extends Event {
  var destination_application: String
  var destination_bridge: String
  var destination_link_first_leg: Channel
  var destination_link_second_leg: Channel
  var destination_threeway_bridge: Bridge
  var destination_threeway_channel: Channel
  var destination_type: String
  var is_external: Boolean
  var replace_channel: js.UndefOr[Channel] = js.undefined
  var result: String
  var transfer_target: js.UndefOr[Channel] = js.undefined
  var transferee: js.UndefOr[Channel] = js.undefined
  /* Properties */
  var transferer_first_leg: Channel
  var transferer_first_leg_bridge: Bridge
  var transferer_second_leg: Channel
  var transferer_second_leg_bridge: Bridge
}

object BridgeAttendedTransfer {
  @scala.inline
  def apply(
    application: String,
    destination_application: String,
    destination_bridge: String,
    destination_link_first_leg: Channel,
    destination_link_second_leg: Channel,
    destination_threeway_bridge: Bridge,
    destination_threeway_channel: Channel,
    destination_type: String,
    is_external: Boolean,
    result: String,
    timestamp: Date,
    transferer_first_leg: Channel,
    transferer_first_leg_bridge: Bridge,
    transferer_second_leg: Channel,
    transferer_second_leg_bridge: Bridge,
    `type`: String,
    asterisk_id: String = null,
    replace_channel: Channel = null,
    transfer_target: Channel = null,
    transferee: Channel = null
  ): BridgeAttendedTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], destination_application = destination_application.asInstanceOf[js.Any], destination_bridge = destination_bridge.asInstanceOf[js.Any], destination_link_first_leg = destination_link_first_leg.asInstanceOf[js.Any], destination_link_second_leg = destination_link_second_leg.asInstanceOf[js.Any], destination_threeway_bridge = destination_threeway_bridge.asInstanceOf[js.Any], destination_threeway_channel = destination_threeway_channel.asInstanceOf[js.Any], destination_type = destination_type.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transferer_first_leg = transferer_first_leg.asInstanceOf[js.Any], transferer_first_leg_bridge = transferer_first_leg_bridge.asInstanceOf[js.Any], transferer_second_leg = transferer_second_leg.asInstanceOf[js.Any], transferer_second_leg_bridge = transferer_second_leg_bridge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (asterisk_id != null) __obj.updateDynamic("asterisk_id")(asterisk_id.asInstanceOf[js.Any])
    if (replace_channel != null) __obj.updateDynamic("replace_channel")(replace_channel.asInstanceOf[js.Any])
    if (transfer_target != null) __obj.updateDynamic("transfer_target")(transfer_target.asInstanceOf[js.Any])
    if (transferee != null) __obj.updateDynamic("transferee")(transferee.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeAttendedTransfer]
  }
}

