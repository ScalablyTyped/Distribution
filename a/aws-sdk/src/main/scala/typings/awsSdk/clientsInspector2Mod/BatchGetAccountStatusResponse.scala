package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAccountStatusResponse extends StObject {
  
  /**
    * An array of objects that provide details on the status of Amazon Inspector for each of the requested accounts.
    */
  var accounts: AccountStateList
  
  /**
    * An array of objects detailing any accounts that failed to enable Amazon Inspector and why.
    */
  var failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
}
object BatchGetAccountStatusResponse {
  
  inline def apply(accounts: AccountStateList): BatchGetAccountStatusResponse = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAccountStatusResponse]
  }
  
  extension [Self <: BatchGetAccountStatusResponse](x: Self) {
    
    inline def setAccounts(value: AccountStateList): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: AccountState*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setFailedAccounts(value: FailedAccountList): Self = StObject.set(x, "failedAccounts", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountsUndefined: Self = StObject.set(x, "failedAccounts", js.undefined)
    
    inline def setFailedAccountsVarargs(value: FailedAccount*): Self = StObject.set(x, "failedAccounts", js.Array(value*))
  }
}
