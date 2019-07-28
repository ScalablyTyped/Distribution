package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceSummary extends js.Object {
  /**
    * The time that AWS Config created the compliance summary.
    */
  var ComplianceSummaryTimestamp: js.UndefOr[_Date] = js.undefined
  /**
    * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
  /**
    * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.undefined
}

object ComplianceSummary {
  @scala.inline
  def apply(
    ComplianceSummaryTimestamp: _Date = null,
    CompliantResourceCount: ComplianceContributorCount = null,
    NonCompliantResourceCount: ComplianceContributorCount = null
  ): ComplianceSummary = {
    val __obj = js.Dynamic.literal()
    if (ComplianceSummaryTimestamp != null) __obj.updateDynamic("ComplianceSummaryTimestamp")(ComplianceSummaryTimestamp)
    if (CompliantResourceCount != null) __obj.updateDynamic("CompliantResourceCount")(CompliantResourceCount)
    if (NonCompliantResourceCount != null) __obj.updateDynamic("NonCompliantResourceCount")(NonCompliantResourceCount)
    __obj.asInstanceOf[ComplianceSummary]
  }
}

