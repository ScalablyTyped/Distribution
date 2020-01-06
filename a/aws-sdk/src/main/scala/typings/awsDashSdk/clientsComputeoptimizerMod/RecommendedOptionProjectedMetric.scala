package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommendedOptionProjectedMetric extends js.Object {
  /**
    * An array of objects that describe a projected utilization metric.
    */
  var projectedMetrics: js.UndefOr[ProjectedMetrics] = js.native
  /**
    * The rank of the recommendation option projected metric. The top recommendation option is ranked as 1. The projected metric rank correlates to the recommendation option rank. For example, the projected metric ranked as 1 is related to the recommendation option that is also ranked as 1 in the same response.
    */
  var rank: js.UndefOr[Rank] = js.native
  /**
    * The recommended instance type.
    */
  var recommendedInstanceType: js.UndefOr[RecommendedInstanceType] = js.native
}

object RecommendedOptionProjectedMetric {
  @scala.inline
  def apply(
    projectedMetrics: ProjectedMetrics = null,
    rank: Int | Double = null,
    recommendedInstanceType: RecommendedInstanceType = null
  ): RecommendedOptionProjectedMetric = {
    val __obj = js.Dynamic.literal()
    if (projectedMetrics != null) __obj.updateDynamic("projectedMetrics")(projectedMetrics.asInstanceOf[js.Any])
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    if (recommendedInstanceType != null) __obj.updateDynamic("recommendedInstanceType")(recommendedInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendedOptionProjectedMetric]
  }
}

