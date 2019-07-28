package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMetricFiltersRequest extends js.Object {
  /**
    * The prefix to match.
    */
  var filterNamePrefix: js.UndefOr[FilterName] = js.undefined
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * Filters results to include only those with the specified metric name. If you include this parameter in your request, you must also include the metricNamespace parameter.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  /**
    * Filters results to include only those in the specified namespace. If you include this parameter in your request, you must also include the metricName parameter.
    */
  var metricNamespace: js.UndefOr[MetricNamespace] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeMetricFiltersRequest {
  @scala.inline
  def apply(
    filterNamePrefix: FilterName = null,
    limit: js.UndefOr[DescribeLimit] = js.undefined,
    logGroupName: LogGroupName = null,
    metricName: MetricName = null,
    metricNamespace: MetricNamespace = null,
    nextToken: NextToken = null
  ): DescribeMetricFiltersRequest = {
    val __obj = js.Dynamic.literal()
    if (filterNamePrefix != null) __obj.updateDynamic("filterNamePrefix")(filterNamePrefix)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (metricNamespace != null) __obj.updateDynamic("metricNamespace")(metricNamespace)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeMetricFiltersRequest]
  }
}

