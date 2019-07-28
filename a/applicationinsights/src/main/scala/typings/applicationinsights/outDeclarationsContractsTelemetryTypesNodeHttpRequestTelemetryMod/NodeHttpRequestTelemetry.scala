package typings.applicationinsights.outDeclarationsContractsTelemetryTypesNodeHttpRequestTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpRequestTelemetry extends Telemetry {
  /**
    * HTTP request duration. Used only for synchronous tracks.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Error that occurred while processing the request. Used only for synchronous tracks.
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * HTTP request object
    */
  var request: IncomingMessage
  /**
    * HTTP response object
    */
  var response: ServerResponse
}

object NodeHttpRequestTelemetry {
  @scala.inline
  def apply(
    request: IncomingMessage,
    response: ServerResponse,
    contextObjects: StringDictionary[js.Any] = null,
    duration: Int | Double = null,
    error: js.Any = null,
    properties: StringDictionary[String] = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
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

