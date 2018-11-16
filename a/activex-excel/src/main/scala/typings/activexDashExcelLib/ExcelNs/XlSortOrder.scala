package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortOrder extends js.Object

@JSGlobal("Excel.XlSortOrder")
@js.native
object XlSortOrder extends js.Object {
  @js.native
  sealed trait xlAscending
    extends activexDashExcelLib.ExcelNs.XlSortOrder
  
  @js.native
  sealed trait xlDescending
    extends activexDashExcelLib.ExcelNs.XlSortOrder
  
  /* 1 */ val xlAscending: xlAscending with scala.Double = js.native
  /* 2 */ val xlDescending: xlDescending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortOrder with scala.Double] = js.native
}

