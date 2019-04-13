package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationMessageTemplateType extends js.Object {
  /**
    * The default email option.
    */
  var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined
  /**
    * The email message template.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  /**
    * The email message template for sending a confirmation link to the user.
    */
  var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined
  /**
    * The subject line for the email message template.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  /**
    * The subject line for the email message template for sending a confirmation link to the user.
    */
  var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined
  /**
    * The SMS message template.
    */
  var SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
}

object VerificationMessageTemplateType {
  @scala.inline
  def apply(
    DefaultEmailOption: DefaultEmailOptionType = null,
    EmailMessage: EmailVerificationMessageType = null,
    EmailMessageByLink: EmailVerificationMessageByLinkType = null,
    EmailSubject: EmailVerificationSubjectType = null,
    EmailSubjectByLink: EmailVerificationSubjectByLinkType = null,
    SmsMessage: SmsVerificationMessageType = null
  ): VerificationMessageTemplateType = {
    val __obj = js.Dynamic.literal()
    if (DefaultEmailOption != null) __obj.updateDynamic("DefaultEmailOption")(DefaultEmailOption.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage)
    if (EmailMessageByLink != null) __obj.updateDynamic("EmailMessageByLink")(EmailMessageByLink)
    if (EmailSubject != null) __obj.updateDynamic("EmailSubject")(EmailSubject)
    if (EmailSubjectByLink != null) __obj.updateDynamic("EmailSubjectByLink")(EmailSubjectByLink)
    if (SmsMessage != null) __obj.updateDynamic("SmsMessage")(SmsMessage)
    __obj.asInstanceOf[VerificationMessageTemplateType]
  }
}

