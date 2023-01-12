package typings.awsSdk.clientsMacieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMemberAccountsRequest extends StObject {
  
  /**
    * (Discontinued) Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * (Discontinued) Use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListMemberAccounts action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMemberAccountsRequest {
  
  inline def apply(): ListMemberAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAccountsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMemberAccountsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
