package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPrintLocation extends js.Object

@JSGlobal("Excel.XlPrintLocation")
@js.native
object XlPrintLocation extends js.Object {
  @js.native
  sealed trait xlPrintInPlace
    extends activexDashExcelLib.ExcelNs.XlPrintLocation
  
  @js.native
  sealed trait xlPrintNoComments
    extends activexDashExcelLib.ExcelNs.XlPrintLocation
  
  @js.native
  sealed trait xlPrintSheetEnd
    extends activexDashExcelLib.ExcelNs.XlPrintLocation
  
  /* 16 */ val xlPrintInPlace: xlPrintInPlace with scala.Double = js.native
  /* -4142 */ val xlPrintNoComments: xlPrintNoComments with scala.Double = js.native
  /* 1 */ val xlPrintSheetEnd: xlPrintSheetEnd with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPrintLocation with scala.Double] = js.native
}

