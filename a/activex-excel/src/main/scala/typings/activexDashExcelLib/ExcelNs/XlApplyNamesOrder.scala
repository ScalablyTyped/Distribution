package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlApplyNamesOrder extends js.Object

@JSGlobal("Excel.XlApplyNamesOrder")
@js.native
object XlApplyNamesOrder extends js.Object {
  @js.native
  sealed trait xlColumnThenRow
    extends activexDashExcelLib.ExcelNs.XlApplyNamesOrder
  
  @js.native
  sealed trait xlRowThenColumn
    extends activexDashExcelLib.ExcelNs.XlApplyNamesOrder
  
  /* 2 */ val xlColumnThenRow: xlColumnThenRow with scala.Double = js.native
  /* 1 */ val xlRowThenColumn: xlRowThenColumn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlApplyNamesOrder with scala.Double] = js.native
}

