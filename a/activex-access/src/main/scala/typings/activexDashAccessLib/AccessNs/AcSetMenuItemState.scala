package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcSetMenuItemState extends js.Object

@JSGlobal("Access.AcSetMenuItemState")
@js.native
object AcSetMenuItemState extends js.Object {
  @js.native
  sealed trait acMenuCheck
    extends activexDashAccessLib.AccessNs.AcSetMenuItemState
  
  @js.native
  sealed trait acMenuGray
    extends activexDashAccessLib.AccessNs.AcSetMenuItemState
  
  @js.native
  sealed trait acMenuUncheck
    extends activexDashAccessLib.AccessNs.AcSetMenuItemState
  
  @js.native
  sealed trait acMenuUngray
    extends activexDashAccessLib.AccessNs.AcSetMenuItemState
  
  /* 3 */ val acMenuCheck: acMenuCheck with scala.Double = js.native
  /* 1 */ val acMenuGray: acMenuGray with scala.Double = js.native
  /* 2 */ val acMenuUncheck: acMenuUncheck with scala.Double = js.native
  /* 0 */ val acMenuUngray: acMenuUngray with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAccessLib.AccessNs.AcSetMenuItemState with scala.Double] = js.native
}

