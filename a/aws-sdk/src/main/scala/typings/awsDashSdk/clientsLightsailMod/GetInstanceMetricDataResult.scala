package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceMetricDataResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your get instance metric data request.
    */
  var metricData: js.UndefOr[MetricDatapointList] = js.native
  /**
    * The metric name to return data for.
    */
  var metricName: js.UndefOr[InstanceMetricName] = js.native
}

object GetInstanceMetricDataResult {
  @scala.inline
  def apply(metricData: MetricDatapointList = null, metricName: InstanceMetricName = null): GetInstanceMetricDataResult = {
    val __obj = js.Dynamic.literal()
    if (metricData != null) __obj.updateDynamic("metricData")(metricData.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceMetricDataResult]
  }
}

