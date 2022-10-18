package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsRequest extends StObject {
  
  /**
    * The maximum amount of data that can be contained in a single set of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The continuation token to be used to return the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListProjectsRequest {
  
  inline def apply(): ListProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsRequest]
  }
  
  extension [Self <: ListProjectsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
