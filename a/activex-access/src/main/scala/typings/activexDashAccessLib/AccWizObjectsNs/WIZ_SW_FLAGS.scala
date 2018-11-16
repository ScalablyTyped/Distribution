package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WIZ_SW_FLAGS extends js.Object

@JSGlobal("AccWizObjects.WIZ_SW_FLAGS")
@js.native
object WIZ_SW_FLAGS extends js.Object {
  @js.native
  sealed trait WIZ_SW_MAXIMIZE
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SW_FLAGS
  
  @js.native
  sealed trait WIZ_SW_MINIMIZE
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SW_FLAGS
  
  @js.native
  sealed trait WIZ_SW_NORMAL
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SW_FLAGS
  
  /* 3 */ val WIZ_SW_MAXIMIZE: WIZ_SW_MAXIMIZE with scala.Double = js.native
  /* 7 */ val WIZ_SW_MINIMIZE: WIZ_SW_MINIMIZE with scala.Double = js.native
  /* 5 */ val WIZ_SW_NORMAL: WIZ_SW_NORMAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccWizObjectsNs.WIZ_SW_FLAGS with scala.Double] = js.native
}

