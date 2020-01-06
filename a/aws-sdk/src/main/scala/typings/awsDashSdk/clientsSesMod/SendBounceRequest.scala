package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBounceRequest extends js.Object {
  /**
    * The address to use in the "From" header of the bounce message. This must be an identity that you have verified with Amazon SES.
    */
  var BounceSender: Address = js.native
  /**
    * This parameter is used only for sending authorization. It is the ARN of the identity that is associated with the sending authorization policy that permits you to use the address in the "From" header of the bounce. For more information about sending authorization, see the Amazon SES Developer Guide.
    */
  var BounceSenderArn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * A list of recipients of the bounced message, including the information required to create the Delivery Status Notifications (DSNs) for the recipients. You must specify at least one BouncedRecipientInfo in the list.
    */
  var BouncedRecipientInfoList: typings.awsDashSdk.clientsSesMod.BouncedRecipientInfoList = js.native
  /**
    * Human-readable text for the bounce message to explain the failure. If not specified, the text will be auto-generated based on the bounced recipient information.
    */
  var Explanation: js.UndefOr[typings.awsDashSdk.clientsSesMod.Explanation] = js.native
  /**
    * Message-related DSN fields. If not specified, Amazon SES will choose the values.
    */
  var MessageDsn: js.UndefOr[typings.awsDashSdk.clientsSesMod.MessageDsn] = js.native
  /**
    * The message ID of the message to be bounced.
    */
  var OriginalMessageId: MessageId = js.native
}

object SendBounceRequest {
  @scala.inline
  def apply(
    BounceSender: Address,
    BouncedRecipientInfoList: BouncedRecipientInfoList,
    OriginalMessageId: MessageId,
    BounceSenderArn: AmazonResourceName = null,
    Explanation: Explanation = null,
    MessageDsn: MessageDsn = null
  ): SendBounceRequest = {
    val __obj = js.Dynamic.literal(BounceSender = BounceSender.asInstanceOf[js.Any], BouncedRecipientInfoList = BouncedRecipientInfoList.asInstanceOf[js.Any], OriginalMessageId = OriginalMessageId.asInstanceOf[js.Any])
    if (BounceSenderArn != null) __obj.updateDynamic("BounceSenderArn")(BounceSenderArn.asInstanceOf[js.Any])
    if (Explanation != null) __obj.updateDynamic("Explanation")(Explanation.asInstanceOf[js.Any])
    if (MessageDsn != null) __obj.updateDynamic("MessageDsn")(MessageDsn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBounceRequest]
  }
}

