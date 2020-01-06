package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageTemplateType extends js.Object {
  /**
    * The message template for email messages.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.native
  /**
    * The subject line for email messages.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.native
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.native
}

object MessageTemplateType {
  @scala.inline
  def apply(
    EmailMessage: EmailVerificationMessageType = null,
    EmailSubject: EmailVerificationSubjectType = null,
    SMSMessage: SmsVerificationMessageType = null
  ): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (EmailSubject != null) __obj.updateDynamic("EmailSubject")(EmailSubject.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageTemplateType]
  }
}

