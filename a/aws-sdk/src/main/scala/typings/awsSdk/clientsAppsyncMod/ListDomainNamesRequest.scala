package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainNamesRequest extends StObject {
  
  /**
    * The maximum number of results that you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The API token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDomainNamesRequest {
  
  inline def apply(): ListDomainNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesRequest]
  }
  
  extension [Self <: ListDomainNamesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
