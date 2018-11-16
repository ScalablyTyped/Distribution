package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlGradientFillType extends js.Object

@JSGlobal("Excel.XlGradientFillType")
@js.native
object XlGradientFillType extends js.Object {
  @js.native
  sealed trait xlGradientFillLinear
    extends activexDashExcelLib.ExcelNs.XlGradientFillType
  
  @js.native
  sealed trait xlGradientFillPath
    extends activexDashExcelLib.ExcelNs.XlGradientFillType
  
  /* 0 */ val xlGradientFillLinear: xlGradientFillLinear with scala.Double = js.native
  /* 1 */ val xlGradientFillPath: xlGradientFillPath with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlGradientFillType with scala.Double] = js.native
}

