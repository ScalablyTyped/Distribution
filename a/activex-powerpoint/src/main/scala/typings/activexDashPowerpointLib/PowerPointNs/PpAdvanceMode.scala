package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpAdvanceMode extends js.Object

@JSGlobal("PowerPoint.PpAdvanceMode")
@js.native
object PpAdvanceMode extends js.Object {
  @js.native
  sealed trait ppAdvanceModeMixed
    extends activexDashPowerpointLib.PowerPointNs.PpAdvanceMode
  
  @js.native
  sealed trait ppAdvanceOnClick
    extends activexDashPowerpointLib.PowerPointNs.PpAdvanceMode
  
  @js.native
  sealed trait ppAdvanceOnTime
    extends activexDashPowerpointLib.PowerPointNs.PpAdvanceMode
  
  /* -2 */ val ppAdvanceModeMixed: ppAdvanceModeMixed with scala.Double = js.native
  /* 1 */ val ppAdvanceOnClick: ppAdvanceOnClick with scala.Double = js.native
  /* 2 */ val ppAdvanceOnTime: ppAdvanceOnTime with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpAdvanceMode with scala.Double] = js.native
}

