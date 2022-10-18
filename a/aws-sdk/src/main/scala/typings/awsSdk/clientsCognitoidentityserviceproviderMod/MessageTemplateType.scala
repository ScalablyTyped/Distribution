package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageTemplateType extends StObject {
  
  /**
    * The message template for email messages. EmailMessage is allowed only if EmailSendingAccount is DEVELOPER. 
    */
  var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
  
  /**
    * The subject line for email messages. EmailSubject is allowed only if EmailSendingAccount is DEVELOPER. 
    */
  var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
  
  /**
    * The message template for SMS messages.
    */
  var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
}
object MessageTemplateType {
  
  inline def apply(): MessageTemplateType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageTemplateType]
  }
  
  extension [Self <: MessageTemplateType](x: Self) {
    
    inline def setEmailMessage(value: EmailVerificationMessageType): Self = StObject.set(x, "EmailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageUndefined: Self = StObject.set(x, "EmailMessage", js.undefined)
    
    inline def setEmailSubject(value: EmailVerificationSubjectType): Self = StObject.set(x, "EmailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "EmailSubject", js.undefined)
    
    inline def setSMSMessage(value: SmsVerificationMessageType): Self = StObject.set(x, "SMSMessage", value.asInstanceOf[js.Any])
    
    inline def setSMSMessageUndefined: Self = StObject.set(x, "SMSMessage", js.undefined)
  }
}
