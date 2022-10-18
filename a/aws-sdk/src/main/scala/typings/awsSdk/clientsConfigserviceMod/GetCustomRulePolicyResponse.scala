package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomRulePolicyResponse extends StObject {
  
  /**
    * The policy definition containing the logic for your Config Custom Policy rule.
    */
  var PolicyText: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.PolicyText] = js.undefined
}
object GetCustomRulePolicyResponse {
  
  inline def apply(): GetCustomRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomRulePolicyResponse]
  }
  
  extension [Self <: GetCustomRulePolicyResponse](x: Self) {
    
    inline def setPolicyText(value: PolicyText): Self = StObject.set(x, "PolicyText", value.asInstanceOf[js.Any])
    
    inline def setPolicyTextUndefined: Self = StObject.set(x, "PolicyText", js.undefined)
  }
}
