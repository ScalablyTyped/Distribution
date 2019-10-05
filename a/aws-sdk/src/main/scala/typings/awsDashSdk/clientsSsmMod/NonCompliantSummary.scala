package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonCompliantSummary extends js.Object {
  /**
    * The total number of compliance items that are not compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typings.awsDashSdk.clientsSsmMod.SeveritySummary] = js.undefined
}

object NonCompliantSummary {
  @scala.inline
  def apply(NonCompliantCount: Int | Double = null, SeveritySummary: SeveritySummary = null): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    if (NonCompliantCount != null) __obj.updateDynamic("NonCompliantCount")(NonCompliantCount.asInstanceOf[js.Any])
    if (SeveritySummary != null) __obj.updateDynamic("SeveritySummary")(SeveritySummary)
    __obj.asInstanceOf[NonCompliantSummary]
  }
}

