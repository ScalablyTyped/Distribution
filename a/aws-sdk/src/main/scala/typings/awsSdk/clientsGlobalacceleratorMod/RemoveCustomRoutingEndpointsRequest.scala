package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveCustomRoutingEndpointsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to remove endpoints from.
    */
  var EndpointGroupArn: GenericString
  
  /**
    * The IDs for the endpoints. For custom routing accelerators, endpoint IDs are the virtual private cloud (VPC) subnet IDs. 
    */
  var EndpointIds: typings.awsSdk.clientsGlobalacceleratorMod.EndpointIds
}
object RemoveCustomRoutingEndpointsRequest {
  
  inline def apply(EndpointGroupArn: GenericString, EndpointIds: EndpointIds): RemoveCustomRoutingEndpointsRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any], EndpointIds = EndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveCustomRoutingEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveCustomRoutingEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointIds(value: EndpointIds): Self = StObject.set(x, "EndpointIds", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdsVarargs(value: GenericString*): Self = StObject.set(x, "EndpointIds", js.Array(value*))
  }
}
