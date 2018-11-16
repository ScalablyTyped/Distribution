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

