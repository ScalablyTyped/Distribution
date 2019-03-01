package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesRequestTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Request duration in ms
    */
  var duration: scala.Double
  /**
    * Request name
    */
  var name: java.lang.String
  /**
    * Result code reported by the application
    */
  var resultCode: java.lang.String | scala.Double
  /**
    * Request source. This encapsulates the information about the component that initiated the request
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the request was successful
    */
  var success: scala.Boolean
  /**
    * Request url
    */
  var url: java.lang.String
}

object RequestTelemetry {
  @scala.inline
  def apply(
    duration: scala.Double,
    name: java.lang.String,
    resultCode: java.lang.String | scala.Double,
    success: scala.Boolean,
    url: java.lang.String,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    source: java.lang.String = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): RequestTelemetry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("resultCode")(resultCode.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("url")(url)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (source != null) __obj.updateDynamic("source")(source)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[RequestTelemetry]
  }
}

