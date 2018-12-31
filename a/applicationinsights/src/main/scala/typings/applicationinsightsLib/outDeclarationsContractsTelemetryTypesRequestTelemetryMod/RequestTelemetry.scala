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

