package typings.awsSdk.clientsMediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemsResponse extends StObject {
  
  /**
    * The metadata entries for the folders and objects at the requested path.
    */
  var Items: js.UndefOr[ItemList] = js.undefined
  
  /**
    * The token that can be used in a request to view the next set of results. For example, you submit a ListItems request that matches 2,000 items with MaxResults set at 500. The service returns the first batch of results (up to 500) and a NextToken value that can be used to fetch the next batch of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListItemsResponse {
  
  inline def apply(): ListItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemsResponse]
  }
  
  extension [Self <: ListItemsResponse](x: Self) {
    
    inline def setItems(value: ItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
