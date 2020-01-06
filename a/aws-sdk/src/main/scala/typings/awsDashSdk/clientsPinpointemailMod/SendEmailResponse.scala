package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailResponse extends js.Object {
  /**
    * A unique identifier for the message that is generated when Amazon Pinpoint accepts the message.  It is possible for Amazon Pinpoint to accept a message without sending it. This can happen when the message you're trying to send has an attachment doesn't pass a virus check, or when you send a templated email that contains invalid personalization content, for example. 
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}

object SendEmailResponse {
  @scala.inline
  def apply(MessageId: OutboundMessageId = null): SendEmailResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEmailResponse]
  }
}

