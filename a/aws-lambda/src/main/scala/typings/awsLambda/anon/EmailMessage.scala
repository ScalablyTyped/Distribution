package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailMessage extends StObject {
  
  var emailMessage: String
  
  var emailSubject: String
  
  var smsMessage: String
}
object EmailMessage {
  
  inline def apply(emailMessage: String, emailSubject: String, smsMessage: String): EmailMessage = {
    val __obj = js.Dynamic.literal(emailMessage = emailMessage.asInstanceOf[js.Any], emailSubject = emailSubject.asInstanceOf[js.Any], smsMessage = smsMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
  
  extension [Self <: EmailMessage](x: Self) {
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
  }
}
