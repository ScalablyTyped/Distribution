package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmCycle extends js.Object

@JSGlobal("MSForms.fmCycle")
@js.native
object fmCycle extends js.Object {
  @js.native
  sealed trait fmCycleAllForms
    extends activexDashMsformsLib.MSFormsNs.fmCycle
  
  @js.native
  sealed trait fmCycleCurrentForm
    extends activexDashMsformsLib.MSFormsNs.fmCycle
  
  /* 0 */ val fmCycleAllForms: fmCycleAllForms with scala.Double = js.native
  /* 2 */ val fmCycleCurrentForm: fmCycleCurrentForm with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmCycle with scala.Double] = js.native
}

