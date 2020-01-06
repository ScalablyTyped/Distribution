package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationOptions extends js.Object {
  /**
    * Text value to be included in the email body.
    */
  var EmailMessage: js.UndefOr[MessageType] = js.native
  /**
    * Boolean value to indicate an email notification should be sent to the receipients.
    */
  var SendEmail: js.UndefOr[BooleanType] = js.native
}

object NotificationOptions {
  @scala.inline
  def apply(EmailMessage: MessageType = null, SendEmail: js.UndefOr[Boolean] = js.undefined): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(SendEmail)) __obj.updateDynamic("SendEmail")(SendEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

