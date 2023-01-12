package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendEmailResponse extends StObject {
  
  /**
    * A unique identifier for the message that is generated when Amazon Pinpoint accepts the message.  It is possible for Amazon Pinpoint to accept a message without sending it. This can happen when the message you're trying to send has an attachment doesn't pass a virus check, or when you send a templated email that contains invalid personalization content, for example. 
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.undefined
}
object SendEmailResponse {
  
  inline def apply(): SendEmailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEmailResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendEmailResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageId(value: OutboundMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
  }
}
