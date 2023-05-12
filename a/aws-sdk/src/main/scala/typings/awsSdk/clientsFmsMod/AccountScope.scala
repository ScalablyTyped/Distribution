package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountScope extends StObject {
  
  /**
    * The list of accounts within the organization that the specified Firewall Manager administrator either can or cannot apply policies to, based on the value of ExcludeSpecifiedAccounts. If ExcludeSpecifiedAccounts is set to true, then the Firewall Manager administrator can apply policies to all members of the organization except for the accounts in this list. If ExcludeSpecifiedAccounts is set to false, then the Firewall Manager administrator can only apply policies to the accounts in this list.
    */
  var Accounts: js.UndefOr[AccountIdList] = js.undefined
  
  /**
    * A boolean value that indicates if the administrator can apply policies to all accounts within an organization. If true, the administrator can apply policies to all accounts within the organization. You can either enable management of all accounts through this operation, or you can specify a list of accounts to manage in AccountScope$Accounts. You cannot specify both.
    */
  var AllAccountsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean value that excludes the accounts in AccountScope$Accounts from the administrator's scope. If true, the Firewall Manager administrator can apply policies to all members of the organization except for the accounts listed in AccountScope$Accounts. You can either specify a list of accounts to exclude by AccountScope$Accounts, or you can enable management of all accounts by AccountScope$AllAccountsEnabled. You cannot specify both.
    */
  var ExcludeSpecifiedAccounts: js.UndefOr[Boolean] = js.undefined
}
object AccountScope {
  
  inline def apply(): AccountScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountScope] (val x: Self) extends AnyVal {
    
    inline def setAccounts(value: AccountIdList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: AWSAccountId*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setAllAccountsEnabled(value: Boolean): Self = StObject.set(x, "AllAccountsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAllAccountsEnabledUndefined: Self = StObject.set(x, "AllAccountsEnabled", js.undefined)
    
    inline def setExcludeSpecifiedAccounts(value: Boolean): Self = StObject.set(x, "ExcludeSpecifiedAccounts", value.asInstanceOf[js.Any])
    
    inline def setExcludeSpecifiedAccountsUndefined: Self = StObject.set(x, "ExcludeSpecifiedAccounts", js.undefined)
  }
}
