package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomVerificationEmailTemplateResponse extends js.Object {
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
    * The content of the custom verification email.
    */
  var TemplateContent: js.UndefOr[typings.awsDashSdk.clientsSesMod.TemplateContent] = js.undefined
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[typings.awsDashSdk.clientsSesMod.TemplateName] = js.undefined
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.undefined
}

object GetCustomVerificationEmailTemplateResponse {
  @scala.inline
  def apply(
    FailureRedirectionURL: FailureRedirectionURL = null,
    FromEmailAddress: FromAddress = null,
    SuccessRedirectionURL: SuccessRedirectionURL = null,
    TemplateContent: TemplateContent = null,
    TemplateName: TemplateName = null,
    TemplateSubject: Subject = null
  ): GetCustomVerificationEmailTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (FailureRedirectionURL != null) __obj.updateDynamic("FailureRedirectionURL")(FailureRedirectionURL)
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress)
    if (SuccessRedirectionURL != null) __obj.updateDynamic("SuccessRedirectionURL")(SuccessRedirectionURL)
    if (TemplateContent != null) __obj.updateDynamic("TemplateContent")(TemplateContent)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (TemplateSubject != null) __obj.updateDynamic("TemplateSubject")(TemplateSubject)
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateResponse]
  }
}

