package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessagesResponse extends StObject {
  
  var MessageResponse: typings.awsSdk.clientsPinpointMod.MessageResponse
}
object SendMessagesResponse {
  
  inline def apply(MessageResponse: MessageResponse): SendMessagesResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessagesResponse] (val x: Self) extends AnyVal {
    
    inline def setMessageResponse(value: MessageResponse): Self = StObject.set(x, "MessageResponse", value.asInstanceOf[js.Any])
  }
}
