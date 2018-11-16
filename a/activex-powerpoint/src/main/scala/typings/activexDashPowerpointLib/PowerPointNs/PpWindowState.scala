package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpWindowState extends js.Object

@JSGlobal("PowerPoint.PpWindowState")
@js.native
object PpWindowState extends js.Object {
  @js.native
  sealed trait ppWindowMaximized
    extends activexDashPowerpointLib.PowerPointNs.PpWindowState
  
  @js.native
  sealed trait ppWindowMinimized
    extends activexDashPowerpointLib.PowerPointNs.PpWindowState
  
  @js.native
  sealed trait ppWindowNormal
    extends activexDashPowerpointLib.PowerPointNs.PpWindowState
  
  /* 3 */ val ppWindowMaximized: ppWindowMaximized with scala.Double = js.native
  /* 2 */ val ppWindowMinimized: ppWindowMinimized with scala.Double = js.native
  /* 1 */ val ppWindowNormal: ppWindowNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpWindowState with scala.Double] = js.native
}

