package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoricalMetricResult extends js.Object {
  /**
    * A list of HistoricalMetricData objects.
    */
  var Collections: js.UndefOr[HistoricalMetricDataCollections] = js.undefined
  /**
    * The Dimensions for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Dimensions] = js.undefined
}

object HistoricalMetricResult {
  @scala.inline
  def apply(Collections: HistoricalMetricDataCollections = null, Dimensions: Dimensions = null): HistoricalMetricResult = {
    val __obj = js.Dynamic.literal()
    if (Collections != null) __obj.updateDynamic("Collections")(Collections)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[HistoricalMetricResult]
  }
}

