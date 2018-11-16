package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlMouseButton extends js.Object

@JSGlobal("Excel.XlMouseButton")
@js.native
object XlMouseButton extends js.Object {
  @js.native
  sealed trait xlNoButton
    extends activexDashExcelLib.ExcelNs.XlMouseButton
  
  @js.native
  sealed trait xlPrimaryButton
    extends activexDashExcelLib.ExcelNs.XlMouseButton
  
  @js.native
  sealed trait xlSecondaryButton
    extends activexDashExcelLib.ExcelNs.XlMouseButton
  
  /* 0 */ val xlNoButton: xlNoButton with scala.Double = js.native
  /* 1 */ val xlPrimaryButton: xlPrimaryButton with scala.Double = js.native
  /* 2 */ val xlSecondaryButton: xlSecondaryButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlMouseButton with scala.Double] = js.native
}

