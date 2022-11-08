package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterOrganizationDelegatedAdminRequest extends StObject {
  
  /**
    * A delegated administrator account ID. This is a member account in an organization that is currently designated as a delegated administrator.
    */
  var DelegatedAdminAccountId: AccountId
}
object DeregisterOrganizationDelegatedAdminRequest {
  
  inline def apply(DelegatedAdminAccountId: AccountId): DeregisterOrganizationDelegatedAdminRequest = {
    val __obj = js.Dynamic.literal(DelegatedAdminAccountId = DelegatedAdminAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterOrganizationDelegatedAdminRequest]
  }
  
  extension [Self <: DeregisterOrganizationDelegatedAdminRequest](x: Self) {
    
    inline def setDelegatedAdminAccountId(value: AccountId): Self = StObject.set(x, "DelegatedAdminAccountId", value.asInstanceOf[js.Any])
  }
}
