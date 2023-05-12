package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminAccountSummary extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Firewall Manager administrator's account.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * A boolean value that indicates if the administrator is the default administrator. If true, then this is the default administrator account. The default administrator can manage third-party firewalls and has full administrative scope. There is only one default administrator account per organization. For information about Firewall Manager default administrator accounts, see Managing Firewall Manager administrators in the Firewall Manager Developer Guide.
    */
  var DefaultAdmin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current status of the request to onboard a member account as an Firewall Manager administator.    ONBOARDING - The account is onboarding to Firewall Manager as an administrator.    ONBOARDING_COMPLETE - Firewall Manager The account is onboarded to Firewall Manager as an administrator, and can perform actions on the resources defined in their AdminScope.    OFFBOARDING - The account is being removed as an Firewall Manager administrator.    OFFBOARDING_COMPLETE - The account has been removed as an Firewall Manager administrator.  
    */
  var Status: js.UndefOr[OrganizationStatus] = js.undefined
}
object AdminAccountSummary {
  
  inline def apply(): AdminAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminAccountSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminAccountSummary] (val x: Self) extends AnyVal {
    
    inline def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
    
    inline def setAdminAccountUndefined: Self = StObject.set(x, "AdminAccount", js.undefined)
    
    inline def setDefaultAdmin(value: Boolean): Self = StObject.set(x, "DefaultAdmin", value.asInstanceOf[js.Any])
    
    inline def setDefaultAdminUndefined: Self = StObject.set(x, "DefaultAdmin", js.undefined)
    
    inline def setStatus(value: OrganizationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
