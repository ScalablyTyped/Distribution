package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortOn extends js.Object

@JSGlobal("Excel.XlSortOn")
@js.native
object XlSortOn extends js.Object {
  @js.native
  sealed trait xlSortOnCellColor
    extends activexDashExcelLib.ExcelNs.XlSortOn
  
  @js.native
  sealed trait xlSortOnFontColor
    extends activexDashExcelLib.ExcelNs.XlSortOn
  
  @js.native
  sealed trait xlSortOnIcon
    extends activexDashExcelLib.ExcelNs.XlSortOn
  
  @js.native
  sealed trait xlSortOnValues
    extends activexDashExcelLib.ExcelNs.XlSortOn
  
  /* 1 */ val xlSortOnCellColor: xlSortOnCellColor with scala.Double = js.native
  /* 2 */ val xlSortOnFontColor: xlSortOnFontColor with scala.Double = js.native
  /* 3 */ val xlSortOnIcon: xlSortOnIcon with scala.Double = js.native
  /* 0 */ val xlSortOnValues: xlSortOnValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortOn with scala.Double] = js.native
}

