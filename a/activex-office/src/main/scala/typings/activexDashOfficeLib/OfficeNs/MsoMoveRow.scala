package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoMoveRow extends js.Object

@JSGlobal("Office.MsoMoveRow")
@js.native
object MsoMoveRow extends js.Object {
  @js.native
  sealed trait msoMoveRowFirst
    extends activexDashOfficeLib.OfficeNs.MsoMoveRow
  
  @js.native
  sealed trait msoMoveRowNbr
    extends activexDashOfficeLib.OfficeNs.MsoMoveRow
  
  @js.native
  sealed trait msoMoveRowNext
    extends activexDashOfficeLib.OfficeNs.MsoMoveRow
  
  @js.native
  sealed trait msoMoveRowPrev
    extends activexDashOfficeLib.OfficeNs.MsoMoveRow
  
  /* -4 */ val msoMoveRowFirst: msoMoveRowFirst with scala.Double = js.native
  /* -1 */ val msoMoveRowNbr: msoMoveRowNbr with scala.Double = js.native
  /* -2 */ val msoMoveRowNext: msoMoveRowNext with scala.Double = js.native
  /* -3 */ val msoMoveRowPrev: msoMoveRowPrev with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoMoveRow with scala.Double] = js.native
}

