package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WIZ_SLGP_FLAGS extends js.Object

@JSGlobal("AccWizObjects.WIZ_SLGP_FLAGS")
@js.native
object WIZ_SLGP_FLAGS extends js.Object {
  @js.native
  sealed trait WIZ_SLGP_SHORTPATH
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SLGP_FLAGS
  
  @js.native
  sealed trait WIZ_SLGP_UNCPRIORITY
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SLGP_FLAGS
  
  /* 1 */ val WIZ_SLGP_SHORTPATH: WIZ_SLGP_SHORTPATH with scala.Double = js.native
  /* 2 */ val WIZ_SLGP_UNCPRIORITY: WIZ_SLGP_UNCPRIORITY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccWizObjectsNs.WIZ_SLGP_FLAGS with scala.Double] = js.native
}

