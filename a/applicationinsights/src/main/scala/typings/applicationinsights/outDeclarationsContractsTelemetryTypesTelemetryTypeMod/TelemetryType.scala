package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TelemetryType extends js.Object

@JSImport("applicationinsights/out/Declarations/Contracts/TelemetryTypes/TelemetryType", "TelemetryType")
@js.native
object TelemetryType extends js.Object {
  @js.native
  sealed trait Availability extends TelemetryType
  
  @js.native
  sealed trait Dependency extends TelemetryType
  
  @js.native
  sealed trait Event extends TelemetryType
  
  @js.native
  sealed trait Exception extends TelemetryType
  
  @js.native
  sealed trait Metric extends TelemetryType
  
  @js.native
  sealed trait Request extends TelemetryType
  
  @js.native
  sealed trait Trace extends TelemetryType
  
  /* 6 */ val Availability: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Availability with Double = js.native
  /* 5 */ val Dependency: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Dependency with Double = js.native
  /* 0 */ val Event: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Event with Double = js.native
  /* 1 */ val Exception: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Exception with Double = js.native
  /* 3 */ val Metric: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Metric with Double = js.native
  /* 4 */ val Request: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Request with Double = js.native
  /* 2 */ val Trace: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Trace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TelemetryType with Double] = js.native
}

