package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMetricCollectionTypesAnswer extends js.Object {
  /**
    * The granularities for the metrics.
    */
  var Granularities: js.UndefOr[MetricGranularityTypes] = js.undefined
  /**
    * One or more metrics.
    */
  var Metrics: js.UndefOr[MetricCollectionTypes] = js.undefined
}

object DescribeMetricCollectionTypesAnswer {
  @scala.inline
  def apply(Granularities: MetricGranularityTypes = null, Metrics: MetricCollectionTypes = null): DescribeMetricCollectionTypesAnswer = {
    val __obj = js.Dynamic.literal()
    if (Granularities != null) __obj.updateDynamic("Granularities")(Granularities)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
  }
}

