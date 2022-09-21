package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationAdminAccountResponse extends StObject {
  
  /**
    *  The identifier for the administrator account. 
    */
  var adminAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The identifier for the organization. 
    */
  var organizationId: js.UndefOr[typings.awsSdk.auditmanagerMod.organizationId] = js.undefined
}
object GetOrganizationAdminAccountResponse {
  
  inline def apply(): GetOrganizationAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationAdminAccountResponse]
  }
  
  extension [Self <: GetOrganizationAdminAccountResponse](x: Self) {
    
    inline def setAdminAccountId(value: AccountId): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountIdUndefined: Self = StObject.set(x, "adminAccountId", js.undefined)
    
    inline def setOrganizationId(value: organizationId): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
