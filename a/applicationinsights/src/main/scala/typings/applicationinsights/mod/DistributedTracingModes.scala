package typings.applicationinsights.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistributedTracingModes extends js.Object

@JSImport("applicationinsights", "DistributedTracingModes")
@js.native
object DistributedTracingModes extends js.Object {
  /**
    * (Default) Send Application Insights correlation headers
    */
  @js.native
  sealed trait AI extends DistributedTracingModes
  
  /**
    * Send both W3C Trace Context headers and back-compatibility Application Insights headers
    */
  @js.native
  sealed trait AI_AND_W3C extends DistributedTracingModes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistributedTracingModes with Double] = js.native
  /* 0 */ @js.native
  object AI extends TopLevel[AI with Double]
  
  /* 1 */ @js.native
  object AI_AND_W3C extends TopLevel[AI_AND_W3C with Double]
  
}

