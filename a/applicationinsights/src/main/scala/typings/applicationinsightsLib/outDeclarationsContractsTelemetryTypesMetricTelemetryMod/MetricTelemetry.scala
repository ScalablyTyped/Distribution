package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesMetricTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * The number of samples used to get this value
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  /**
    * The max sample for this set
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The min sample for this set
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * A string that identifies the metric.
    */
  var name: java.lang.String
  /**
    * The standard deviation of the set
    */
  var stdDev: js.UndefOr[scala.Double] = js.undefined
  /**
    * The value of the metric
    */
  var value: scala.Double
}

