package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSearchOrder extends js.Object

@JSGlobal("Excel.XlSearchOrder")
@js.native
object XlSearchOrder extends js.Object {
  @js.native
  sealed trait xlByColumns
    extends activexDashExcelLib.ExcelNs.XlSearchOrder
  
  @js.native
  sealed trait xlByRows
    extends activexDashExcelLib.ExcelNs.XlSearchOrder
  
  /* 2 */ val xlByColumns: xlByColumns with scala.Double = js.native
  /* 1 */ val xlByRows: xlByRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSearchOrder with scala.Double] = js.native
}

