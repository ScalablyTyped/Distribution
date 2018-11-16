package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortOrientation extends js.Object

@JSGlobal("Excel.XlSortOrientation")
@js.native
object XlSortOrientation extends js.Object {
  @js.native
  sealed trait xlSortColumns
    extends activexDashExcelLib.ExcelNs.XlSortOrientation
  
  @js.native
  sealed trait xlSortRows
    extends activexDashExcelLib.ExcelNs.XlSortOrientation
  
  /* 1 */ val xlSortColumns: xlSortColumns with scala.Double = js.native
  /* 2 */ val xlSortRows: xlSortRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortOrientation with scala.Double] = js.native
}

