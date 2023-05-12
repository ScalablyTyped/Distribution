package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results. The default is 20.
    */
  var maxResults: js.UndefOr[ListVpcEndpointsRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListVpcEndpoints operation returns a nextToken, you can include the returned nextToken in subsequent ListVpcEndpoints operations, which returns results in the next page. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Filter the results according to the current status of the VPC endpoint. Possible statuses are CREATING, DELETING, UPDATING, ACTIVE, and FAILED.
    */
  var vpcEndpointFilters: js.UndefOr[VpcEndpointFilters] = js.undefined
}
object ListVpcEndpointsRequest {
  
  inline def apply(): ListVpcEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVpcEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListVpcEndpointsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVpcEndpointFilters(value: VpcEndpointFilters): Self = StObject.set(x, "vpcEndpointFilters", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointFiltersUndefined: Self = StObject.set(x, "vpcEndpointFilters", js.undefined)
  }
}
