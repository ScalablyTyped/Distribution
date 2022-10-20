package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is not successfully verified.
    */
  var FailureRedirectionURL: typings.awsSdk.clientsSesv2Mod.FailureRedirectionURL
  
  /**
    * The email address that the custom verification email is sent from.
    */
  var FromEmailAddress: EmailAddress
  
  /**
    * The URL that the recipient of the verification email is sent to if his or her address is successfully verified.
    */
  var SuccessRedirectionURL: typings.awsSdk.clientsSesv2Mod.SuccessRedirectionURL
  
  /**
    * The content of the custom verification email. The total size of the email must be less than 10 MB. The message body may contain HTML, with some limitations. For more information, see Custom verification email frequently asked questions in the Amazon SES Developer Guide.
    */
  var TemplateContent: typings.awsSdk.clientsSesv2Mod.TemplateContent
  
  /**
    * The name of the custom verification email template.
    */
  var TemplateName: EmailTemplateName
  
  /**
    * The subject line of the custom verification email.
    */
  var TemplateSubject: EmailTemplateSubject
}
object CreateCustomVerificationEmailTemplateRequest {
  
  inline def apply(
    FailureRedirectionURL: FailureRedirectionURL,
    FromEmailAddress: EmailAddress,
    SuccessRedirectionURL: SuccessRedirectionURL,
    TemplateContent: TemplateContent,
    TemplateName: EmailTemplateName,
    TemplateSubject: EmailTemplateSubject
  ): CreateCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(FailureRedirectionURL = FailureRedirectionURL.asInstanceOf[js.Any], FromEmailAddress = FromEmailAddress.asInstanceOf[js.Any], SuccessRedirectionURL = SuccessRedirectionURL.asInstanceOf[js.Any], TemplateContent = TemplateContent.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateSubject = TemplateSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomVerificationEmailTemplateRequest]
  }
  
  extension [Self <: CreateCustomVerificationEmailTemplateRequest](x: Self) {
    
    inline def setFailureRedirectionURL(value: FailureRedirectionURL): Self = StObject.set(x, "FailureRedirectionURL", value.asInstanceOf[js.Any])
    
    inline def setFromEmailAddress(value: EmailAddress): Self = StObject.set(x, "FromEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setSuccessRedirectionURL(value: SuccessRedirectionURL): Self = StObject.set(x, "SuccessRedirectionURL", value.asInstanceOf[js.Any])
    
    inline def setTemplateContent(value: TemplateContent): Self = StObject.set(x, "TemplateContent", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateSubject(value: EmailTemplateSubject): Self = StObject.set(x, "TemplateSubject", value.asInstanceOf[js.Any])
  }
}
