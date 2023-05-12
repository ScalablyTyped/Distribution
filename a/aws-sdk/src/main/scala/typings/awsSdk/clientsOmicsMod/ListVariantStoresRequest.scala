package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariantStoresRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ListVariantStoresFilter] = js.undefined
  
  /**
    * A list of store IDs.
    */
  var ids: js.UndefOr[ListVariantStoresRequestIdsList] = js.undefined
  
  /**
    * The maximum number of stores to return in one page of results.
    */
  var maxResults: js.UndefOr[ListVariantStoresRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[ListVariantStoresRequestNextTokenString] = js.undefined
}
object ListVariantStoresRequest {
  
  inline def apply(): ListVariantStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariantStoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVariantStoresRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ListVariantStoresFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIds(value: ListVariantStoresRequestIdsList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: ListVariantStoresRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListVariantStoresRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
