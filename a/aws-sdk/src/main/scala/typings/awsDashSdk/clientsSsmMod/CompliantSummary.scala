package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompliantSummary extends js.Object {
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SeveritySummary] = js.undefined
}

object CompliantSummary {
  @scala.inline
  def apply(CompliantCount: Int | Double = null, SeveritySummary: SeveritySummary = null): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    if (CompliantCount != null) __obj.updateDynamic("CompliantCount")(CompliantCount.asInstanceOf[js.Any])
    if (SeveritySummary != null) __obj.updateDynamic("SeveritySummary")(SeveritySummary)
    __obj.asInstanceOf[CompliantSummary]
  }
}

