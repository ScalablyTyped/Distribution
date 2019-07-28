package typings.applicationinsights.outDeclarationsContractsTelemetryTypesNodeHttpDependencyTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.node.httpMod.ClientRequest
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpDependencyTelemetry extends Telemetry {
  /**
    * Request options that will be used to instrument outgoing request
    */
  var options: String | httpRequestOptions
  /**
    * Outgoing HTTP request object
    */
  var request: ClientRequest
}

object NodeHttpDependencyTelemetry {
  @scala.inline
  def apply(
    options: String | httpRequestOptions,
    request: ClientRequest,
    contextObjects: StringDictionary[js.Any] = null,
    properties: StringDictionary[String] = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): NodeHttpDependencyTelemetry = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[NodeHttpDependencyTelemetry]
  }
}

