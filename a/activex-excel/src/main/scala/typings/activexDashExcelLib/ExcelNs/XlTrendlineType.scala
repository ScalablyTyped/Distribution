package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTrendlineType extends js.Object

@JSGlobal("Excel.XlTrendlineType")
@js.native
object XlTrendlineType extends js.Object {
  @js.native
  sealed trait xlExponential
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  @js.native
  sealed trait xlLinear
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  @js.native
  sealed trait xlLogarithmic
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  @js.native
  sealed trait xlMovingAvg
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  @js.native
  sealed trait xlPolynomial
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  @js.native
  sealed trait xlPower
    extends activexDashExcelLib.ExcelNs.XlTrendlineType
  
  /* 5 */ val xlExponential: xlExponential with scala.Double = js.native
  /* -4132 */ val xlLinear: xlLinear with scala.Double = js.native
  /* -4133 */ val xlLogarithmic: xlLogarithmic with scala.Double = js.native
  /* 6 */ val xlMovingAvg: xlMovingAvg with scala.Double = js.native
  /* 3 */ val xlPolynomial: xlPolynomial with scala.Double = js.native
  /* 4 */ val xlPower: xlPower with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTrendlineType with scala.Double] = js.native
}

