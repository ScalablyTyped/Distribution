package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRowCol extends js.Object

@JSGlobal("Excel.XlRowCol")
@js.native
object XlRowCol extends js.Object {
  @js.native
  sealed trait xlColumns
    extends activexDashExcelLib.ExcelNs.XlRowCol
  
  @js.native
  sealed trait xlRows
    extends activexDashExcelLib.ExcelNs.XlRowCol
  
  /* 2 */ val xlColumns: xlColumns with scala.Double = js.native
  /* 1 */ val xlRows: xlRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRowCol with scala.Double] = js.native
}

