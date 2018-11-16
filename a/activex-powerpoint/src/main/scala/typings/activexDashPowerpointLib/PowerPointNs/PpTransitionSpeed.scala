package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpTransitionSpeed extends js.Object

@JSGlobal("PowerPoint.PpTransitionSpeed")
@js.native
object PpTransitionSpeed extends js.Object {
  @js.native
  sealed trait ppTransitionSpeedFast
    extends activexDashPowerpointLib.PowerPointNs.PpTransitionSpeed
  
  @js.native
  sealed trait ppTransitionSpeedMedium
    extends activexDashPowerpointLib.PowerPointNs.PpTransitionSpeed
  
  @js.native
  sealed trait ppTransitionSpeedMixed
    extends activexDashPowerpointLib.PowerPointNs.PpTransitionSpeed
  
  @js.native
  sealed trait ppTransitionSpeedSlow
    extends activexDashPowerpointLib.PowerPointNs.PpTransitionSpeed
  
  /* 3 */ val ppTransitionSpeedFast: ppTransitionSpeedFast with scala.Double = js.native
  /* 2 */ val ppTransitionSpeedMedium: ppTransitionSpeedMedium with scala.Double = js.native
  /* -2 */ val ppTransitionSpeedMixed: ppTransitionSpeedMixed with scala.Double = js.native
  /* 1 */ val ppTransitionSpeedSlow: ppTransitionSpeedSlow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpTransitionSpeed with scala.Double] = js.native
}

