package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStagingAccountsResponse extends StObject {
  
  /**
    * An array of staging AWS Accounts.
    */
  var accounts: js.UndefOr[Accounts] = js.undefined
  
  /**
    * The token of the next staging Account to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStagingAccountsResponse {
  
  inline def apply(): ListStagingAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStagingAccountsResponse]
  }
  
  extension [Self <: ListStagingAccountsResponse](x: Self) {
    
    inline def setAccounts(value: Accounts): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
