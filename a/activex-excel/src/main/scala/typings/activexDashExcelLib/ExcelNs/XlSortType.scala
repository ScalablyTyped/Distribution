package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortType extends js.Object

@JSGlobal("Excel.XlSortType")
@js.native
object XlSortType extends js.Object {
  @js.native
  sealed trait xlSortLabels
    extends activexDashExcelLib.ExcelNs.XlSortType
  
  @js.native
  sealed trait xlSortValues
    extends activexDashExcelLib.ExcelNs.XlSortType
  
  /* 2 */ val xlSortLabels: xlSortLabels with scala.Double = js.native
  /* 1 */ val xlSortValues: xlSortValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortType with scala.Double] = js.native
}

