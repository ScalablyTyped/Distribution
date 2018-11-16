package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmMode extends js.Object

@JSGlobal("MSForms.fmMode")
@js.native
object fmMode extends js.Object {
  @js.native
  sealed trait fmModeInherit
    extends activexDashMsformsLib.MSFormsNs.fmMode
  
  @js.native
  sealed trait fmModeOff
    extends activexDashMsformsLib.MSFormsNs.fmMode
  
  @js.native
  sealed trait fmModeOn
    extends activexDashMsformsLib.MSFormsNs.fmMode
  
  /* -2 */ val fmModeInherit: fmModeInherit with scala.Double = js.native
  /* 0 */ val fmModeOff: fmModeOff with scala.Double = js.native
  /* -1 */ val fmModeOn: fmModeOn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmMode with scala.Double] = js.native
}

