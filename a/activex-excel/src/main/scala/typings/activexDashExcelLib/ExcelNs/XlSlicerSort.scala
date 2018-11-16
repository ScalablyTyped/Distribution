package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSlicerSort extends js.Object

@JSGlobal("Excel.XlSlicerSort")
@js.native
object XlSlicerSort extends js.Object {
  @js.native
  sealed trait xlSlicerSortAscending
    extends activexDashExcelLib.ExcelNs.XlSlicerSort
  
  @js.native
  sealed trait xlSlicerSortDataSourceOrder
    extends activexDashExcelLib.ExcelNs.XlSlicerSort
  
  @js.native
  sealed trait xlSlicerSortDescending
    extends activexDashExcelLib.ExcelNs.XlSlicerSort
  
  /* 2 */ val xlSlicerSortAscending: xlSlicerSortAscending with scala.Double = js.native
  /* 1 */ val xlSlicerSortDataSourceOrder: xlSlicerSortDataSourceOrder with scala.Double = js.native
  /* 3 */ val xlSlicerSortDescending: xlSlicerSortDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSlicerSort with scala.Double] = js.native
}

