package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuppressedDestinationAttributes extends js.Object {
  /**
    * A unique identifier that's generated when an email address is added to the suppression list for your account.
    */
  var FeedbackId: js.UndefOr[typings.awsDashSdk.clientsSesv2Mod.FeedbackId] = js.native
  /**
    * The unique identifier of the email message that caused the email address to be added to the suppression list for your account.
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
}

object SuppressedDestinationAttributes {
  @scala.inline
  def apply(FeedbackId: FeedbackId = null, MessageId: OutboundMessageId = null): SuppressedDestinationAttributes = {
    val __obj = js.Dynamic.literal()
    if (FeedbackId != null) __obj.updateDynamic("FeedbackId")(FeedbackId.asInstanceOf[js.Any])
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressedDestinationAttributes]
  }
}

