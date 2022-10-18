package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSConfiguration extends StObject {
  
  /**
    * The message that you want to send. The message can be up to 200 characters.
    */
  var additionalMessage: js.UndefOr[NotificationAdditionalMessage] = js.undefined
  
  /**
    * Specifies one or more recipients who receive the message.  You must add the users that receive SMS messages to your AWS SSO store. 
    */
  var recipients: RecipientDetails
  
  /**
    * The sender ID.
    */
  var senderId: js.UndefOr[SMSSenderId] = js.undefined
}
object SMSConfiguration {
  
  inline def apply(recipients: RecipientDetails): SMSConfiguration = {
    val __obj = js.Dynamic.literal(recipients = recipients.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSConfiguration]
  }
  
  extension [Self <: SMSConfiguration](x: Self) {
    
    inline def setAdditionalMessage(value: NotificationAdditionalMessage): Self = StObject.set(x, "additionalMessage", value.asInstanceOf[js.Any])
    
    inline def setAdditionalMessageUndefined: Self = StObject.set(x, "additionalMessage", js.undefined)
    
    inline def setRecipients(value: RecipientDetails): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsVarargs(value: RecipientDetail*): Self = StObject.set(x, "recipients", js.Array(value*))
    
    inline def setSenderId(value: SMSSenderId): Self = StObject.set(x, "senderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "senderId", js.undefined)
  }
}
