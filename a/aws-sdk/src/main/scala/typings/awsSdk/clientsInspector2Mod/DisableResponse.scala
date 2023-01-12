package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableResponse extends StObject {
  
  /**
    * Information on the accounts that have had Amazon Inspector scans successfully disabled. Details are provided for each account.
    */
  var accounts: AccountList
  
  /**
    * Information on any accounts for which Amazon Inspector scans could not be disabled. Details are provided for each account.
    */
  var failedAccounts: js.UndefOr[FailedAccountList] = js.undefined
}
object DisableResponse {
  
  inline def apply(accounts: AccountList): DisableResponse = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableResponse] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value*))
    
    inline def setFailedAccounts(value: FailedAccountList): Self = StObject.set(x, "failedAccounts", value.asInstanceOf[js.Any])
    
    inline def setFailedAccountsUndefined: Self = StObject.set(x, "failedAccounts", js.undefined)
    
    inline def setFailedAccountsVarargs(value: FailedAccount*): Self = StObject.set(x, "failedAccounts", js.Array(value*))
  }
}
