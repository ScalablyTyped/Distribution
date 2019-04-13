package typings
package awsDashSdkLib.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricKeyDataPoints extends js.Object {
  /**
    * An array of timestamp-value pairs, representing measurements over a period of time.
    */
  var DataPoints: js.UndefOr[DataPointsList] = js.undefined
  /**
    * The dimension(s) to which the data points apply.
    */
  var Key: js.UndefOr[ResponseResourceMetricKey] = js.undefined
}

object MetricKeyDataPoints {
  @scala.inline
  def apply(DataPoints: DataPointsList = null, Key: ResponseResourceMetricKey = null): MetricKeyDataPoints = {
    val __obj = js.Dynamic.literal()
    if (DataPoints != null) __obj.updateDynamic("DataPoints")(DataPoints)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    __obj.asInstanceOf[MetricKeyDataPoints]
  }
}

