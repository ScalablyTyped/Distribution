package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotLineType extends js.Object

@JSGlobal("Excel.XlPivotLineType")
@js.native
object XlPivotLineType extends js.Object {
  @js.native
  sealed trait xlPivotLineBlank
    extends activexDashExcelLib.ExcelNs.XlPivotLineType
  
  @js.native
  sealed trait xlPivotLineGrandTotal
    extends activexDashExcelLib.ExcelNs.XlPivotLineType
  
  @js.native
  sealed trait xlPivotLineRegular
    extends activexDashExcelLib.ExcelNs.XlPivotLineType
  
  @js.native
  sealed trait xlPivotLineSubtotal
    extends activexDashExcelLib.ExcelNs.XlPivotLineType
  
  /* 3 */ val xlPivotLineBlank: xlPivotLineBlank with scala.Double = js.native
  /* 2 */ val xlPivotLineGrandTotal: xlPivotLineGrandTotal with scala.Double = js.native
  /* 0 */ val xlPivotLineRegular: xlPivotLineRegular with scala.Double = js.native
  /* 1 */ val xlPivotLineSubtotal: xlPivotLineSubtotal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotLineType with scala.Double] = js.native
}

