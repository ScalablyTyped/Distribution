package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEndpointGroupsResponse extends StObject {
  
  /**
    * The list of the endpoint groups associated with a listener.
    */
  var EndpointGroups: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.EndpointGroups] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListEndpointGroupsResponse {
  
  inline def apply(): ListEndpointGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointGroupsResponse]
  }
  
  extension [Self <: ListEndpointGroupsResponse](x: Self) {
    
    inline def setEndpointGroups(value: EndpointGroups): Self = StObject.set(x, "EndpointGroups", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupsUndefined: Self = StObject.set(x, "EndpointGroups", js.undefined)
    
    inline def setEndpointGroupsVarargs(value: EndpointGroup*): Self = StObject.set(x, "EndpointGroups", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
