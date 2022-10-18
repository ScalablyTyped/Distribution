package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailContent extends StObject {
  
  /**
    * The message that you want to send. The message can be up to 200 characters.
    */
  var additionalMessage: js.UndefOr[NotificationAdditionalMessage] = js.undefined
  
  /**
    * The subject of the email.
    */
  var subject: js.UndefOr[EmailSubject] = js.undefined
}
object EmailContent {
  
  inline def apply(): EmailContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailContent]
  }
  
  extension [Self <: EmailContent](x: Self) {
    
    inline def setAdditionalMessage(value: NotificationAdditionalMessage): Self = StObject.set(x, "additionalMessage", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMessageUndefined: Self = StObject.set(x, "additionalMessage", js.undefined)
    
    inline def setSubject(value: EmailSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
