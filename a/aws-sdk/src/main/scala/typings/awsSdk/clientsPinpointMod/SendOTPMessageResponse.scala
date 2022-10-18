package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendOTPMessageResponse extends StObject {
  
  var MessageResponse: typings.awsSdk.clientsPinpointMod.MessageResponse
}
object SendOTPMessageResponse {
  
  inline def apply(MessageResponse: MessageResponse): SendOTPMessageResponse = {
    val __obj = js.Dynamic.literal(MessageResponse = MessageResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOTPMessageResponse]
  }
  
  extension [Self <: SendOTPMessageResponse](x: Self) {
    
    inline def setMessageResponse(value: MessageResponse): Self = StObject.set(x, "MessageResponse", value.asInstanceOf[js.Any])
  }
}
