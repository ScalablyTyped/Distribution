package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesTraceTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Trace message
    */
  var message: java.lang.String
  /**
    * Trace severity level
    */
  var severity: js.UndefOr[
    applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  ] = js.undefined
}

