package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStagingAccountsRequest extends StObject {
  
  /**
    * The maximum number of staging Accounts to retrieve.
    */
  var maxResults: js.UndefOr[ListStagingAccountsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The token of the next staging Account to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStagingAccountsRequest {
  
  inline def apply(): ListStagingAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStagingAccountsRequest]
  }
  
  extension [Self <: ListStagingAccountsRequest](x: Self) {
    
    inline def setMaxResults(value: ListStagingAccountsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
