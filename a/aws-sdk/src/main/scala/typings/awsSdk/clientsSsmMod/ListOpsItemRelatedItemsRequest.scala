package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpsItemRelatedItemsRequest extends StObject {
  
  /**
    * One or more OpsItem filters. Use a filter to return a more specific list of results. 
    */
  var Filters: js.UndefOr[OpsItemRelatedItemsFilters] = js.undefined
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[OpsItemRelatedItemsMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the OpsItem for which you want to list all related-item resources.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.clientsSsmMod.OpsItemId] = js.undefined
}
object ListOpsItemRelatedItemsRequest {
  
  inline def apply(): ListOpsItemRelatedItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpsItemRelatedItemsRequest]
  }
  
  extension [Self <: ListOpsItemRelatedItemsRequest](x: Self) {
    
    inline def setFilters(value: OpsItemRelatedItemsFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: OpsItemRelatedItemsFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: OpsItemRelatedItemsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
  }
}
