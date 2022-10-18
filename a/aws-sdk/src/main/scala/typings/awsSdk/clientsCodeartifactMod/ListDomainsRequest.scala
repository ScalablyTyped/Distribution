package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsRequest extends StObject {
  
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListDomainsMaxResults] = js.undefined
  
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDomainsRequest {
  
  inline def apply(): ListDomainsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsRequest]
  }
  
  extension [Self <: ListDomainsRequest](x: Self) {
    
    inline def setMaxResults(value: ListDomainsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
