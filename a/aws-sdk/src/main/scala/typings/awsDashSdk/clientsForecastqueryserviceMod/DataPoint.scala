package typings.awsDashSdk.clientsForecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataPoint extends js.Object {
  /**
    * The timestamp of the specific forecast.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsForecastqueryserviceMod.Timestamp] = js.undefined
  /**
    * The forecast value.
    */
  var Value: js.UndefOr[Double] = js.undefined
}

object DataPoint {
  @scala.inline
  def apply(Timestamp: Timestamp = null, Value: Int | scala.Double = null): DataPoint = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

