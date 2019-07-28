package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceComplianceSummaryItem extends js.Object {
  /**
    * The compliance type.
    */
  var ComplianceType: js.UndefOr[ComplianceTypeName] = js.undefined
  /**
    * A list of items that are compliant for the resource.
    */
  var CompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.CompliantSummary] = js.undefined
  /**
    * Information about the execution.
    */
  var ExecutionSummary: js.UndefOr[ComplianceExecutionSummary] = js.undefined
  /**
    * A list of items that aren't compliant for the resource.
    */
  var NonCompliantSummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NonCompliantSummary] = js.undefined
  /**
    * The highest severity item found for the resource. The resource is compliant for this item.
    */
  var OverallSeverity: js.UndefOr[ComplianceSeverity] = js.undefined
  /**
    * The resource ID.
    */
  var ResourceId: js.UndefOr[ComplianceResourceId] = js.undefined
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[ComplianceResourceType] = js.undefined
  /**
    * The compliance status for the resource.
    */
  var Status: js.UndefOr[ComplianceStatus] = js.undefined
}

object ResourceComplianceSummaryItem {
  @scala.inline
  def apply(
    ComplianceType: ComplianceTypeName = null,
    CompliantSummary: CompliantSummary = null,
    ExecutionSummary: ComplianceExecutionSummary = null,
    NonCompliantSummary: NonCompliantSummary = null,
    OverallSeverity: ComplianceSeverity = null,
    ResourceId: ComplianceResourceId = null,
    ResourceType: ComplianceResourceType = null,
    Status: ComplianceStatus = null
  ): ResourceComplianceSummaryItem = {
    val __obj = js.Dynamic.literal()
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType)
    if (CompliantSummary != null) __obj.updateDynamic("CompliantSummary")(CompliantSummary)
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary)
    if (NonCompliantSummary != null) __obj.updateDynamic("NonCompliantSummary")(NonCompliantSummary)
    if (OverallSeverity != null) __obj.updateDynamic("OverallSeverity")(OverallSeverity.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceComplianceSummaryItem]
  }
}

