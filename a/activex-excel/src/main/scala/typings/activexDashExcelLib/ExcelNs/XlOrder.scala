package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOrder extends js.Object

@JSGlobal("Excel.XlOrder")
@js.native
object XlOrder extends js.Object {
  @js.native
  sealed trait xlDownThenOver
    extends activexDashExcelLib.ExcelNs.XlOrder
  
  @js.native
  sealed trait xlOverThenDown
    extends activexDashExcelLib.ExcelNs.XlOrder
  
  /* 1 */ val xlDownThenOver: xlDownThenOver with scala.Double = js.native
  /* 2 */ val xlOverThenDown: xlOverThenDown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOrder with scala.Double] = js.native
}

