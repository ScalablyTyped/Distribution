package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentMetricData extends js.Object {
  /**
    * The metric in a CurrentMetricData object.
    */
  var Metric: js.UndefOr[CurrentMetric] = js.undefined
  /**
    * The value of the metric in the CurrentMetricData object.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Value] = js.undefined
}

object CurrentMetricData {
  @scala.inline
  def apply(Metric: CurrentMetric = null, Value: Int | Double = null): CurrentMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMetricData]
  }
}

