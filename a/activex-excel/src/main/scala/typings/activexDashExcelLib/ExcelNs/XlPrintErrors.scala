package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPrintErrors extends js.Object

@JSGlobal("Excel.XlPrintErrors")
@js.native
object XlPrintErrors extends js.Object {
  @js.native
  sealed trait xlPrintErrorsBlank
    extends activexDashExcelLib.ExcelNs.XlPrintErrors
  
  @js.native
  sealed trait xlPrintErrorsDash
    extends activexDashExcelLib.ExcelNs.XlPrintErrors
  
  @js.native
  sealed trait xlPrintErrorsDisplayed
    extends activexDashExcelLib.ExcelNs.XlPrintErrors
  
  @js.native
  sealed trait xlPrintErrorsNA
    extends activexDashExcelLib.ExcelNs.XlPrintErrors
  
  /* 1 */ val xlPrintErrorsBlank: xlPrintErrorsBlank with scala.Double = js.native
  /* 2 */ val xlPrintErrorsDash: xlPrintErrorsDash with scala.Double = js.native
  /* 0 */ val xlPrintErrorsDisplayed: xlPrintErrorsDisplayed with scala.Double = js.native
  /* 3 */ val xlPrintErrorsNA: xlPrintErrorsNA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPrintErrors with scala.Double] = js.native
}

