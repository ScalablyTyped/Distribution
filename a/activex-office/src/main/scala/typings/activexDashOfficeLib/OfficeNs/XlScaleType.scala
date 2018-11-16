package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlScaleType extends js.Object

@JSGlobal("Office.XlScaleType")
@js.native
object XlScaleType extends js.Object {
  @js.native
  sealed trait xlScaleLinear
    extends activexDashOfficeLib.OfficeNs.XlScaleType
  
  @js.native
  sealed trait xlScaleLogarithmic
    extends activexDashOfficeLib.OfficeNs.XlScaleType
  
  /* -4132 */ val xlScaleLinear: xlScaleLinear with scala.Double = js.native
  /* -4133 */ val xlScaleLogarithmic: xlScaleLogarithmic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlScaleType with scala.Double] = js.native
}

