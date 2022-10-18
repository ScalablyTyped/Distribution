package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRelatedItemsResponse extends StObject {
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of items related to a case. 
    */
  var relatedItems: SearchRelatedItemsResponseRelatedItemsList
}
object SearchRelatedItemsResponse {
  
  inline def apply(relatedItems: SearchRelatedItemsResponseRelatedItemsList): SearchRelatedItemsResponse = {
    val __obj = js.Dynamic.literal(relatedItems = relatedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRelatedItemsResponse]
  }
  
  extension [Self <: SearchRelatedItemsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRelatedItems(value: SearchRelatedItemsResponseRelatedItemsList): Self = StObject.set(x, "relatedItems", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemsVarargs(value: SearchRelatedItemsResponseItem*): Self = StObject.set(x, "relatedItems", js.Array(value*))
  }
}
