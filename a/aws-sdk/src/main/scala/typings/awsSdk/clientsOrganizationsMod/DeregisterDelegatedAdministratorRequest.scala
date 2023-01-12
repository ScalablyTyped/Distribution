package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterDelegatedAdministratorRequest extends StObject {
  
  /**
    * The account ID number of the member account in the organization that you want to deregister as a delegated administrator.
    */
  var AccountId: typings.awsSdk.clientsOrganizationsMod.AccountId
  
  /**
    * The service principal name of an Amazon Web Services service for which the account is a delegated administrator. Delegated administrator privileges are revoked for only the specified Amazon Web Services service from the member account. If the specified service is the only service for which the member account is a delegated administrator, the operation also revokes Organizations read action permissions.
    */
  var ServicePrincipal: typings.awsSdk.clientsOrganizationsMod.ServicePrincipal
}
object DeregisterDelegatedAdministratorRequest {
  
  inline def apply(AccountId: AccountId, ServicePrincipal: ServicePrincipal): DeregisterDelegatedAdministratorRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDelegatedAdministratorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterDelegatedAdministratorRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipal(value: ServicePrincipal): Self = StObject.set(x, "ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
