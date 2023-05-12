package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminScope extends StObject {
  
  /**
    * Defines the accounts that the specified Firewall Manager administrator can apply policies to.
    */
  var AccountScope: js.UndefOr[typings.awsSdk.clientsFmsMod.AccountScope] = js.undefined
  
  /**
    * Defines the Organizations organizational units that the specified Firewall Manager administrator can apply policies to. For more information about OUs in Organizations, see Managing organizational units (OUs)  in the Organizations User Guide.
    */
  var OrganizationalUnitScope: js.UndefOr[typings.awsSdk.clientsFmsMod.OrganizationalUnitScope] = js.undefined
  
  /**
    * Defines the Firewall Manager policy types that the specified Firewall Manager administrator can create and manage.
    */
  var PolicyTypeScope: js.UndefOr[typings.awsSdk.clientsFmsMod.PolicyTypeScope] = js.undefined
  
  /**
    * Defines the Amazon Web Services Regions that the specified Firewall Manager administrator can perform actions in.
    */
  var RegionScope: js.UndefOr[typings.awsSdk.clientsFmsMod.RegionScope] = js.undefined
}
object AdminScope {
  
  inline def apply(): AdminScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminScope] (val x: Self) extends AnyVal {
    
    inline def setAccountScope(value: AccountScope): Self = StObject.set(x, "AccountScope", value.asInstanceOf[js.Any])
    
    inline def setAccountScopeUndefined: Self = StObject.set(x, "AccountScope", js.undefined)
    
    inline def setOrganizationalUnitScope(value: OrganizationalUnitScope): Self = StObject.set(x, "OrganizationalUnitScope", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitScopeUndefined: Self = StObject.set(x, "OrganizationalUnitScope", js.undefined)
    
    inline def setPolicyTypeScope(value: PolicyTypeScope): Self = StObject.set(x, "PolicyTypeScope", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeScopeUndefined: Self = StObject.set(x, "PolicyTypeScope", js.undefined)
    
    inline def setRegionScope(value: RegionScope): Self = StObject.set(x, "RegionScope", value.asInstanceOf[js.Any])
    
    inline def setRegionScopeUndefined: Self = StObject.set(x, "RegionScope", js.undefined)
  }
}
