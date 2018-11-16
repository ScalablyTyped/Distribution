package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCellInsertionMode extends js.Object

@JSGlobal("Excel.XlCellInsertionMode")
@js.native
object XlCellInsertionMode extends js.Object {
  @js.native
  sealed trait xlInsertDeleteCells
    extends activexDashExcelLib.ExcelNs.XlCellInsertionMode
  
  @js.native
  sealed trait xlInsertEntireRows
    extends activexDashExcelLib.ExcelNs.XlCellInsertionMode
  
  @js.native
  sealed trait xlOverwriteCells
    extends activexDashExcelLib.ExcelNs.XlCellInsertionMode
  
  /* 1 */ val xlInsertDeleteCells: xlInsertDeleteCells with scala.Double = js.native
  /* 2 */ val xlInsertEntireRows: xlInsertEntireRows with scala.Double = js.native
  /* 0 */ val xlOverwriteCells: xlOverwriteCells with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCellInsertionMode with scala.Double] = js.native
}

