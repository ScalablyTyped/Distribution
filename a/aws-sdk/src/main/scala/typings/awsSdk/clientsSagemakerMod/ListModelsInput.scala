package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelsInput extends StObject {
  
  /**
    * A filter that returns only models with a creation time greater than or equal to the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A filter that returns only models created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of models to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * A string in the model name. This filter returns only models whose name contains the specified string.
    */
  var NameContains: js.UndefOr[ModelNameContains] = js.undefined
  
  /**
    * If the response to a previous ListModels request was truncated, the response includes a NextToken. To retrieve the next set of models, use the token in the next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[ModelSortKey] = js.undefined
  
  /**
    * The sort order for results. The default is Descending.
    */
  var SortOrder: js.UndefOr[OrderKey] = js.undefined
}
object ListModelsInput {
  
  inline def apply(): ListModelsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelsInput]
  }
  
  extension [Self <: ListModelsInput](x: Self) {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: ModelNameContains): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ModelSortKey): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: OrderKey): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
