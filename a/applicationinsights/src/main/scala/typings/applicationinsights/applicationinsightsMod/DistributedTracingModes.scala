package typings.applicationinsights.applicationinsightsMod

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
  
  /* 0 */ val AI: typings.applicationinsights.applicationinsightsMod.DistributedTracingModes.AI with Double = js.native
  /* 1 */ val AI_AND_W3C: typings.applicationinsights.applicationinsightsMod.DistributedTracingModes.AI_AND_W3C with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistributedTracingModes with Double] = js.native
}

