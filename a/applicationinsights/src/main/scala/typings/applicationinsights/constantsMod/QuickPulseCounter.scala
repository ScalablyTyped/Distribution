package typings.applicationinsights.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickPulseCounter extends js.Object

@JSImport("applicationinsights/out/Declarations/Constants", "QuickPulseCounter")
@js.native
object QuickPulseCounter extends js.Object {
  @js.native
  sealed trait COMMITTED_BYTES extends QuickPulseCounter
  
  @js.native
  sealed trait DEPENDENCY_DURATION extends QuickPulseCounter
  
  @js.native
  sealed trait DEPENDENCY_FAILURE_RATE extends QuickPulseCounter
  
  @js.native
  sealed trait DEPENDENCY_RATE extends QuickPulseCounter
  
  @js.native
  sealed trait EXCEPTION_RATE extends QuickPulseCounter
  
  @js.native
  sealed trait PROCESSOR_TIME extends QuickPulseCounter
  
  @js.native
  sealed trait REQUEST_DURATION extends QuickPulseCounter
  
  @js.native
  sealed trait REQUEST_FAILURE_RATE extends QuickPulseCounter
  
  @js.native
  sealed trait REQUEST_RATE extends QuickPulseCounter
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuickPulseCounter with String] = js.native
  /* "\\Memory\\Committed Bytes" */ @js.native
  object COMMITTED_BYTES extends TopLevel[COMMITTED_BYTES with String]
  
  /* "\\ApplicationInsights\\Dependency Call Duration" */ @js.native
  object DEPENDENCY_DURATION extends TopLevel[DEPENDENCY_DURATION with String]
  
  /* "\\ApplicationInsights\\Dependency Calls Failed/Sec" */ @js.native
  object DEPENDENCY_FAILURE_RATE extends TopLevel[DEPENDENCY_FAILURE_RATE with String]
  
  /* "\\ApplicationInsights\\Dependency Calls/Sec" */ @js.native
  object DEPENDENCY_RATE extends TopLevel[DEPENDENCY_RATE with String]
  
  /* "\\ApplicationInsights\\Exceptions/Sec" */ @js.native
  object EXCEPTION_RATE extends TopLevel[EXCEPTION_RATE with String]
  
  /* "\\Processor(_Total)\\% Processor Time" */ @js.native
  object PROCESSOR_TIME extends TopLevel[PROCESSOR_TIME with String]
  
  /* "\\ApplicationInsights\\Request Duration" */ @js.native
  object REQUEST_DURATION extends TopLevel[REQUEST_DURATION with String]
  
  /* "\\ApplicationInsights\\Requests Failed/Sec" */ @js.native
  object REQUEST_FAILURE_RATE extends TopLevel[REQUEST_FAILURE_RATE with String]
  
  /* "\\ApplicationInsights\\Requests/Sec" */ @js.native
  object REQUEST_RATE extends TopLevel[REQUEST_RATE with String]
  
}

