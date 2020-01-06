package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetricData extends js.Object {
  /**
    * Information about the metric.
    */
  var Metric: js.UndefOr[CurrentMetric] = js.native
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Value] = js.native
}

object CurrentMetricData {
  @scala.inline
  def apply(Metric: CurrentMetric = null, Value: Int | Double = null): CurrentMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMetricData]
  }
}

