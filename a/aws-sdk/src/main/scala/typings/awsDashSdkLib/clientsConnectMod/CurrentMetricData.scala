package typings
package awsDashSdkLib.clientsConnectMod

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
  var Value: js.UndefOr[Value] = js.undefined
}

object CurrentMetricData {
  @scala.inline
  def apply(Metric: CurrentMetric = null, Value: js.UndefOr[Value] = js.undefined): CurrentMetricData = {
    val __obj = js.Dynamic.literal()
    if (Metric != null) __obj.updateDynamic("Metric")(Metric)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[CurrentMetricData]
  }
}

