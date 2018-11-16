package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlScaleType extends js.Object

@JSGlobal("PowerPoint.XlScaleType")
@js.native
object XlScaleType extends js.Object {
  @js.native
  sealed trait xlScaleLinear
    extends activexDashPowerpointLib.PowerPointNs.XlScaleType
  
  @js.native
  sealed trait xlScaleLogarithmic
    extends activexDashPowerpointLib.PowerPointNs.XlScaleType
  
  /* -4132 */ val xlScaleLinear: xlScaleLinear with scala.Double = js.native
  /* -4133 */ val xlScaleLogarithmic: xlScaleLogarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlScaleType with scala.Double] = js.native
}

