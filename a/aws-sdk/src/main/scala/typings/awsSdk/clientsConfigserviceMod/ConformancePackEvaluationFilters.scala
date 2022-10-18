package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackEvaluationFilters extends StObject {
  
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT. INSUFFICIENT_DATA is not supported.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * Filters the results by Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.undefined
  
  /**
    * Filters the results by resource IDs.  This is valid only when you provide resource type. If there is no resource type, you will see an error. 
    */
  var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds] = js.undefined
  
  /**
    * Filters the results by the resource type (for example, "AWS::EC2::Instance"). 
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object ConformancePackEvaluationFilters {
  
  inline def apply(): ConformancePackEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackEvaluationFilters]
  }
  
  extension [Self <: ConformancePackEvaluationFilters](x: Self) {
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setConfigRuleNames(value: ConformancePackConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNamesUndefined: Self = StObject.set(x, "ConfigRuleNames", js.undefined)
    
    inline def setConfigRuleNamesVarargs(value: StringWithCharLimit64*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value*))
    
    inline def setResourceIds(value: ConformancePackComplianceResourceIds): Self = StObject.set(x, "ResourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "ResourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: StringWithCharLimit256*): Self = StObject.set(x, "ResourceIds", js.Array(value*))
    
    inline def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
