package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_WindowState extends js.Object

@JSGlobal("VBIDE.vbext_WindowState")
@js.native
object vbext_WindowState extends js.Object {
  @js.native
  sealed trait vbext_ws_Maximize
    extends activexDashVbideLib.VBIDENs.vbext_WindowState
  
  @js.native
  sealed trait vbext_ws_Minimize
    extends activexDashVbideLib.VBIDENs.vbext_WindowState
  
  @js.native
  sealed trait vbext_ws_Normal
    extends activexDashVbideLib.VBIDENs.vbext_WindowState
  
  /* 2 */ val vbext_ws_Maximize: vbext_ws_Maximize with scala.Double = js.native
  /* 1 */ val vbext_ws_Minimize: vbext_ws_Minimize with scala.Double = js.native
  /* 0 */ val vbext_ws_Normal: vbext_ws_Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_WindowState with scala.Double] = js.native
}

