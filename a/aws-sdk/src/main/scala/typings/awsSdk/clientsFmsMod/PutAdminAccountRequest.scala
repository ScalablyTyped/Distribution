package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAdminAccountRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID to add as an Firewall Manager administrator account. The account must be a member of the organization that was onboarded to Firewall Manager by AssociateAdminAccount. For more information about Organizations, see Managing the Amazon Web Services Accounts in Your Organization.
    */
  var AdminAccount: AWSAccountId
  
  /**
    * Configures the resources that the specified Firewall Manager administrator can manage. As a best practice, set the administrative scope according to the principles of least privilege. Only grant the administrator the specific resources or permissions that they need to perform the duties of their role.
    */
  var AdminScope: js.UndefOr[typings.awsSdk.clientsFmsMod.AdminScope] = js.undefined
}
object PutAdminAccountRequest {
  
  inline def apply(AdminAccount: AWSAccountId): PutAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccount = AdminAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAdminAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAdminAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
    
    inline def setAdminScope(value: AdminScope): Self = StObject.set(x, "AdminScope", value.asInstanceOf[js.Any])
    
    inline def setAdminScopeUndefined: Self = StObject.set(x, "AdminScope", js.undefined)
  }
}
