package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoricalMetricData extends js.Object {
  /**
    * A HistoricalMetric object.
    */
  var Metric: js.UndefOr[HistoricalMetric] = js.undefined
  /**
    * The Value of the metric.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Value] = js.undefined
}

object HistoricalMetricData {
  @scala.inline
  def apply(Metric: HistoricalMetric = null, Value: Int | Double = null): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoricalMetricData]
  }
}

