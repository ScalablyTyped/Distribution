package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterOrganizationAdminAccountRequest extends StObject {
  
  /**
    *  The identifier for the administrator account. 
    */
  var adminAccountId: js.UndefOr[AccountId] = js.undefined
}
object DeregisterOrganizationAdminAccountRequest {
  
  inline def apply(): DeregisterOrganizationAdminAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterOrganizationAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterOrganizationAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccountId(value: AccountId): Self = StObject.set(x, "adminAccountId", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountIdUndefined: Self = StObject.set(x, "adminAccountId", js.undefined)
  }
}
