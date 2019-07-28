package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMetricFiltersResponse extends js.Object {
  /**
    * The metric filters.
    */
  var metricFilters: js.UndefOr[MetricFilters] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeMetricFiltersResponse {
  @scala.inline
  def apply(metricFilters: MetricFilters = null, nextToken: NextToken = null): DescribeMetricFiltersResponse = {
    val __obj = js.Dynamic.literal()
    if (metricFilters != null) __obj.updateDynamic("metricFilters")(metricFilters)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeMetricFiltersResponse]
  }
}

