package typings
package applicationinsightsLib.applicationinsightsMod

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
  sealed trait AI
    extends applicationinsightsLib.applicationinsightsMod.DistributedTracingModes
  
  /**
    * Send both W3C Trace Context headers and back-compatibility Application Insights headers
    */
  @js.native
  sealed trait AI_AND_W3C
    extends applicationinsightsLib.applicationinsightsMod.DistributedTracingModes
  
  /* 0 */ val AI: AI with scala.Double = js.native
  /* 1 */ val AI_AND_W3C: AI_AND_W3C with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    applicationinsightsLib.applicationinsightsMod.DistributedTracingModes with scala.Double
  ] = js.native
}

