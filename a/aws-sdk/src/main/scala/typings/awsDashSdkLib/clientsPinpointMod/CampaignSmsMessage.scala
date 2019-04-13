package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSmsMessage extends js.Object {
  /**
    * The SMS text body.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * Is this is a transactional SMS message, otherwise a promotional message.
    */
  var MessageType: js.UndefOr[MessageType] = js.undefined
  /**
    * Sender ID of sent message.
    */
  var SenderId: js.UndefOr[__string] = js.undefined
}

object CampaignSmsMessage {
  @scala.inline
  def apply(Body: __string = null, MessageType: MessageType = null, SenderId: __string = null): CampaignSmsMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId)
    __obj.asInstanceOf[CampaignSmsMessage]
  }
}

