package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSheetType extends js.Object

@JSGlobal("Excel.XlSheetType")
@js.native
object XlSheetType extends js.Object {
  @js.native
  sealed trait xlChart
    extends activexDashExcelLib.ExcelNs.XlSheetType
  
  @js.native
  sealed trait xlDialogSheet
    extends activexDashExcelLib.ExcelNs.XlSheetType
  
  @js.native
  sealed trait xlExcel4IntlMacroSheet
    extends activexDashExcelLib.ExcelNs.XlSheetType
  
  @js.native
  sealed trait xlExcel4MacroSheet
    extends activexDashExcelLib.ExcelNs.XlSheetType
  
  @js.native
  sealed trait xlWorksheet
    extends activexDashExcelLib.ExcelNs.XlSheetType
  
  /* -4109 */ val xlChart: xlChart with scala.Double = js.native
  /* -4116 */ val xlDialogSheet: xlDialogSheet with scala.Double = js.native
  /* 4 */ val xlExcel4IntlMacroSheet: xlExcel4IntlMacroSheet with scala.Double = js.native
  /* 3 */ val xlExcel4MacroSheet: xlExcel4MacroSheet with scala.Double = js.native
  /* -4167 */ val xlWorksheet: xlWorksheet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSheetType with scala.Double] = js.native
}

