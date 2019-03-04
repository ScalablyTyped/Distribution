package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesNodeHttpRequestTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpRequestTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * HTTP request duration. Used only for synchronous tracks.
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Error that occurred while processing the request. Used only for synchronous tracks.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * HTTP request object
    */
  var request: nodeLib.httpMod.IncomingMessage
  /**
    * HTTP response object
    */
  var response: nodeLib.httpMod.ServerResponse
}

object NodeHttpRequestTelemetry {
  @scala.inline
  def apply(
    request: nodeLib.httpMod.IncomingMessage,
    response: nodeLib.httpMod.ServerResponse,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    duration: scala.Int | scala.Double = null,
    error: js.Any = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): NodeHttpRequestTelemetry = {
    val __obj = js.Dynamic.literal(request = request, response = response)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[NodeHttpRequestTelemetry]
  }
}

