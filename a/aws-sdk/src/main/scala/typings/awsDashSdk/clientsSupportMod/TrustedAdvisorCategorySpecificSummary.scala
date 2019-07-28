package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorCategorySpecificSummary extends js.Object {
  /**
    * The summary information about cost savings for a Trusted Advisor check that is in the Cost Optimizing category.
    */
  var costOptimizing: js.UndefOr[TrustedAdvisorCostOptimizingSummary] = js.undefined
}

object TrustedAdvisorCategorySpecificSummary {
  @scala.inline
  def apply(costOptimizing: TrustedAdvisorCostOptimizingSummary = null): TrustedAdvisorCategorySpecificSummary = {
    val __obj = js.Dynamic.literal()
    if (costOptimizing != null) __obj.updateDynamic("costOptimizing")(costOptimizing)
    __obj.asInstanceOf[TrustedAdvisorCategorySpecificSummary]
  }
}

