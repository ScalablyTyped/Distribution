package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdminScopeResponse extends StObject {
  
  /**
    * Contains details about the administrative scope of the requested account.
    */
  var AdminScope: js.UndefOr[typings.awsSdk.clientsFmsMod.AdminScope] = js.undefined
  
  /**
    * The current status of the request to onboard a member account as an Firewall Manager administator.    ONBOARDING - The account is onboarding to Firewall Manager as an administrator.    ONBOARDING_COMPLETE - Firewall Manager The account is onboarded to Firewall Manager as an administrator, and can perform actions on the resources defined in their AdminScope.    OFFBOARDING - The account is being removed as an Firewall Manager administrator.    OFFBOARDING_COMPLETE - The account has been removed as an Firewall Manager administrator.  
    */
  var Status: js.UndefOr[OrganizationStatus] = js.undefined
}
object GetAdminScopeResponse {
  
  inline def apply(): GetAdminScopeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdminScopeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAdminScopeResponse] (val x: Self) extends AnyVal {
    
    inline def setAdminScope(value: AdminScope): Self = StObject.set(x, "AdminScope", value.asInstanceOf[js.Any])
    
    inline def setAdminScopeUndefined: Self = StObject.set(x, "AdminScope", js.undefined)
    
    inline def setStatus(value: OrganizationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
