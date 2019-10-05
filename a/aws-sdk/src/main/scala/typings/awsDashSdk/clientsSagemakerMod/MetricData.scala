package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricData extends js.Object {
  /**
    * The name of the metric.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MetricName] = js.undefined
  /**
    * The date and time that the algorithm emitted the metric.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.Timestamp] = js.undefined
  /**
    * The value of the metric.
    */
  var Value: js.UndefOr[Float] = js.undefined
}

object MetricData {
  @scala.inline
  def apply(MetricName: MetricName = null, Timestamp: Timestamp = null, Value: Int | Double = null): MetricData = {
    val __obj = js.Dynamic.literal()
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricData]
  }
}

