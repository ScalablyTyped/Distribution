package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesEventTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Metrics associated with this event, displayed in Metrics Explorer on the portal.
    */
  var measurements: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * Name of the event
    */
  var name: java.lang.String
}

