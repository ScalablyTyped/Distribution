package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEnableCancelKey extends js.Object

@JSGlobal("Excel.XlEnableCancelKey")
@js.native
object XlEnableCancelKey extends js.Object {
  @js.native
  sealed trait xlDisabled
    extends activexDashExcelLib.ExcelNs.XlEnableCancelKey
  
  @js.native
  sealed trait xlErrorHandler
    extends activexDashExcelLib.ExcelNs.XlEnableCancelKey
  
  @js.native
  sealed trait xlInterrupt
    extends activexDashExcelLib.ExcelNs.XlEnableCancelKey
  
  /* 0 */ val xlDisabled: xlDisabled with scala.Double = js.native
  /* 2 */ val xlErrorHandler: xlErrorHandler with scala.Double = js.native
  /* 1 */ val xlInterrupt: xlInterrupt with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEnableCancelKey with scala.Double] = js.native
}

