package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateComplianceCount extends StObject {
  
  /**
    * The number of compliant and noncompliant Config rules.
    */
  var ComplianceSummary: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ComplianceSummary] = js.undefined
  
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object AggregateComplianceCount {
  
  inline def apply(): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceCount]
  }
  
  extension [Self <: AggregateComplianceCount](x: Self) {
    
    inline def setComplianceSummary(value: ComplianceSummary): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
    
    inline def setGroupName(value: StringWithCharLimit256): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
