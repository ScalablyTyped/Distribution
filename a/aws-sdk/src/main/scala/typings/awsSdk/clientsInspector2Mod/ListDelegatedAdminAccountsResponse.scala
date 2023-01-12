package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDelegatedAdminAccountsResponse extends StObject {
  
  /**
    * Details of the Amazon Inspector delegated administrator of your organization.
    */
  var delegatedAdminAccounts: js.UndefOr[DelegatedAdminAccountList] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDelegatedAdminAccountsResponse {
  
  inline def apply(): ListDelegatedAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedAdminAccountsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDelegatedAdminAccountsResponse] (val x: Self) extends AnyVal {
    
    inline def setDelegatedAdminAccounts(value: DelegatedAdminAccountList): Self = StObject.set(x, "delegatedAdminAccounts", value.asInstanceOf[js.Any])
    
    inline def setDelegatedAdminAccountsUndefined: Self = StObject.set(x, "delegatedAdminAccounts", js.undefined)
    
    inline def setDelegatedAdminAccountsVarargs(value: DelegatedAdminAccount*): Self = StObject.set(x, "delegatedAdminAccounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
