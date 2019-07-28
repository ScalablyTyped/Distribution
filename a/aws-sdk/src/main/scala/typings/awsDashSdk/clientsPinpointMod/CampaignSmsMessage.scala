package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSmsMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The type of SMS message. Valid values are: TRANSACTIONAL, the message is critical or time-sensitive, such as a one-time password that supports a customer transaction; and, PROMOTIONAL, the message isn't critical or time-sensitive, such as a marketing message.
    */
  var MessageType: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageType] = js.undefined
  /**
    * The sender ID to display on recipients' devices when they receive the SMS message.
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

