package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTypeScope extends StObject {
  
  /**
    * Allows the specified Firewall Manager administrator to manage all Firewall Manager policy types, except for third-party policy types. Third-party policy types can only be managed by the Firewall Manager default administrator.
    */
  var AllPolicyTypesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of policy types that the specified Firewall Manager administrator can manage.
    */
  var PolicyTypes: js.UndefOr[SecurityServiceTypeList] = js.undefined
}
object PolicyTypeScope {
  
  inline def apply(): PolicyTypeScope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyTypeScope] (val x: Self) extends AnyVal {
    
    inline def setAllPolicyTypesEnabled(value: Boolean): Self = StObject.set(x, "AllPolicyTypesEnabled", value.asInstanceOf[js.Any])
    
    inline def setAllPolicyTypesEnabledUndefined: Self = StObject.set(x, "AllPolicyTypesEnabled", js.undefined)
    
    inline def setPolicyTypes(value: SecurityServiceTypeList): Self = StObject.set(x, "PolicyTypes", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypesUndefined: Self = StObject.set(x, "PolicyTypes", js.undefined)
    
    inline def setPolicyTypesVarargs(value: SecurityServiceType*): Self = StObject.set(x, "PolicyTypes", js.Array(value*))
  }
}
