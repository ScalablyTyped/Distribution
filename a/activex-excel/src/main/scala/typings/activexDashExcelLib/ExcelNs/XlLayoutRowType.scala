package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLayoutRowType extends js.Object

@JSGlobal("Excel.XlLayoutRowType")
@js.native
object XlLayoutRowType extends js.Object {
  @js.native
  sealed trait xlCompactRow
    extends activexDashExcelLib.ExcelNs.XlLayoutRowType
  
  @js.native
  sealed trait xlOutlineRow
    extends activexDashExcelLib.ExcelNs.XlLayoutRowType
  
  @js.native
  sealed trait xlTabularRow
    extends activexDashExcelLib.ExcelNs.XlLayoutRowType
  
  /* 0 */ val xlCompactRow: xlCompactRow with scala.Double = js.native
  /* 2 */ val xlOutlineRow: xlOutlineRow with scala.Double = js.native
  /* 1 */ val xlTabularRow: xlTabularRow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLayoutRowType with scala.Double] = js.native
}

