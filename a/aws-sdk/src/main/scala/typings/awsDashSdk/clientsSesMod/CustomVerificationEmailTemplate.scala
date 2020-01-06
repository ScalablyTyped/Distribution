package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomVerificationEmailTemplate extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[typings.awsDashSdk.clientsSesMod.FailureRedirectionURL] = js.native
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.native
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[typings.awsDashSdk.clientsSesMod.SuccessRedirectionURL] = js.native
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[typings.awsDashSdk.clientsSesMod.TemplateName] = js.native
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.native
}

object CustomVerificationEmailTemplate {
  @scala.inline
  def apply(
    FailureRedirectionURL: FailureRedirectionURL = null,
    FromEmailAddress: FromAddress = null,
    SuccessRedirectionURL: SuccessRedirectionURL = null,
    TemplateName: TemplateName = null,
    TemplateSubject: Subject = null
  ): CustomVerificationEmailTemplate = {
    val __obj = js.Dynamic.literal()
    if (FailureRedirectionURL != null) __obj.updateDynamic("FailureRedirectionURL")(FailureRedirectionURL.asInstanceOf[js.Any])
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress.asInstanceOf[js.Any])
    if (SuccessRedirectionURL != null) __obj.updateDynamic("SuccessRedirectionURL")(SuccessRedirectionURL.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (TemplateSubject != null) __obj.updateDynamic("TemplateSubject")(TemplateSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomVerificationEmailTemplate]
  }
}

