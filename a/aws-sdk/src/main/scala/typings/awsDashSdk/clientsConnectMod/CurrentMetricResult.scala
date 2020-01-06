package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentMetricResult extends js.Object {
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[CurrentMetricDataCollections] = js.native
  /**
    * The dimensions for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Dimensions] = js.native
}

object CurrentMetricResult {
  @scala.inline
  def apply(Collections: CurrentMetricDataCollections = null, Dimensions: Dimensions = null): CurrentMetricResult = {
    val __obj = js.Dynamic.literal()
    if (Collections != null) __obj.updateDynamic("Collections")(Collections.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentMetricResult]
  }
}

