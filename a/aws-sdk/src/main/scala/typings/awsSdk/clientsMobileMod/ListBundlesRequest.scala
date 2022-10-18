package typings.awsSdk.clientsMobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBundlesRequest extends StObject {
  
  /**
    *  Maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  Pagination token. Set to null to start listing bundles from start. If non-null pagination token is returned in a result, then pass its value in here in another request to list more bundles. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBundlesRequest {
  
  inline def apply(): ListBundlesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBundlesRequest]
  }
  
  extension [Self <: ListBundlesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
