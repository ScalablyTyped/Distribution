package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  /**
    * Text value to be included in the email body.
    */
  var EmailMessage: js.UndefOr[MessageType] = js.undefined
  /**
    * Boolean value to indicate an email notification should be sent to the receipients.
    */
  var SendEmail: js.UndefOr[BooleanType] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(EmailMessage: MessageType = null, SendEmail: js.UndefOr[Boolean] = js.undefined): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (!js.isUndefined(SendEmail)) __obj.updateDynamic("SendEmail")(SendEmail)
    __obj.asInstanceOf[NotificationOptions]
  }
}

