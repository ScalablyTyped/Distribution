package typings.applicationinsights.metricTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.telemetryMod.Telemetry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricTelemetry extends Telemetry {
  /**
    * The number of samples used to get this value
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * The max sample for this set
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The min sample for this set
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * A string that identifies the metric.
    */
  var name: String
  /**
    * The standard deviation of the set
    */
  var stdDev: js.UndefOr[Double] = js.undefined
  /**
    * The value of the metric
    */
  var value: Double
}

object MetricTelemetry {
  @scala.inline
  def apply(
    name: String,
    value: Double,
    contextObjects: StringDictionary[js.Any] = null,
    count: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    properties: StringDictionary[String] = null,
    stdDev: Int | Double = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): MetricTelemetry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (stdDev != null) __obj.updateDynamic("stdDev")(stdDev.asInstanceOf[js.Any])
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTelemetry]
  }
}

