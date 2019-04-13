package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentMetricResult extends js.Object {
  /**
    * The Collections for the CurrentMetricResult object.
    */
  var Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined
  /**
    * The Dimensions for the CurrentMetricResult object.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
}

object CurrentMetricResult {
  @scala.inline
  def apply(Collections: CurrentMetricDataCollections = null, Dimensions: Dimensions = null): CurrentMetricResult = {
    val __obj = js.Dynamic.literal()
    if (Collections != null) __obj.updateDynamic("Collections")(Collections)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[CurrentMetricResult]
  }
}

