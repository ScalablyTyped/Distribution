package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataBarNegativeColorType extends js.Object

@JSGlobal("Excel.XlDataBarNegativeColorType")
@js.native
object XlDataBarNegativeColorType extends js.Object {
  @js.native
  sealed trait xlDataBarColor
    extends activexDashExcelLib.ExcelNs.XlDataBarNegativeColorType
  
  @js.native
  sealed trait xlDataBarSameAsPositive
    extends activexDashExcelLib.ExcelNs.XlDataBarNegativeColorType
  
  /* 0 */ val xlDataBarColor: xlDataBarColor with scala.Double = js.native
  /* 1 */ val xlDataBarSameAsPositive: xlDataBarSameAsPositive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataBarNegativeColorType with scala.Double] = js.native
}

