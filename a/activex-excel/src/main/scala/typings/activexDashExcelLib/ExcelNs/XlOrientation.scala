package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlOrientation extends js.Object

@JSGlobal("Excel.XlOrientation")
@js.native
object XlOrientation extends js.Object {
  @js.native
  sealed trait xlDownward
    extends activexDashExcelLib.ExcelNs.XlOrientation
  
  @js.native
  sealed trait xlHorizontal
    extends activexDashExcelLib.ExcelNs.XlOrientation
  
  @js.native
  sealed trait xlUpward
    extends activexDashExcelLib.ExcelNs.XlOrientation
  
  @js.native
  sealed trait xlVertical
    extends activexDashExcelLib.ExcelNs.XlOrientation
  
  /* -4170 */ val xlDownward: xlDownward with scala.Double = js.native
  /* -4128 */ val xlHorizontal: xlHorizontal with scala.Double = js.native
  /* -4171 */ val xlUpward: xlUpward with scala.Double = js.native
  /* -4166 */ val xlVertical: xlVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlOrientation with scala.Double] = js.native
}

