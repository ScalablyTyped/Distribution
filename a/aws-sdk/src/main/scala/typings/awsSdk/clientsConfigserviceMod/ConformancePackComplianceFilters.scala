package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceFilters extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT. INSUFFICIENT_DATA is not supported.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Filters the results by Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.undefined
}
object ConformancePackComplianceFilters {
  
  inline def apply(): ConformancePackComplianceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackComplianceFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConformancePackComplianceFilters] (val x: Self) extends AnyVal {
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    inline def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value*))
  }
}
