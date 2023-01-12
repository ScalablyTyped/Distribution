package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateConformancePackComplianceSummary extends StObject {
  
  /**
    * Returns an AggregateConformancePackComplianceCount object. 
    */
  var ComplianceSummary: js.UndefOr[AggregateConformancePackComplianceCount] = js.undefined
  
  /**
    * Groups the result based on Amazon Web Services account ID or Amazon Web Services Region.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
}
object AggregateConformancePackComplianceSummary {
  
  inline def apply(): AggregateConformancePackComplianceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateConformancePackComplianceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateConformancePackComplianceSummary] (val x: Self) extends AnyVal {
    
    inline def setComplianceSummary(value: AggregateConformancePackComplianceCount): Self = StObject.set(x, "ComplianceSummary", value.asInstanceOf[js.Any])
    
    inline def setComplianceSummaryUndefined: Self = StObject.set(x, "ComplianceSummary", js.undefined)
    
    inline def setGroupName(value: StringWithCharLimit256): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
