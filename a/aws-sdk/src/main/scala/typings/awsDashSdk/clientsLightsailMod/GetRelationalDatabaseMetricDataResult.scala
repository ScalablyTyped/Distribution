package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMetricDataResult extends js.Object {
  /**
    * An object describing the result of your get relational database metric data request.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[RelationalDatabaseMetricName] = js.native
}

object GetRelationalDatabaseMetricDataResult {
  @scala.inline
  def apply(metricData: MetricDatapointList = null, metricName: RelationalDatabaseMetricName = null): GetRelationalDatabaseMetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (metricData != null) __obj.updateDynamic("metricData")(metricData.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMetricDataResult]
  }
}

