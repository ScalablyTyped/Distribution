package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCellChangedState extends js.Object

@JSGlobal("Excel.XlCellChangedState")
@js.native
object XlCellChangedState extends js.Object {
  @js.native
  sealed trait xlCellChangeApplied
    extends activexDashExcelLib.ExcelNs.XlCellChangedState
  
  @js.native
  sealed trait xlCellChanged
    extends activexDashExcelLib.ExcelNs.XlCellChangedState
  
  @js.native
  sealed trait xlCellNotChanged
    extends activexDashExcelLib.ExcelNs.XlCellChangedState
  
  /* 3 */ val xlCellChangeApplied: xlCellChangeApplied with scala.Double = js.native
  /* 2 */ val xlCellChanged: xlCellChanged with scala.Double = js.native
  /* 1 */ val xlCellNotChanged: xlCellNotChanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCellChangedState with scala.Double] = js.native
}

