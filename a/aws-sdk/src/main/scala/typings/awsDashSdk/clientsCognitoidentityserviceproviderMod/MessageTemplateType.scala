package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTemplateType extends js.Object {
  /**
    * The message template for email messages.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  /**
    * The subject line for email messages.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
}

object MessageTemplateType {
  @scala.inline
  def apply(
    EmailMessage: EmailVerificationMessageType = null,
    EmailSubject: EmailVerificationSubjectType = null,
    SMSMessage: SmsVerificationMessageType = null
  ): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (EmailSubject != null) __obj.updateDynamic("EmailSubject")(EmailSubject)
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage)
    __obj.asInstanceOf[MessageTemplateType]
  }
}

