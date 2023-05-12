package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionsRequest extends StObject {
  
  /**
    * List of filter names and values that you can use for requests.
    */
  var collectionFilters: js.UndefOr[CollectionFilters] = js.undefined
  
  /**
    * The maximum number of results to return. Default is 20. You can use nextToken to get the next page of results.
    */
  var maxResults: js.UndefOr[ListCollectionsRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListCollections operation returns a nextToken, you can include the returned nextToken in subsequent ListCollections operations, which returns results in the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListCollectionsRequest {
  
  inline def apply(): ListCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollectionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCollectionFilters(value: CollectionFilters): Self = StObject.set(x, "collectionFilters", value.asInstanceOf[js.Any])
    
    inline def setCollectionFiltersUndefined: Self = StObject.set(x, "collectionFilters", js.undefined)
    
    inline def setMaxResults(value: ListCollectionsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
