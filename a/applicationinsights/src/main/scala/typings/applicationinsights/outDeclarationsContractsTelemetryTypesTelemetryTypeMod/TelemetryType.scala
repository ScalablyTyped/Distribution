package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TelemetryType with Double] = js.native
  /* 6 */ @js.native
  object Availability extends TopLevel[Availability with Double]
  
  /* 5 */ @js.native
  object Dependency extends TopLevel[Dependency with Double]
  
  /* 0 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  /* 1 */ @js.native
  object Exception extends TopLevel[Exception with Double]
  
  /* 3 */ @js.native
  object Metric extends TopLevel[Metric with Double]
  
  /* 4 */ @js.native
  object Request extends TopLevel[Request with Double]
  
  /* 2 */ @js.native
  object Trace extends TopLevel[Trace with Double]
  
}

