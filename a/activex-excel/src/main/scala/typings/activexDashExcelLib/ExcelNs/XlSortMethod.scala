package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortMethod extends js.Object

@JSGlobal("Excel.XlSortMethod")
@js.native
object XlSortMethod extends js.Object {
  @js.native
  sealed trait xlPinYin
    extends activexDashExcelLib.ExcelNs.XlSortMethod
  
  @js.native
  sealed trait xlStroke
    extends activexDashExcelLib.ExcelNs.XlSortMethod
  
  /* 1 */ val xlPinYin: xlPinYin with scala.Double = js.native
  /* 2 */ val xlStroke: xlStroke with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortMethod with scala.Double] = js.native
}

