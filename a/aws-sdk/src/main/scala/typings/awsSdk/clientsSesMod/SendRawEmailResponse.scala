package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendRawEmailResponse extends StObject {
  
  /**
    * The unique message identifier returned from the SendRawEmail action. 
    */
  var MessageId: typings.awsSdk.clientsSesMod.MessageId
}
object SendRawEmailResponse {
  
  inline def apply(MessageId: MessageId): SendRawEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendRawEmailResponse]
  }
  
  extension [Self <: SendRawEmailResponse](x: Self) {
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
  }
}
