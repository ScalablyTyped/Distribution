package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmStyle extends js.Object

@JSGlobal("MSForms.fmStyle")
@js.native
object fmStyle extends js.Object {
  @js.native
  sealed trait fmStyleDropDownCombo
    extends activexDashMsformsLib.MSFormsNs.fmStyle
  
  @js.native
  sealed trait fmStyleDropDownList
    extends activexDashMsformsLib.MSFormsNs.fmStyle
  
  /* 0 */ val fmStyleDropDownCombo: fmStyleDropDownCombo with scala.Double = js.native
  /* 2 */ val fmStyleDropDownList: fmStyleDropDownList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmStyle with scala.Double] = js.native
}

