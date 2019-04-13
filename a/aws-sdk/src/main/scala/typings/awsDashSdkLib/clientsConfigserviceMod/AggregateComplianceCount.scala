package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateComplianceCount extends js.Object {
  /**
    * The number of compliant and noncompliant AWS Config rules.
    */
  var ComplianceSummary: js.UndefOr[ComplianceSummary] = js.undefined
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object AggregateComplianceCount {
  @scala.inline
  def apply(ComplianceSummary: ComplianceSummary = null, GroupName: StringWithCharLimit256 = null): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummary != null) __obj.updateDynamic("ComplianceSummary")(ComplianceSummary)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    __obj.asInstanceOf[AggregateComplianceCount]
  }
}

