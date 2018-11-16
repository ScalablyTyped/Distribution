package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRobustConnect extends js.Object

@JSGlobal("Excel.XlRobustConnect")
@js.native
object XlRobustConnect extends js.Object {
  @js.native
  sealed trait xlAlways
    extends activexDashExcelLib.ExcelNs.XlRobustConnect
  
  @js.native
  sealed trait xlAsRequired
    extends activexDashExcelLib.ExcelNs.XlRobustConnect
  
  @js.native
  sealed trait xlNever
    extends activexDashExcelLib.ExcelNs.XlRobustConnect
  
  /* 1 */ val xlAlways: xlAlways with scala.Double = js.native
  /* 0 */ val xlAsRequired: xlAsRequired with scala.Double = js.native
  /* 2 */ val xlNever: xlNever with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRobustConnect with scala.Double] = js.native
}

