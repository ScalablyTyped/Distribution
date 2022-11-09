package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesResponse extends StObject {
  
  /**
    * Details of the resources that were discovered.
    */
  var Items: js.UndefOr[DiscoveredResourceList] = js.undefined
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDiscoveredResourcesResponse {
  
  inline def apply(): ListDiscoveredResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveredResourcesResponse]
  }
  
  extension [Self <: ListDiscoveredResourcesResponse](x: Self) {
    
    inline def setItems(value: DiscoveredResourceList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: DiscoveredResource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
