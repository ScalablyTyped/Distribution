package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGraphqlApisRequest extends StObject {
  
  /**
    * The maximum number of results that you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which you can use to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGraphqlApisRequest {
  
  inline def apply(): ListGraphqlApisRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisRequest]
  }
  
  extension [Self <: ListGraphqlApisRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
