package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTrendlineType extends js.Object

@JSGlobal("Word.XlTrendlineType")
@js.native
object XlTrendlineType extends js.Object {
  @js.native
  sealed trait xlExponential
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  @js.native
  sealed trait xlLinear
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  @js.native
  sealed trait xlLogarithmic
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  @js.native
  sealed trait xlMovingAvg
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  @js.native
  sealed trait xlPolynomial
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  @js.native
  sealed trait xlPower
    extends activexDashWordLib.WordNs.XlTrendlineType
  
  /* 5 */ val xlExponential: xlExponential with scala.Double = js.native
  /* -4132 */ val xlLinear: xlLinear with scala.Double = js.native
  /* -4133 */ val xlLogarithmic: xlLogarithmic with scala.Double = js.native
  /* 6 */ val xlMovingAvg: xlMovingAvg with scala.Double = js.native
  /* 3 */ val xlPolynomial: xlPolynomial with scala.Double = js.native
  /* 4 */ val xlPower: xlPower with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlTrendlineType with scala.Double] = js.native
}

