package typings
package activexDashMsformsLib.MSFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait fmDragBehavior extends js.Object

@JSGlobal("MSForms.fmDragBehavior")
@js.native
object fmDragBehavior extends js.Object {
  @js.native
  sealed trait fmDragBehaviorDisabled
    extends activexDashMsformsLib.MSFormsNs.fmDragBehavior
  
  @js.native
  sealed trait fmDragBehaviorEnabled
    extends activexDashMsformsLib.MSFormsNs.fmDragBehavior
  
  /* 0 */ val fmDragBehaviorDisabled: fmDragBehaviorDisabled with scala.Double = js.native
  /* 1 */ val fmDragBehaviorEnabled: fmDragBehaviorEnabled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsformsLib.MSFormsNs.fmDragBehavior with scala.Double] = js.native
}

