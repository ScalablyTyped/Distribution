package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationStoresRequest extends StObject {
  
  /**
    * A filter to apply to the list.
    */
  var filter: js.UndefOr[ListAnnotationStoresFilter] = js.undefined
  
  /**
    * IDs of stores to list.
    */
  var ids: js.UndefOr[ListAnnotationStoresRequestIdsList] = js.undefined
  
  /**
    * The maximum number of stores to return in one page of results.
    */
  var maxResults: js.UndefOr[ListAnnotationStoresRequestMaxResultsInteger] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var nextToken: js.UndefOr[ListAnnotationStoresRequestNextTokenString] = js.undefined
}
object ListAnnotationStoresRequest {
  
  inline def apply(): ListAnnotationStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationStoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationStoresRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ListAnnotationStoresFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIds(value: ListAnnotationStoresRequestIdsList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: ResourceIdentifier*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: ListAnnotationStoresRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListAnnotationStoresRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
