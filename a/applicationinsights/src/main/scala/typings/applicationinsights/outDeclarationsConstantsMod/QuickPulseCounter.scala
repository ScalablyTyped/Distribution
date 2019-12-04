package typings.applicationinsights.outDeclarationsConstantsMod

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
  
  /* "\\Memory\\Committed Bytes" */ val COMMITTED_BYTES: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.COMMITTED_BYTES with String = js.native
  /* "\\ApplicationInsights\\Dependency Call Duration" */ val DEPENDENCY_DURATION: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.DEPENDENCY_DURATION with String = js.native
  /* "\\ApplicationInsights\\Dependency Calls Failed/Sec" */ val DEPENDENCY_FAILURE_RATE: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.DEPENDENCY_FAILURE_RATE with String = js.native
  /* "\\ApplicationInsights\\Dependency Calls/Sec" */ val DEPENDENCY_RATE: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.DEPENDENCY_RATE with String = js.native
  /* "\\ApplicationInsights\\Exceptions/Sec" */ val EXCEPTION_RATE: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.EXCEPTION_RATE with String = js.native
  /* "\\Processor(_Total)\\% Processor Time" */ val PROCESSOR_TIME: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.PROCESSOR_TIME with String = js.native
  /* "\\ApplicationInsights\\Request Duration" */ val REQUEST_DURATION: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.REQUEST_DURATION with String = js.native
  /* "\\ApplicationInsights\\Requests Failed/Sec" */ val REQUEST_FAILURE_RATE: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.REQUEST_FAILURE_RATE with String = js.native
  /* "\\ApplicationInsights\\Requests/Sec" */ val REQUEST_RATE: typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseCounter.REQUEST_RATE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[QuickPulseCounter with String] = js.native
}

