package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterOrganizationAdminAccountRequest extends StObject {
  
  /**
    *  The identifier for the delegated administrator account. 
    */
  var adminAccountId: AccountId
}
object RegisterOrganizationAdminAccountRequest {
  
  inline def apply(adminAccountId: AccountId): RegisterOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal(adminAccountId = adminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOrganizationAdminAccountRequest]
  }
  
  extension [Self <: RegisterOrganizationAdminAccountRequest](x: Self) {
    
    inline def setAdminAccountId(value: AccountId): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
  }
}
