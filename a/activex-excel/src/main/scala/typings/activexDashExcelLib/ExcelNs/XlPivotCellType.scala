package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotCellType extends js.Object

@JSGlobal("Excel.XlPivotCellType")
@js.native
object XlPivotCellType extends js.Object {
  @js.native
  sealed trait xlPivotCellBlankCell
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellCustomSubtotal
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellDataField
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellDataPivotField
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellGrandTotal
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellPageFieldItem
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellPivotField
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellPivotItem
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellSubtotal
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  @js.native
  sealed trait xlPivotCellValue
    extends activexDashExcelLib.ExcelNs.XlPivotCellType
  
  /* 9 */ val xlPivotCellBlankCell: xlPivotCellBlankCell with scala.Double = js.native
  /* 7 */ val xlPivotCellCustomSubtotal: xlPivotCellCustomSubtotal with scala.Double = js.native
  /* 4 */ val xlPivotCellDataField: xlPivotCellDataField with scala.Double = js.native
  /* 8 */ val xlPivotCellDataPivotField: xlPivotCellDataPivotField with scala.Double = js.native
  /* 3 */ val xlPivotCellGrandTotal: xlPivotCellGrandTotal with scala.Double = js.native
  /* 6 */ val xlPivotCellPageFieldItem: xlPivotCellPageFieldItem with scala.Double = js.native
  /* 5 */ val xlPivotCellPivotField: xlPivotCellPivotField with scala.Double = js.native
  /* 1 */ val xlPivotCellPivotItem: xlPivotCellPivotItem with scala.Double = js.native
  /* 2 */ val xlPivotCellSubtotal: xlPivotCellSubtotal with scala.Double = js.native
  /* 0 */ val xlPivotCellValue: xlPivotCellValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotCellType with scala.Double] = js.native
}

