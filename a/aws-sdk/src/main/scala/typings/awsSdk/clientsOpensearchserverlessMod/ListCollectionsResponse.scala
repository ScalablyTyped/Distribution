package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionsResponse extends StObject {
  
  /**
    * Details about each collection.
    */
  var collectionSummaries: js.UndefOr[CollectionSummaries] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListCollectionsResponse {
  
  inline def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setCollectionSummaries(value: CollectionSummaries): Self = StObject.set(x, "collectionSummaries", value.asInstanceOf[js.Any])
    
    inline def setCollectionSummariesUndefined: Self = StObject.set(x, "collectionSummaries", js.undefined)
    
    inline def setCollectionSummariesVarargs(value: CollectionSummary*): Self = StObject.set(x, "collectionSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
