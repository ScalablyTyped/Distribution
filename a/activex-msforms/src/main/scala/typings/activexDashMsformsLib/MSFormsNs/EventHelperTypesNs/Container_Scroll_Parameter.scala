package typings
package activexDashMsformsLib.MSFormsNs.EventHelperTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container_Scroll_Parameter extends js.Object {
  val ActionX: activexDashMsformsLib.MSFormsNs.fmScrollAction
  val ActionY: activexDashMsformsLib.MSFormsNs.fmScrollAction
  val ActualDx: activexDashMsformsLib.MSFormsNs.ReturnSingle
  val ActualDy: activexDashMsformsLib.MSFormsNs.ReturnSingle
  val RequestDx: scala.Double
  val RequestDy: scala.Double
}

object Container_Scroll_Parameter {
  @scala.inline
  def apply(
    ActionX: activexDashMsformsLib.MSFormsNs.fmScrollAction,
    ActionY: activexDashMsformsLib.MSFormsNs.fmScrollAction,
    ActualDx: activexDashMsformsLib.MSFormsNs.ReturnSingle,
    ActualDy: activexDashMsformsLib.MSFormsNs.ReturnSingle,
    RequestDx: scala.Double,
    RequestDy: scala.Double
  ): Container_Scroll_Parameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX, ActionY = ActionY, ActualDx = ActualDx, ActualDy = ActualDy, RequestDx = RequestDx, RequestDy = RequestDy)
  
    __obj.asInstanceOf[Container_Scroll_Parameter]
  }
}

