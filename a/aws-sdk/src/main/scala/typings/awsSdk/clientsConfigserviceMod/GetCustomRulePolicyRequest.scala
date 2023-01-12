package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCustomRulePolicyRequest extends StObject {
  
  /**
    * The name of your Config Custom Policy rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleName] = js.undefined
}
object GetCustomRulePolicyRequest {
  
  inline def apply(): GetCustomRulePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCustomRulePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCustomRulePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
