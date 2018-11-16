package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_VBAMode extends js.Object

@JSGlobal("VBIDE.vbext_VBAMode")
@js.native
object vbext_VBAMode extends js.Object {
  @js.native
  sealed trait vbext_vm_Break
    extends activexDashVbideLib.VBIDENs.vbext_VBAMode
  
  @js.native
  sealed trait vbext_vm_Design
    extends activexDashVbideLib.VBIDENs.vbext_VBAMode
  
  @js.native
  sealed trait vbext_vm_Run
    extends activexDashVbideLib.VBIDENs.vbext_VBAMode
  
  /* 1 */ val vbext_vm_Break: vbext_vm_Break with scala.Double = js.native
  /* 2 */ val vbext_vm_Design: vbext_vm_Design with scala.Double = js.native
  /* 0 */ val vbext_vm_Run: vbext_vm_Run with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_VBAMode with scala.Double] = js.native
}

