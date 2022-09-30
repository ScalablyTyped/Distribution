package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailMessage extends StObject {
  
  var emailMessage: String | Null
  
  var emailSubject: String | Null
  
  var smsMessage: String | Null
}
object EmailMessage {
  
  inline def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal(emailMessage = null, emailSubject = null, smsMessage = null)
    __obj.asInstanceOf[EmailMessage]
  }
  
  extension [Self <: EmailMessage](x: Self) {
    
    inline def setEmailMessage(value: String): Self = StObject.set(x, "emailMessage", value.asInstanceOf[js.Any])
    
    inline def setEmailMessageNull: Self = StObject.set(x, "emailMessage", null)
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectNull: Self = StObject.set(x, "emailSubject", null)
    
    inline def setSmsMessage(value: String): Self = StObject.set(x, "smsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageNull: Self = StObject.set(x, "smsMessage", null)
  }
}
