package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSummaryRow extends js.Object

@JSGlobal("Excel.XlSummaryRow")
@js.native
object XlSummaryRow extends js.Object {
  @js.native
  sealed trait xlSummaryAbove
    extends activexDashExcelLib.ExcelNs.XlSummaryRow
  
  @js.native
  sealed trait xlSummaryBelow
    extends activexDashExcelLib.ExcelNs.XlSummaryRow
  
  /* 0 */ val xlSummaryAbove: xlSummaryAbove with scala.Double = js.native
  /* 1 */ val xlSummaryBelow: xlSummaryBelow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSummaryRow with scala.Double] = js.native
}

