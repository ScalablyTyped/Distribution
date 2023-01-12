package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkResourcesRequest extends StObject {
  
  /**
    * The filters.    ORDER - The Amazon Resource Name (ARN) of the order.    STATUS - The status (AVAILABLE | DELETED | DELETING | PENDING | PENDING_RETURN | PROVISIONING | SHIPPED).   Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var filters: js.UndefOr[NetworkResourceFilters] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[ListNetworkResourcesRequestMaxResultsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
  
  /**
    * The token for the next page of results.
    */
  var startToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkResourcesRequest {
  
  inline def apply(networkArn: Arn): ListNetworkResourcesRequest = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworkResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNetworkResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: NetworkResourceFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: ListNetworkResourcesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setStartToken(value: PaginationToken): Self = StObject.set(x, "startToken", value.asInstanceOf[js.Any])
    
    inline def setStartTokenUndefined: Self = StObject.set(x, "startToken", js.undefined)
  }
}
