package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessTokensRequest extends StObject {
  
  /**
    * The maximum number of results to show in a single call to this API. If the number of results is larger than the number you specified, the response will include a NextToken element, which you can use to obtain additional results.
    */
  var maxResults: js.UndefOr[ListAccessTokensRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[ListAccessTokensRequestNextTokenString] = js.undefined
}
object ListAccessTokensRequest {
  
  inline def apply(): ListAccessTokensRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessTokensRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessTokensRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListAccessTokensRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListAccessTokensRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
