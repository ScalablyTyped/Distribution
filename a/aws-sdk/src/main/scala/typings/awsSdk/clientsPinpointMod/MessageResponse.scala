package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageResponse extends StObject {
  
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: string
  
  /**
    * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint ID is the key and the result is the value.
    */
  var EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined
  
  /**
    * The identifier for the original request that the message was delivered for.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * A map that contains a multipart response for each address (email address, phone number, or push notification token) that the message was sent to. In the map, the address is the key and the result is the value.
    */
  var Result: js.UndefOr[MapOfMessageResult] = js.undefined
}
object MessageResponse {
  
  inline def apply(ApplicationId: string): MessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  
  extension [Self <: MessageResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEndpointResult(value: MapOfEndpointMessageResult): Self = StObject.set(x, "EndpointResult", value.asInstanceOf[js.Any])
    
    inline def setEndpointResultUndefined: Self = StObject.set(x, "EndpointResult", js.undefined)
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setResult(value: MapOfMessageResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
