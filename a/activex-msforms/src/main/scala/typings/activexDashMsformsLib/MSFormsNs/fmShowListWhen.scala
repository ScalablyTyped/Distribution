package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmShowListWhen extends js.Object

@JSGlobal("MSForms.fmShowListWhen")
@js.native
object fmShowListWhen extends js.Object {
  @js.native
  sealed trait fmShowListWhenAlways
    extends activexDashMsformsLib.MSFormsNs.fmShowListWhen
  
  @js.native
  sealed trait fmShowListWhenButton
    extends activexDashMsformsLib.MSFormsNs.fmShowListWhen
  
  @js.native
  sealed trait fmShowListWhenFocus
    extends activexDashMsformsLib.MSFormsNs.fmShowListWhen
  
  @js.native
  sealed trait fmShowListWhenNever
    extends activexDashMsformsLib.MSFormsNs.fmShowListWhen
  
  /* 3 */ val fmShowListWhenAlways: fmShowListWhenAlways with scala.Double = js.native
  /* 1 */ val fmShowListWhenButton: fmShowListWhenButton with scala.Double = js.native
  /* 2 */ val fmShowListWhenFocus: fmShowListWhenFocus with scala.Double = js.native
  /* 0 */ val fmShowListWhenNever: fmShowListWhenNever with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmShowListWhen with scala.Double] = js.native
}

