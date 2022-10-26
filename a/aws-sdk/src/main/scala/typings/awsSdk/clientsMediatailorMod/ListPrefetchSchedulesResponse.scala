package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrefetchSchedulesResponse extends StObject {
  
  /**
    * Lists the prefetch schedules. An empty Items list doesn't mean there aren't more items to fetch, just that that page was empty.
    */
  var Items: js.UndefOr[listOfPrefetchSchedule] = js.undefined
  
  /**
    * Pagination token returned by the list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListPrefetchSchedulesResponse {
  
  inline def apply(): ListPrefetchSchedulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrefetchSchedulesResponse]
  }
  
  extension [Self <: ListPrefetchSchedulesResponse](x: Self) {
    
    inline def setItems(value: listOfPrefetchSchedule): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: PrefetchSchedule*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
