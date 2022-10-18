package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrdersRequest extends StObject {
  
  /**
    * The filters.    NETWORK_SITE - The Amazon Resource Name (ARN) of the network site.    STATUS - The status (ACKNOWLEDGING | ACKNOWLEDGED | UNACKNOWLEDGED).   Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var filters: js.UndefOr[OrderFilters] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[ListOrdersRequestMaxResultsInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
  
  /**
    * The token for the next page of results.
    */
  var startToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListOrdersRequest {
  
  inline def apply(networkArn: Arn): ListOrdersRequest = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrdersRequest]
  }
  
  extension [Self <: ListOrdersRequest](x: Self) {
    
    inline def setFilters(value: OrderFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: ListOrdersRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
    
    inline def setStartToken(value: PaginationToken): Self = StObject.set(x, "startToken", value.asInstanceOf[js.Any])
    
    inline def setStartTokenUndefined: Self = StObject.set(x, "startToken", js.undefined)
  }
}
