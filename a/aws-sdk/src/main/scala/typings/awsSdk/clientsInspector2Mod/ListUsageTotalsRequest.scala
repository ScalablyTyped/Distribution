package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsageTotalsRequest extends StObject {
  
  /**
    * The Amazon Web Services account IDs to retrieve usage totals for.
    */
  var accountIds: js.UndefOr[UsageAccountIdList] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[ListUsageTotalsMaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[ListUsageTotalsNextToken] = js.undefined
}
object ListUsageTotalsRequest {
  
  inline def apply(): ListUsageTotalsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsageTotalsRequest]
  }
  
  extension [Self <: ListUsageTotalsRequest](x: Self) {
    
    inline def setAccountIds(value: UsageAccountIdList): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsUndefined: Self = StObject.set(x, "accountIds", js.undefined)
    
    inline def setAccountIdsVarargs(value: UsageAccountId*): Self = StObject.set(x, "accountIds", js.Array(value*))
    
    inline def setMaxResults(value: ListUsageTotalsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: ListUsageTotalsNextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
