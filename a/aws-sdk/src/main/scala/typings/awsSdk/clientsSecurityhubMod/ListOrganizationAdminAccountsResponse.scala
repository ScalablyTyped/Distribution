package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsResponse extends StObject {
  
  /**
    * The list of Security Hub administrator accounts.
    */
  var AdminAccounts: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.AdminAccounts] = js.undefined
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.NextToken] = js.undefined
}
object ListOrganizationAdminAccountsResponse {
  
  inline def apply(): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOrganizationAdminAccountsResponse] (val x: Self) extends AnyVal {
    
    inline def setAdminAccounts(value: AdminAccounts): Self = StObject.set(x, "AdminAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountsUndefined: Self = StObject.set(x, "AdminAccounts", js.undefined)
    
    inline def setAdminAccountsVarargs(value: AdminAccount*): Self = StObject.set(x, "AdminAccounts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
