package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: awsDashSdkLib.clientsSesMod.FailureRedirectionURL
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: FromAddress
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: awsDashSdkLib.clientsSesMod.SuccessRedirectionURL
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom Verification Email Frequently Asked Questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: awsDashSdkLib.clientsSesMod.TemplateContent
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: awsDashSdkLib.clientsSesMod.TemplateName
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: Subject
}

object CreateCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(
    FailureRedirectionURL: FailureRedirectionURL,
    FromEmailAddress: FromAddress,
    SuccessRedirectionURL: SuccessRedirectionURL,
    TemplateContent: TemplateContent,
    TemplateName: TemplateName,
    TemplateSubject: Subject
  ): CreateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(FailureRedirectionURL = FailureRedirectionURL, FromEmailAddress = FromEmailAddress, SuccessRedirectionURL = SuccessRedirectionURL, TemplateContent = TemplateContent, TemplateName = TemplateName, TemplateSubject = TemplateSubject)
  
    __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
  }
}

