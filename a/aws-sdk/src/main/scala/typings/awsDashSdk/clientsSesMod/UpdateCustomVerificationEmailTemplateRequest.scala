package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typings.awsDashSdk.clientsSesMod.FailureRedirectionURL] = js.undefined
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typings.awsDashSdk.clientsSesMod.SuccessRedirectionURL] = js.undefined
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: js.UndefOr[typings.awsDashSdk.clientsSesMod.TemplateContent] = js.undefined
  /**
    * The name of the custom verification email template that you want to update.
    */
  var TemplateName: typings.awsDashSdk.clientsSesMod.TemplateName
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.undefined
}

object UpdateCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(
    TemplateName: TemplateName,
    FailureRedirectionURL: FailureRedirectionURL = null,
    FromEmailAddress: FromAddress = null,
    SuccessRedirectionURL: SuccessRedirectionURL = null,
    TemplateContent: TemplateContent = null,
    TemplateSubject: Subject = null
  ): UpdateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
    if (FailureRedirectionURL != null) __obj.updateDynamic("FailureRedirectionURL")(FailureRedirectionURL)
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress)
    if (SuccessRedirectionURL != null) __obj.updateDynamic("SuccessRedirectionURL")(SuccessRedirectionURL)
    if (TemplateContent != null) __obj.updateDynamic("TemplateContent")(TemplateContent)
    if (TemplateSubject != null) __obj.updateDynamic("TemplateSubject")(TemplateSubject)
    __obj.asInstanceOf[UpdateCustomVerificationEmailTemplateRequest]
  }
}

