package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelCardsRequest extends StObject {
  
  /**
    * Only list model cards that were created after the time specified.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Only list model cards that were created before the time specified.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum number of model cards to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * Only list model cards with the specified approval status.
    */
  var ModelCardStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardStatus] = js.undefined
  
  /**
    * Only list model cards with names that contain the specified string.
    */
  var NameContains: js.UndefOr[EntityName] = js.undefined
  
  /**
    * If the response to a previous ListModelCards request was truncated, the response includes a NextToken. To retrieve the next set of model cards, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Sort model cards by either name or creation time. Sorts by creation time by default.
    */
  var SortBy: js.UndefOr[ModelCardSortBy] = js.undefined
  
  /**
    * Sort model cards by ascending or descending order.
    */
  var SortOrder: js.UndefOr[ModelCardSortOrder] = js.undefined
}
object ListModelCardsRequest {
  
  inline def apply(): ListModelCardsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelCardsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelCardsRequest] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatusUndefined: Self = StObject.set(x, "ModelCardStatus", js.undefined)
    
    inline def setNameContains(value: EntityName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ModelCardSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: ModelCardSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
