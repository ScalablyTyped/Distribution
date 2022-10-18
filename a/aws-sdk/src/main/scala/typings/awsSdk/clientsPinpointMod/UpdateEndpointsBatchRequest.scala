package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointsBatchRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  var EndpointBatchRequest: typings.awsSdk.clientsPinpointMod.EndpointBatchRequest
}
object UpdateEndpointsBatchRequest {
  
  inline def apply(ApplicationId: string, EndpointBatchRequest: EndpointBatchRequest): UpdateEndpointsBatchRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointsBatchRequest]
  }
  
  extension [Self <: UpdateEndpointsBatchRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEndpointBatchRequest(value: EndpointBatchRequest): Self = StObject.set(x, "EndpointBatchRequest", value.asInstanceOf[js.Any])
  }
}
