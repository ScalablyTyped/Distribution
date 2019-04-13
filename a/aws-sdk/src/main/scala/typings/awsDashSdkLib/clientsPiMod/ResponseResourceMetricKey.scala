package typings
package awsDashSdkLib.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseResourceMetricKey extends js.Object {
  /**
    * The valid dimensions for the metric.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  /**
    * The name of a Performance Insights metric to be measured. Valid values for Metric are:    db.load.avg - a scaled representation of the number of active sessions for the database engine.    db.sampledload.avg - the raw number of active sessions for the database engine.  
    */
  var Metric: String
}

object ResponseResourceMetricKey {
  @scala.inline
  def apply(Metric: String, Dimensions: DimensionMap = null): ResponseResourceMetricKey = {
    val __obj = js.Dynamic.literal(Metric = Metric)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[ResponseResourceMetricKey]
  }
}

