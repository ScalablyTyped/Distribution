package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmButtonStyle extends js.Object

@JSGlobal("MSForms.fmButtonStyle")
@js.native
object fmButtonStyle extends js.Object {
  @js.native
  sealed trait fmButtonStylePushButton
    extends activexDashMsformsLib.MSFormsNs.fmButtonStyle
  
  @js.native
  sealed trait fmButtonStyleToggleButton
    extends activexDashMsformsLib.MSFormsNs.fmButtonStyle
  
  /* 0 */ val fmButtonStylePushButton: fmButtonStylePushButton with scala.Double = js.native
  /* 1 */ val fmButtonStyleToggleButton: fmButtonStyleToggleButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmButtonStyle with scala.Double] = js.native
}

