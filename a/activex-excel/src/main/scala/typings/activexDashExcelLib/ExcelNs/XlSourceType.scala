package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSourceType extends js.Object

@JSGlobal("Excel.XlSourceType")
@js.native
object XlSourceType extends js.Object {
  @js.native
  sealed trait xlSourceAutoFilter
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourceChart
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourcePivotTable
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourcePrintArea
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourceQuery
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourceRange
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourceSheet
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  @js.native
  sealed trait xlSourceWorkbook
    extends activexDashExcelLib.ExcelNs.XlSourceType
  
  /* 3 */ val xlSourceAutoFilter: xlSourceAutoFilter with scala.Double = js.native
  /* 5 */ val xlSourceChart: xlSourceChart with scala.Double = js.native
  /* 6 */ val xlSourcePivotTable: xlSourcePivotTable with scala.Double = js.native
  /* 2 */ val xlSourcePrintArea: xlSourcePrintArea with scala.Double = js.native
  /* 7 */ val xlSourceQuery: xlSourceQuery with scala.Double = js.native
  /* 4 */ val xlSourceRange: xlSourceRange with scala.Double = js.native
  /* 1 */ val xlSourceSheet: xlSourceSheet with scala.Double = js.native
  /* 0 */ val xlSourceWorkbook: xlSourceWorkbook with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSourceType with scala.Double] = js.native
}

