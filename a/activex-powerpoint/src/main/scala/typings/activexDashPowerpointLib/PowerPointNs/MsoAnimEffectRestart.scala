package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimEffectRestart extends js.Object

@JSGlobal("PowerPoint.MsoAnimEffectRestart")
@js.native
object MsoAnimEffectRestart extends js.Object {
  @js.native
  sealed trait msoAnimEffectRestartAlways
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectRestart
  
  @js.native
  sealed trait msoAnimEffectRestartNever
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectRestart
  
  @js.native
  sealed trait msoAnimEffectRestartWhenOff
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectRestart
  
  /* 1 */ val msoAnimEffectRestartAlways: msoAnimEffectRestartAlways with scala.Double = js.native
  /* 3 */ val msoAnimEffectRestartNever: msoAnimEffectRestartNever with scala.Double = js.native
  /* 2 */ val msoAnimEffectRestartWhenOff: msoAnimEffectRestartWhenOff with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimEffectRestart with scala.Double] = js.native
}

