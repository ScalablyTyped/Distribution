package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseMetricDataResult extends js.Object {
  /**
    * An object describing the result of your get relational database metric data request.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.undefined
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.undefined
}

object GetRelationalDatabaseMetricDataResult {
  @scala.inline
  def apply(metricData: MetricDatapointList = null, metricName: RelationalDatabaseMetricName = null): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (metricData != null) __obj.updateDynamic("metricData")(metricData)
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
}

