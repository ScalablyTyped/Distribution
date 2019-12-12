package typings.applicationinsights.outDeclarationsConstantsMod

import org.scalablytyped.runtime.TopLevel
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.AVAILABLE_BYTES
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PRIVATE_BYTES
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PROCESSOR_TIME
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.PROCESS_TIME
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.REQUEST_DURATION
import typings.applicationinsights.outDeclarationsConstantsMod.PerformanceCounter.REQUEST_RATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PerformanceCounter extends js.Object

@JSImport("applicationinsights/out/Declarations/Constants", "PerformanceCounter")
@js.native
object PerformanceCounter extends js.Object {
  @js.native
  sealed trait AVAILABLE_BYTES extends PerformanceCounter
  
  @js.native
  sealed trait PRIVATE_BYTES extends PerformanceCounter
  
  @js.native
  sealed trait PROCESSOR_TIME extends PerformanceCounter
  
  @js.native
  sealed trait PROCESS_TIME extends PerformanceCounter
  
  @js.native
  sealed trait REQUEST_DURATION extends PerformanceCounter
  
  @js.native
  sealed trait REQUEST_RATE extends PerformanceCounter
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PerformanceCounter with String] = js.native
  /* "\\Memory\\Available Bytes" */ @js.native
  object AVAILABLE_BYTES extends TopLevel[AVAILABLE_BYTES with String]
  
  /* "\\Process(??APP_WIN32_PROC??)\\Private Bytes" */ @js.native
  object PRIVATE_BYTES extends TopLevel[PRIVATE_BYTES with String]
  
  /* "\\Processor(_Total)\\% Processor Time" */ @js.native
  object PROCESSOR_TIME extends TopLevel[PROCESSOR_TIME with String]
  
  /* "\\Process(??APP_WIN32_PROC??)\\% Processor Time" */ @js.native
  object PROCESS_TIME extends TopLevel[PROCESS_TIME with String]
  
  /* "\\ASP.NET Applications(??APP_W3SVC_PROC??)\\Request Execution Time" */ @js.native
  object REQUEST_DURATION extends TopLevel[REQUEST_DURATION with String]
  
  /* "\\ASP.NET Applications(??APP_W3SVC_PROC??)\\Requests/Sec" */ @js.native
  object REQUEST_RATE extends TopLevel[REQUEST_RATE with String]
  
}

