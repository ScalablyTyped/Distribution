package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPlacement extends js.Object

@JSGlobal("Excel.XlPlacement")
@js.native
object XlPlacement extends js.Object {
  @js.native
  sealed trait xlFreeFloating
    extends activexDashExcelLib.ExcelNs.XlPlacement
  
  @js.native
  sealed trait xlMove
    extends activexDashExcelLib.ExcelNs.XlPlacement
  
  @js.native
  sealed trait xlMoveAndSize
    extends activexDashExcelLib.ExcelNs.XlPlacement
  
  /* 3 */ val xlFreeFloating: xlFreeFloating with scala.Double = js.native
  /* 2 */ val xlMove: xlMove with scala.Double = js.native
  /* 1 */ val xlMoveAndSize: xlMoveAndSize with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPlacement with scala.Double] = js.native
}

