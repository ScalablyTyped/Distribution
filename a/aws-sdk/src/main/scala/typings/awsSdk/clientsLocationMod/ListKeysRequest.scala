package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeysRequest extends StObject {
  
  /**
    * Optionally filter the list to only Active or Expired API keys.
    */
  var Filter: js.UndefOr[ApiKeyFilter] = js.undefined
  
  /**
    * An optional limit for the number of resources returned in a single call.  Default value: 100 
    */
  var MaxResults: js.UndefOr[ListKeysRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page.  Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListKeysRequest {
  
  inline def apply(): ListKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeysRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ApiKeyFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: ListKeysRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
