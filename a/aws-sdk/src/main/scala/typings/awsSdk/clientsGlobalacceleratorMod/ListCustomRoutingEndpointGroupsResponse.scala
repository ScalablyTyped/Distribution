package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingEndpointGroupsResponse extends StObject {
  
  /**
    * The list of the endpoint groups associated with a listener for a custom routing accelerator.
    */
  var EndpointGroups: js.UndefOr[CustomRoutingEndpointGroups] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingEndpointGroupsResponse {
  
  inline def apply(): ListCustomRoutingEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomRoutingEndpointGroupsResponse]
  }
  
  extension [Self <: ListCustomRoutingEndpointGroupsResponse](x: Self) {
    
    inline def setEndpointGroups(value: CustomRoutingEndpointGroups): Self = StObject.set(x, "EndpointGroups", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupsUndefined: Self = StObject.set(x, "EndpointGroups", js.undefined)
    
    inline def setEndpointGroupsVarargs(value: CustomRoutingEndpointGroup*): Self = StObject.set(x, "EndpointGroups", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
