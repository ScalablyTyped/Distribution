package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WIZ_SLR_FLAGS extends js.Object

@JSGlobal("AccWizObjects.WIZ_SLR_FLAGS")
@js.native
object WIZ_SLR_FLAGS extends js.Object {
  @js.native
  sealed trait WIZ_SLR_ANY_MATCH
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SLR_FLAGS
  
  @js.native
  sealed trait WIZ_SLR_NO_UI
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SLR_FLAGS
  
  @js.native
  sealed trait WIZ_SLR_UPDATE
    extends activexDashAccessLib.AccWizObjectsNs.WIZ_SLR_FLAGS
  
  /* 2 */ val WIZ_SLR_ANY_MATCH: WIZ_SLR_ANY_MATCH with scala.Double = js.native
  /* 1 */ val WIZ_SLR_NO_UI: WIZ_SLR_NO_UI with scala.Double = js.native
  /* 4 */ val WIZ_SLR_UPDATE: WIZ_SLR_UPDATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccWizObjectsNs.WIZ_SLR_FLAGS with scala.Double] = js.native
}

