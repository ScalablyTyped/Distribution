package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackEvaluationFilters extends js.Object {
  /**
    * Filters the results by compliance. The allowed values are COMPLIANT and NON_COMPLIANT.
    */
  var ComplianceType: js.UndefOr[ConformancePackComplianceType] = js.native
  /**
    * Filters the results by AWS Config rule names.
    */
  var ConfigRuleNames: js.UndefOr[ConformancePackConfigRuleNames] = js.native
  /**
    * Filters the results by resource IDs.  This is valid only when you provide resource type. If there is no resource type, you will see an error. 
    */
  var ResourceIds: js.UndefOr[ConformancePackComplianceResourceIds] = js.native
  /**
    * Filters the results by the resource type (for example, "AWS::EC2::Instance"). 
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.native
}

object ConformancePackEvaluationFilters {
  @scala.inline
  def apply(
    ComplianceType: ConformancePackComplianceType = null,
    ConfigRuleNames: ConformancePackConfigRuleNames = null,
    ResourceIds: ConformancePackComplianceResourceIds = null,
    ResourceType: StringWithCharLimit256 = null
  ): ConformancePackEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleNames != null) __obj.updateDynamic("ConfigRuleNames")(ConfigRuleNames.asInstanceOf[js.Any])
    if (ResourceIds != null) __obj.updateDynamic("ResourceIds")(ResourceIds.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackEvaluationFilters]
  }
}

