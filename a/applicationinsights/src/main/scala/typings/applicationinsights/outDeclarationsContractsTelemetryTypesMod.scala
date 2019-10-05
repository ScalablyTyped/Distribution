package typings.applicationinsights

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/TelemetryTypes", JSImport.Namespace)
@js.native
object outDeclarationsContractsTelemetryTypesMod extends js.Object {
  def baseTypeToTelemetryType(baseType: TelemetryTypeValues): TelemetryType = js.native
  def telemetryTypeToBaseType(`type`: TelemetryType): TelemetryTypeValues = js.native
  @js.native
  object TelemetryType extends js.Object {
    /* 5 */ val Dependency: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Dependency with Double = js.native
    /* 0 */ val Event: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Event with Double = js.native
    /* 1 */ val Exception: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Exception with Double = js.native
    /* 3 */ val Metric: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Metric with Double = js.native
    /* 4 */ val Request: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Request with Double = js.native
    /* 2 */ val Trace: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Trace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType with Double
      ] = js.native
  }
  
  @js.native
  object TelemetryTypeString extends /* key */ StringDictionary[TelemetryTypeValues]
  
}

