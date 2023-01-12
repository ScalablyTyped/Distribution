package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsResponse extends StObject {
  
  /**
    * A list of accounts configured as GuardDuty delegated administrators.
    */
  var AdminAccounts: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.AdminAccounts] = js.undefined
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
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
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
