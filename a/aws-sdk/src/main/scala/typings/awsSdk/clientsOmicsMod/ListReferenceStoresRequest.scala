package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferenceStoresRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ReferenceStoreFilter] = js.undefined
  
  /**
    * The maximum number of stores to return in one page of results.
    */
  var maxResults: js.UndefOr[ListReferenceStoresRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListReferenceStoresRequest {
  
  inline def apply(): ListReferenceStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReferenceStoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReferenceStoresRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ReferenceStoreFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListReferenceStoresRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
