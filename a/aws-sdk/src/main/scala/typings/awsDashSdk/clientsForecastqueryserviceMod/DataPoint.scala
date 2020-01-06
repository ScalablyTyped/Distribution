package typings.awsDashSdk.clientsForecastqueryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPoint extends js.Object {
  /**
    * The timestamp of the specific forecast.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsForecastqueryserviceMod.Timestamp] = js.native
  /**
    * The forecast value.
    */
  var Value: js.UndefOr[Double] = js.native
}

object DataPoint {
  @scala.inline
  def apply(Timestamp: Timestamp = null, Value: Int | scala.Double = null): DataPoint = {
    val __obj = js.Dynamic.literal()
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPoint]
  }
}

