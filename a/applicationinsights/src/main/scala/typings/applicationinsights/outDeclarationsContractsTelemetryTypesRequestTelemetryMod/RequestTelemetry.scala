package typings.applicationinsights.outDeclarationsContractsTelemetryTypesRequestTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTelemetry extends Telemetry {
  /**
    * Request duration in ms
    */
  var duration: Double
  /**
    * Request name
    */
  var name: String
  /**
    * Result code reported by the application
    */
  var resultCode: String | Double
  /**
    * Request source. This encapsulates the information about the component that initiated the request
    */
  var source: js.UndefOr[String] = js.undefined
  /**
    * Whether the request was successful
    */
  var success: Boolean
  /**
    * Request url
    */
  var url: String
}

object RequestTelemetry {
  @scala.inline
  def apply(
    duration: Double,
    name: String,
    resultCode: String | Double,
    success: Boolean,
    url: String,
    contextObjects: StringDictionary[js.Any] = null,
    properties: StringDictionary[String] = null,
    source: String = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): RequestTelemetry = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTelemetry]
  }
}

