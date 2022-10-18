package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworksRequest extends StObject {
  
  /**
    * The filters.    STATUS - The status (AVAILABLE | CREATED | DELETED | DEPROVISIONING | PROVISIONING).   Filter values are case sensitive. If you specify multiple values for a filter, the values are joined with an OR, and the request returns all results that match any of the specified values.
    */
  var filters: js.UndefOr[NetworkFilters] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[ListNetworksRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var startToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworksRequest {
  
  inline def apply(): ListNetworksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworksRequest]
  }
  
  extension [Self <: ListNetworksRequest](x: Self) {
    
    inline def setFilters(value: NetworkFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: ListNetworksRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setStartToken(value: PaginationToken): Self = StObject.set(x, "startToken", value.asInstanceOf[js.Any])
    
    inline def setStartTokenUndefined: Self = StObject.set(x, "startToken", js.undefined)
  }
}
