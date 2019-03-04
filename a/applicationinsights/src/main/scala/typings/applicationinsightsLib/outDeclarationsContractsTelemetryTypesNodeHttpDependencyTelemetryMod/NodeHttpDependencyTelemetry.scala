package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesNodeHttpDependencyTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeHttpDependencyTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Request options that will be used to instrument outgoing request
    */
  var options: java.lang.String | httpRequestOptions
  /**
    * Outgoing HTTP request object
    */
  var request: nodeLib.httpMod.ClientRequest
}

object NodeHttpDependencyTelemetry {
  @scala.inline
  def apply(
    options: java.lang.String | httpRequestOptions,
    request: nodeLib.httpMod.ClientRequest,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): NodeHttpDependencyTelemetry = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[NodeHttpDependencyTelemetry]
  }
}

