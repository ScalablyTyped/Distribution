package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWBATemplate extends js.Object

@JSGlobal("Excel.XlWBATemplate")
@js.native
object XlWBATemplate extends js.Object {
  @js.native
  sealed trait xlWBATChart
    extends activexDashExcelLib.ExcelNs.XlWBATemplate
  
  @js.native
  sealed trait xlWBATExcel4IntlMacroSheet
    extends activexDashExcelLib.ExcelNs.XlWBATemplate
  
  @js.native
  sealed trait xlWBATExcel4MacroSheet
    extends activexDashExcelLib.ExcelNs.XlWBATemplate
  
  @js.native
  sealed trait xlWBATWorksheet
    extends activexDashExcelLib.ExcelNs.XlWBATemplate
  
  /* -4109 */ val xlWBATChart: xlWBATChart with scala.Double = js.native
  /* 4 */ val xlWBATExcel4IntlMacroSheet: xlWBATExcel4IntlMacroSheet with scala.Double = js.native
  /* 3 */ val xlWBATExcel4MacroSheet: xlWBATExcel4MacroSheet with scala.Double = js.native
  /* -4167 */ val xlWBATWorksheet: xlWBATWorksheet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWBATemplate with scala.Double] = js.native
}

