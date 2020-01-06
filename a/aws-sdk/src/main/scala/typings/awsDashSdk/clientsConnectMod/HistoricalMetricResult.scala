package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoricalMetricResult extends js.Object {
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.native
  /**
    * The dimension for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Dimensions] = js.native
}

object HistoricalMetricResult {
  @scala.inline
  def apply(Collections: HistoricalMetricDataCollections = null, Dimensions: Dimensions = null): HistoricalMetricResult = {
    val __obj = js.Dynamic.literal()
    if (Collections != null) __obj.updateDynamic("Collections")(Collections.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoricalMetricResult]
  }
}

