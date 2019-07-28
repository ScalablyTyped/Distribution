package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceSummaryByResourceType extends js.Object {
  /**
    * The number of AWS resources that are compliant or noncompliant, up to a maximum of 100 for each.
    */
  var ComplianceSummary: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceSummary] = js.undefined
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object ComplianceSummaryByResourceType {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null, ResourceType: StringWithCharLimit256 = null): ComplianceSummaryByResourceType = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[ComplianceSummaryByResourceType]
  }
}

