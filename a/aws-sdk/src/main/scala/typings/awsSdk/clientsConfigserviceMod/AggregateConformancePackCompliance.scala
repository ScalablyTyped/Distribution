package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateConformancePackCompliance extends StObject {
  
  /**
    * The compliance status of the conformance pack.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.undefined
  
  /**
    * The number of compliant Config Rules.
    */
  var CompliantRuleCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of noncompliant Config Rules.
    */
  var NonCompliantRuleCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * Total number of compliant rules, noncompliant rules, and the rules that do not have any applicable resources to evaluate upon resulting in insufficient data.
    */
  var TotalRuleCount: js.UndefOr[Integer] = js.undefined
}
object AggregateConformancePackCompliance {
  
  inline def apply(): AggregateConformancePackCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateConformancePackCompliance]
  }
  
  extension [Self <: AggregateConformancePackCompliance](x: Self) {
    
    inline def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setCompliantRuleCount(value: Integer): Self = StObject.set(x, "CompliantRuleCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantRuleCountUndefined: Self = StObject.set(x, "CompliantRuleCount", js.undefined)
    
    inline def setNonCompliantRuleCount(value: Integer): Self = StObject.set(x, "NonCompliantRuleCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantRuleCountUndefined: Self = StObject.set(x, "NonCompliantRuleCount", js.undefined)
    
    inline def setTotalRuleCount(value: Integer): Self = StObject.set(x, "TotalRuleCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRuleCountUndefined: Self = StObject.set(x, "TotalRuleCount", js.undefined)
  }
}
