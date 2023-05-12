package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSequenceStoresRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[SequenceStoreFilter] = js.undefined
  
  /**
    * The maximum number of stores to return in one page of results.
    */
  var maxResults: js.UndefOr[ListSequenceStoresRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListSequenceStoresRequest {
  
  inline def apply(): ListSequenceStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSequenceStoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSequenceStoresRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: SequenceStoreFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListSequenceStoresRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
