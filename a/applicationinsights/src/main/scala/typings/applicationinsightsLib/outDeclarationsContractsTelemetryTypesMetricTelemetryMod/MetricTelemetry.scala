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

object MetricTelemetry {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: scala.Double,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    count: scala.Int | scala.Double = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    stdDev: scala.Int | scala.Double = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): MetricTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (stdDev != null) __obj.updateDynamic("stdDev")(stdDev.asInstanceOf[js.Any])
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[MetricTelemetry]
  }
}

