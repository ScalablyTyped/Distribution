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

