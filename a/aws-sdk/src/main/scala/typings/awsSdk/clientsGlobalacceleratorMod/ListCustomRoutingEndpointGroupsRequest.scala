package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingEndpointGroupsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener to list endpoint groups for.
    */
  var ListenerArn: GenericString
  
  /**
    * The number of endpoint group objects that you want to return with this call. The default value is 10.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingEndpointGroupsRequest {
  
  inline def apply(ListenerArn: GenericString): ListCustomRoutingEndpointGroupsRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCustomRoutingEndpointGroupsRequest]
  }
  
  extension [Self <: ListCustomRoutingEndpointGroupsRequest](x: Self) {
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
