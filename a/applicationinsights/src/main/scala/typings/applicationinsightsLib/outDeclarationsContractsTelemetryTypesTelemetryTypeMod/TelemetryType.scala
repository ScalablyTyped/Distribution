package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TelemetryType extends js.Object

@JSImport("applicationinsights/out/Declarations/Contracts/TelemetryTypes/TelemetryType", "TelemetryType")
@js.native
object TelemetryType extends js.Object {
  @js.native
  sealed trait Dependency
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  @js.native
  sealed trait Event
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  @js.native
  sealed trait Exception
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  @js.native
  sealed trait Metric
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  @js.native
  sealed trait Request
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  @js.native
  sealed trait Trace
    extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  
  /* 5 */ val Dependency: Dependency with scala.Double = js.native
  /* 0 */ val Event: Event with scala.Double = js.native
  /* 1 */ val Exception: Exception with scala.Double = js.native
  /* 3 */ val Metric: Metric with scala.Double = js.native
  /* 4 */ val Request: Request with scala.Double = js.native
  /* 2 */ val Trace: Trace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType with scala.Double
  ] = js.native
}

