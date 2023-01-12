package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrganizationCustomRulePolicyResponse extends StObject {
  
  /**
    * The policy definition containing the logic for your organization Config Custom Policy rule.
    */
  var PolicyText: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.PolicyText] = js.undefined
}
object GetOrganizationCustomRulePolicyResponse {
  
  inline def apply(): GetOrganizationCustomRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOrganizationCustomRulePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOrganizationCustomRulePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setPolicyText(value: PolicyText): Self = StObject.set(x, "PolicyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "PolicyText", js.undefined)
  }
}
