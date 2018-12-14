package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesExceptionTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExceptionTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
       * Exception thrown
       */
  var exception: nodeLib.Error
  /**
       * Metrics associated with this exception, displayed in Metrics Explorer on the portal. Defaults to empty
       */
  var measurements: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

