package typings
package awsDashSdkLib.clientsConnectMod

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
  var Value: js.UndefOr[Value] = js.undefined
}

object HistoricalMetricData {
  @scala.inline
  def apply(Metric: HistoricalMetric = null, Value: js.UndefOr[Value] = js.undefined): HistoricalMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[HistoricalMetricData]
  }
}

