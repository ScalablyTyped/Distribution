package typings.applicationinsights

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.telemetryTypeMod.TelemetryType
import typings.applicationinsights.telemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/TelemetryTypes", JSImport.Namespace)
@js.native
object telemetryTypesMod extends js.Object {
  def baseTypeToTelemetryType(baseType: TelemetryTypeValues): TelemetryType = js.native
  def telemetryTypeToBaseType(`type`: TelemetryType): TelemetryTypeValues = js.native
  @js.native
  object TelemetryType extends js.Object {
    /* 6 */ val Availability: typings.applicationinsights.telemetryTypeMod.TelemetryType.Availability with Double = js.native
    /* 5 */ val Dependency: typings.applicationinsights.telemetryTypeMod.TelemetryType.Dependency with Double = js.native
    /* 0 */ val Event: typings.applicationinsights.telemetryTypeMod.TelemetryType.Event with Double = js.native
    /* 1 */ val Exception: typings.applicationinsights.telemetryTypeMod.TelemetryType.Exception with Double = js.native
    /* 3 */ val Metric: typings.applicationinsights.telemetryTypeMod.TelemetryType.Metric with Double = js.native
    /* 4 */ val Request: typings.applicationinsights.telemetryTypeMod.TelemetryType.Request with Double = js.native
    /* 2 */ val Trace: typings.applicationinsights.telemetryTypeMod.TelemetryType.Trace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.applicationinsights.telemetryTypeMod.TelemetryType with Double] = js.native
  }
  
  @js.native
  object TelemetryTypeString extends /* key */ StringDictionary[TelemetryTypeValues]
  
}

