package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrganizationAdminAccountsResponse extends StObject {
  
  /**
    * An array of objects, one for each delegated Amazon Macie administrator account for the organization. Only one of these accounts can have a status of ENABLED.
    */
  var adminAccounts: js.UndefOr[listOfAdminAccount] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListOrganizationAdminAccountsResponse {
  
  inline def apply(): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
  
  extension [Self <: ListOrganizationAdminAccountsResponse](x: Self) {
    
    inline def setAdminAccounts(value: listOfAdminAccount): Self = StObject.set(x, "adminAccounts", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountsUndefined: Self = StObject.set(x, "adminAccounts", js.undefined)
    
    inline def setAdminAccountsVarargs(value: AdminAccount*): Self = StObject.set(x, "adminAccounts", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
