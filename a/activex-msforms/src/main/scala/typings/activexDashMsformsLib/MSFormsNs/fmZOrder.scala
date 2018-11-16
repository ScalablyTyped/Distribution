package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmZOrder extends js.Object

@JSGlobal("MSForms.fmZOrder")
@js.native
object fmZOrder extends js.Object {
  @js.native
  sealed trait fmZOrderBack
    extends activexDashMsformsLib.MSFormsNs.fmZOrder
  
  @js.native
  sealed trait fmZOrderFront
    extends activexDashMsformsLib.MSFormsNs.fmZOrder
  
  /* 1 */ val fmZOrderBack: fmZOrderBack with scala.Double = js.native
  /* 0 */ val fmZOrderFront: fmZOrderFront with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmZOrder with scala.Double] = js.native
}

