package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiKeysRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The maximum number of results that you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which you can use to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListApiKeysRequest {
  
  inline def apply(apiId: String): ListApiKeysRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysRequest]
  }
  
  extension [Self <: ListApiKeysRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
