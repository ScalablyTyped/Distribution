package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSearchDirection extends js.Object

@JSGlobal("Excel.XlSearchDirection")
@js.native
object XlSearchDirection extends js.Object {
  @js.native
  sealed trait xlNext
    extends activexDashExcelLib.ExcelNs.XlSearchDirection
  
  @js.native
  sealed trait xlPrevious
    extends activexDashExcelLib.ExcelNs.XlSearchDirection
  
  /* 1 */ val xlNext: xlNext with scala.Double = js.native
  /* 2 */ val xlPrevious: xlPrevious with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSearchDirection with scala.Double] = js.native
}

