package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcShowToolbar extends js.Object

@JSGlobal("Access.AcShowToolbar")
@js.native
object AcShowToolbar extends js.Object {
  @js.native
  sealed trait acToolbarNo
    extends activexDashAccessLib.AccessNs.AcShowToolbar
  
  @js.native
  sealed trait acToolbarWhereApprop
    extends activexDashAccessLib.AccessNs.AcShowToolbar
  
  @js.native
  sealed trait acToolbarYes
    extends activexDashAccessLib.AccessNs.AcShowToolbar
  
  /* 2 */ val acToolbarNo: acToolbarNo with scala.Double = js.native
  /* 1 */ val acToolbarWhereApprop: acToolbarWhereApprop with scala.Double = js.native
  /* 0 */ val acToolbarYes: acToolbarYes with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcShowToolbar with scala.Double] = js.native
}

