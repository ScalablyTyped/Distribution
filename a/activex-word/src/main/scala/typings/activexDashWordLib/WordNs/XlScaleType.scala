package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlScaleType extends js.Object

@JSGlobal("Word.XlScaleType")
@js.native
object XlScaleType extends js.Object {
  @js.native
  sealed trait xlScaleLinear
    extends activexDashWordLib.WordNs.XlScaleType
  
  @js.native
  sealed trait xlScaleLogarithmic
    extends activexDashWordLib.WordNs.XlScaleType
  
  /* -4132 */ val xlScaleLinear: xlScaleLinear with scala.Double = js.native
  /* -4133 */ val xlScaleLogarithmic: xlScaleLogarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlScaleType with scala.Double] = js.native
}

