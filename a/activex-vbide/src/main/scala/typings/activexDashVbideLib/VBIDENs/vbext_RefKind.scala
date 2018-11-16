package typings
package activexDashVbideLib.VBIDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait vbext_RefKind extends js.Object

@JSGlobal("VBIDE.vbext_RefKind")
@js.native
object vbext_RefKind extends js.Object {
  @js.native
  sealed trait vbext_rk_Project
    extends activexDashVbideLib.VBIDENs.vbext_RefKind
  
  @js.native
  sealed trait vbext_rk_TypeLib
    extends activexDashVbideLib.VBIDENs.vbext_RefKind
  
  /* 1 */ val vbext_rk_Project: vbext_rk_Project with scala.Double = js.native
  /* 0 */ val vbext_rk_TypeLib: vbext_rk_TypeLib with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashVbideLib.VBIDENs.vbext_RefKind with scala.Double] = js.native
}

