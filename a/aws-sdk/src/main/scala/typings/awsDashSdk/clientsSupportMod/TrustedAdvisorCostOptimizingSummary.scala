package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedAdvisorCostOptimizingSummary extends js.Object {
  /**
    * The estimated monthly savings that might be realized if the recommended actions are taken.
    */
  var estimatedMonthlySavings: Double
  /**
    * The estimated percentage of savings that might be realized if the recommended actions are taken.
    */
  var estimatedPercentMonthlySavings: Double
}

object TrustedAdvisorCostOptimizingSummary {
  @scala.inline
  def apply(estimatedMonthlySavings: Double, estimatedPercentMonthlySavings: Double): TrustedAdvisorCostOptimizingSummary = {
    val __obj = js.Dynamic.literal(estimatedMonthlySavings = estimatedMonthlySavings, estimatedPercentMonthlySavings = estimatedPercentMonthlySavings)
  
    __obj.asInstanceOf[TrustedAdvisorCostOptimizingSummary]
  }
}

