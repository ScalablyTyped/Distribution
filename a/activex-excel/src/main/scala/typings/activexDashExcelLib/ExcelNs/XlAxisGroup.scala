package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisGroup extends js.Object

@JSGlobal("Excel.XlAxisGroup")
@js.native
object XlAxisGroup extends js.Object {
  @js.native
  sealed trait xlPrimary
    extends activexDashExcelLib.ExcelNs.XlAxisGroup
  
  @js.native
  sealed trait xlSecondary
    extends activexDashExcelLib.ExcelNs.XlAxisGroup
  
  /* 1 */ val xlPrimary: xlPrimary with scala.Double = js.native
  /* 2 */ val xlSecondary: xlSecondary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAxisGroup with scala.Double] = js.native
}

