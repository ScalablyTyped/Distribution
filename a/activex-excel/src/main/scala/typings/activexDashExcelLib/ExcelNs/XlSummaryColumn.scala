package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSummaryColumn extends js.Object

@JSGlobal("Excel.XlSummaryColumn")
@js.native
object XlSummaryColumn extends js.Object {
  @js.native
  sealed trait xlSummaryOnLeft
    extends activexDashExcelLib.ExcelNs.XlSummaryColumn
  
  @js.native
  sealed trait xlSummaryOnRight
    extends activexDashExcelLib.ExcelNs.XlSummaryColumn
  
  /* -4131 */ val xlSummaryOnLeft: xlSummaryOnLeft with scala.Double = js.native
  /* -4152 */ val xlSummaryOnRight: xlSummaryOnRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSummaryColumn with scala.Double] = js.native
}

