package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlColorIndex extends js.Object

@JSGlobal("Excel.XlColorIndex")
@js.native
object XlColorIndex extends js.Object {
  @js.native
  sealed trait xlColorIndexAutomatic
    extends activexDashExcelLib.ExcelNs.XlColorIndex
  
  @js.native
  sealed trait xlColorIndexNone
    extends activexDashExcelLib.ExcelNs.XlColorIndex
  
  /* -4105 */ val xlColorIndexAutomatic: xlColorIndexAutomatic with scala.Double = js.native
  /* -4142 */ val xlColorIndexNone: xlColorIndexNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlColorIndex with scala.Double] = js.native
}

