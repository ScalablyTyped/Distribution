package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSsmComplianceSummary extends StObject {
  
  /**
    * The type of resource for which the compliance was determined. For AwsSsmPatchCompliance, ComplianceType is Patch. 
    */
  var ComplianceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of CRITICAL.
    */
  var CompliantCriticalCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of HIGH.
    */
  var CompliantHighCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of INFORMATIONAL.
    */
  var CompliantInformationalCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of LOW.
    */
  var CompliantLowCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of MEDIUM.
    */
  var CompliantMediumCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are compliant, the number that have a severity of UNSPECIFIED.
    */
  var CompliantUnspecifiedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of execution that was used determine compliance.
    */
  var ExecutionType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For the patch items that are noncompliant, the number of items that have a severity of CRITICAL.
    */
  var NonCompliantCriticalCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are noncompliant, the number that have a severity of HIGH.
    */
  var NonCompliantHighCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are noncompliant, the number that have a severity of INFORMATIONAL.
    */
  var NonCompliantInformationalCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are noncompliant, the number that have a severity of LOW.
    */
  var NonCompliantLowCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are noncompliant, the number that have a severity of MEDIUM.
    */
  var NonCompliantMediumCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * For the patches that are noncompliant, the number that have a severity of UNSPECIFIED.
    */
  var NonCompliantUnspecifiedCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The highest severity for the patches. Valid values are as follows:    CRITICAL     HIGH     MEDIUM     LOW     INFORMATIONAL     UNSPECIFIED   
    */
  var OverallSeverity: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the patch baseline. The patch baseline lists the patches that are approved for installation.
    */
  var PatchBaselineId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the patch group for which compliance was determined. A patch group uses tags to group EC2 instances that should have the same patch compliance.
    */
  var PatchGroup: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current patch compliance status. Valid values are as follows:    COMPLIANT     NON_COMPLIANT     UNSPECIFIED_DATA   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSsmComplianceSummary {
  
  inline def apply(): AwsSsmComplianceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSsmComplianceSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSsmComplianceSummary] (val x: Self) extends AnyVal {
    
    inline def setComplianceType(value: NonEmptyString): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    inline def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    inline def setCompliantCriticalCount(value: Integer): Self = StObject.set(x, "CompliantCriticalCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantCriticalCountUndefined: Self = StObject.set(x, "CompliantCriticalCount", js.undefined)
    
    inline def setCompliantHighCount(value: Integer): Self = StObject.set(x, "CompliantHighCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantHighCountUndefined: Self = StObject.set(x, "CompliantHighCount", js.undefined)
    
    inline def setCompliantInformationalCount(value: Integer): Self = StObject.set(x, "CompliantInformationalCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantInformationalCountUndefined: Self = StObject.set(x, "CompliantInformationalCount", js.undefined)
    
    inline def setCompliantLowCount(value: Integer): Self = StObject.set(x, "CompliantLowCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantLowCountUndefined: Self = StObject.set(x, "CompliantLowCount", js.undefined)
    
    inline def setCompliantMediumCount(value: Integer): Self = StObject.set(x, "CompliantMediumCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantMediumCountUndefined: Self = StObject.set(x, "CompliantMediumCount", js.undefined)
    
    inline def setCompliantUnspecifiedCount(value: Integer): Self = StObject.set(x, "CompliantUnspecifiedCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantUnspecifiedCountUndefined: Self = StObject.set(x, "CompliantUnspecifiedCount", js.undefined)
    
    inline def setExecutionType(value: NonEmptyString): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setExecutionTypeUndefined: Self = StObject.set(x, "ExecutionType", js.undefined)
    
    inline def setNonCompliantCriticalCount(value: Integer): Self = StObject.set(x, "NonCompliantCriticalCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantCriticalCountUndefined: Self = StObject.set(x, "NonCompliantCriticalCount", js.undefined)
    
    inline def setNonCompliantHighCount(value: Integer): Self = StObject.set(x, "NonCompliantHighCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantHighCountUndefined: Self = StObject.set(x, "NonCompliantHighCount", js.undefined)
    
    inline def setNonCompliantInformationalCount(value: Integer): Self = StObject.set(x, "NonCompliantInformationalCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantInformationalCountUndefined: Self = StObject.set(x, "NonCompliantInformationalCount", js.undefined)
    
    inline def setNonCompliantLowCount(value: Integer): Self = StObject.set(x, "NonCompliantLowCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantLowCountUndefined: Self = StObject.set(x, "NonCompliantLowCount", js.undefined)
    
    inline def setNonCompliantMediumCount(value: Integer): Self = StObject.set(x, "NonCompliantMediumCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantMediumCountUndefined: Self = StObject.set(x, "NonCompliantMediumCount", js.undefined)
    
    inline def setNonCompliantUnspecifiedCount(value: Integer): Self = StObject.set(x, "NonCompliantUnspecifiedCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantUnspecifiedCountUndefined: Self = StObject.set(x, "NonCompliantUnspecifiedCount", js.undefined)
    
    inline def setOverallSeverity(value: NonEmptyString): Self = StObject.set(x, "OverallSeverity", value.asInstanceOf[js.Any])
    
    inline def setOverallSeverityUndefined: Self = StObject.set(x, "OverallSeverity", js.undefined)
    
    inline def setPatchBaselineId(value: NonEmptyString): Self = StObject.set(x, "PatchBaselineId", value.asInstanceOf[js.Any])
    
    inline def setPatchBaselineIdUndefined: Self = StObject.set(x, "PatchBaselineId", js.undefined)
    
    inline def setPatchGroup(value: NonEmptyString): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
