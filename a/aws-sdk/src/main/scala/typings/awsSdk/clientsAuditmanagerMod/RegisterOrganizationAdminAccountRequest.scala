package typings.awsSdk.clientsAuditmanagerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccountId(value: AccountId): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
  }
}
