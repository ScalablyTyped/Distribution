package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlBordersIndex extends js.Object

@JSGlobal("Excel.XlBordersIndex")
@js.native
object XlBordersIndex extends js.Object {
  @js.native
  sealed trait xlDiagonalDown
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlDiagonalUp
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlEdgeBottom
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlEdgeLeft
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlEdgeRight
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlEdgeTop
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlInsideHorizontal
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  @js.native
  sealed trait xlInsideVertical
    extends activexDashExcelLib.ExcelNs.XlBordersIndex
  
  /* 5 */ val xlDiagonalDown: xlDiagonalDown with scala.Double = js.native
  /* 6 */ val xlDiagonalUp: xlDiagonalUp with scala.Double = js.native
  /* 9 */ val xlEdgeBottom: xlEdgeBottom with scala.Double = js.native
  /* 7 */ val xlEdgeLeft: xlEdgeLeft with scala.Double = js.native
  /* 10 */ val xlEdgeRight: xlEdgeRight with scala.Double = js.native
  /* 8 */ val xlEdgeTop: xlEdgeTop with scala.Double = js.native
  /* 12 */ val xlInsideHorizontal: xlInsideHorizontal with scala.Double = js.native
  /* 11 */ val xlInsideVertical: xlInsideVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlBordersIndex with scala.Double] = js.native
}

