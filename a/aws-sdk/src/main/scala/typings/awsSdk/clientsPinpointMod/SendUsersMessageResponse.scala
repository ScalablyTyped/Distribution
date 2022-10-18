package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendUsersMessageResponse extends StObject {
  
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier that was assigned to the message request.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
}
object SendUsersMessageResponse {
  
  inline def apply(ApplicationId: string): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
  
  extension [Self <: SendUsersMessageResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setResult(value: MapOfMapOfEndpointMessageResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
