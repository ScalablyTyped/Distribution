package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_ProjectProtection extends js.Object

@JSGlobal("VBIDE.vbext_ProjectProtection")
@js.native
object vbext_ProjectProtection extends js.Object {
  @js.native
  sealed trait vbext_pp_locked
    extends activexDashVbideLib.VBIDENs.vbext_ProjectProtection
  
  @js.native
  sealed trait vbext_pp_none
    extends activexDashVbideLib.VBIDENs.vbext_ProjectProtection
  
  /* 1 */ val vbext_pp_locked: vbext_pp_locked with scala.Double = js.native
  /* 0 */ val vbext_pp_none: vbext_pp_none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_ProjectProtection with scala.Double] = js.native
}

