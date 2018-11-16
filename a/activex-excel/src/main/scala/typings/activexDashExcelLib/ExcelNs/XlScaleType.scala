package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlScaleType extends js.Object

@JSGlobal("Excel.XlScaleType")
@js.native
object XlScaleType extends js.Object {
  @js.native
  sealed trait xlScaleLinear
    extends activexDashExcelLib.ExcelNs.XlScaleType
  
  @js.native
  sealed trait xlScaleLogarithmic
    extends activexDashExcelLib.ExcelNs.XlScaleType
  
  /* -4132 */ val xlScaleLinear: xlScaleLinear with scala.Double = js.native
  /* -4133 */ val xlScaleLogarithmic: xlScaleLogarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlScaleType with scala.Double] = js.native
}

