package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BridgeBlindTransfer extends Event {
  /**
    * The bridge being transferred.
    */
  var bridge: Bridge
  /**
    * The channel performing the blind transfer.
    */
  var channel: Channel
  /**
    * The context transferred to.
    */
  var context: String
  /**
    * The extension transferred to.
    */
  var exten: String
  /**
    * Whether the transfer was externally initiated or not.
    */
  var is_external: Boolean
  /**
    * The channel that is replacing transferer when the transferee(s) can not be transferred directly.
    */
  var replace_channel: js.UndefOr[Channel] = js.undefined
  /**
    * The result of the transfer attempt.
    */
  var result: String
  /**
    * The channel that is being transferred.
    */
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

