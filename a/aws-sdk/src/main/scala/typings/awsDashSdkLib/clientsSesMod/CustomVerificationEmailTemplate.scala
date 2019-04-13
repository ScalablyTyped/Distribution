package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomVerificationEmailTemplate extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: js.UndefOr[FailureRedirectionURL] = js.undefined
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: js.UndefOr[FromAddress] = js.undefined
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: js.UndefOr[SuccessRedirectionURL] = js.undefined
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: js.UndefOr[TemplateName] = js.undefined
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: js.UndefOr[Subject] = js.undefined
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
    if (FailureRedirectionURL != null) __obj.updateDynamic("FailureRedirectionURL")(FailureRedirectionURL)
    if (FromEmailAddress != null) __obj.updateDynamic("FromEmailAddress")(FromEmailAddress)
    if (SuccessRedirectionURL != null) __obj.updateDynamic("SuccessRedirectionURL")(SuccessRedirectionURL)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (TemplateSubject != null) __obj.updateDynamic("TemplateSubject")(TemplateSubject)
    __obj.asInstanceOf[CustomVerificationEmailTemplate]
  }
}

