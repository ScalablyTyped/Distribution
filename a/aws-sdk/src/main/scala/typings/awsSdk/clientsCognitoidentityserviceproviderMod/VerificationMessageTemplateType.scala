package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationMessageTemplateType extends StObject {
  
  /**
    * The default email option.
    */
  var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined
  
  /**
    * The template for email messages that Amazon Cognito sends to your users. You can set an EmailMessage template only if the value of  EmailSendingAccount is DEVELOPER. When your EmailSendingAccount is DEVELOPER, your user pool sends email messages with your own Amazon SES configuration.
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * The email message template for sending a confirmation link to the user. You can set an EmailMessageByLink template only if the value of  EmailSendingAccount is DEVELOPER. When your EmailSendingAccount is DEVELOPER, your user pool sends email messages with your own Amazon SES configuration.
    */
  var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined
  
  /**
    * The subject line for the email message template. You can set an EmailSubject template only if the value of  EmailSendingAccount is DEVELOPER. When your EmailSendingAccount is DEVELOPER, your user pool sends email messages with your own Amazon SES configuration.
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * The subject line for the email message template for sending a confirmation link to the user. You can set an EmailSubjectByLink template only if the value of  EmailSendingAccount is DEVELOPER. When your EmailSendingAccount is DEVELOPER, your user pool sends email messages with your own Amazon SES configuration.
    */
  var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined
  
  /**
    * The template for SMS messages that Amazon Cognito sends to your users.
    */
  var SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
}
object VerificationMessageTemplateType {
  
  inline def apply(): VerificationMessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationMessageTemplateType]
  }
  
  extension [Self <: VerificationMessageTemplateType](x: Self) {
    
    inline def setDefaultEmailOption(value: DefaultEmailOptionType): Self = StObject.set(x, "DefaultEmailOption", value.asInstanceOf[js.Any])
    
    inline def setDefaultEmailOptionUndefined: Self = StObject.set(x, "DefaultEmailOption", js.undefined)
    
    inline def setEmailMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageByLink(value: EmailVerificationMessageByLinkType): Self = StObject.set(x, "EmailMessageByLink", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageByLinkUndefined: Self = StObject.set(x, "EmailMessageByLink", js.undefined)
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    inline def setEmailSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectByLink(value: EmailVerificationSubjectByLinkType): Self = StObject.set(x, "EmailSubjectByLink", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectByLinkUndefined: Self = StObject.set(x, "EmailSubjectByLink", js.undefined)
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "EmailSubject", js.undefined)
    
    inline def setSmsMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SmsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "SmsMessage", js.undefined)
  }
}
