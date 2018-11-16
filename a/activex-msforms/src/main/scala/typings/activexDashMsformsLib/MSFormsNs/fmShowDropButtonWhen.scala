package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmShowDropButtonWhen extends js.Object

@JSGlobal("MSForms.fmShowDropButtonWhen")
@js.native
object fmShowDropButtonWhen extends js.Object {
  @js.native
  sealed trait fmShowDropButtonWhenAlways
    extends activexDashMsformsLib.MSFormsNs.fmShowDropButtonWhen
  
  @js.native
  sealed trait fmShowDropButtonWhenFocus
    extends activexDashMsformsLib.MSFormsNs.fmShowDropButtonWhen
  
  @js.native
  sealed trait fmShowDropButtonWhenNever
    extends activexDashMsformsLib.MSFormsNs.fmShowDropButtonWhen
  
  /* 2 */ val fmShowDropButtonWhenAlways: fmShowDropButtonWhenAlways with scala.Double = js.native
  /* 1 */ val fmShowDropButtonWhenFocus: fmShowDropButtonWhenFocus with scala.Double = js.native
  /* 0 */ val fmShowDropButtonWhenNever: fmShowDropButtonWhenNever with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmShowDropButtonWhen with scala.Double] = js.native
}

