package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComplianceByConfigRule extends StObject {
  
  /**
    * Indicates whether the Config rule is compliant.
    */
  var Compliance: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Compliance] = js.undefined
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
}
object ComplianceByConfigRule {
  
  inline def apply(): ComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceByConfigRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComplianceByConfigRule] (val x: Self) extends AnyVal {
    
    inline def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
