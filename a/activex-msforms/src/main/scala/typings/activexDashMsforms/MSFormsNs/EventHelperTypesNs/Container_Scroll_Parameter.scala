package typings.activexDashMsforms.MSFormsNs.EventHelperTypesNs

import typings.activexDashMsforms.MSFormsNs.ReturnSingle
import typings.activexDashMsforms.MSFormsNs.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container_Scroll_Parameter extends js.Object {
  val ActionX: fmScrollAction
  val ActionY: fmScrollAction
  val ActualDx: ReturnSingle
  val ActualDy: ReturnSingle
  val RequestDx: Double
  val RequestDy: Double
}

object Container_Scroll_Parameter {
  @scala.inline
  def apply(
    ActionX: fmScrollAction,
    ActionY: fmScrollAction,
    ActualDx: ReturnSingle,
    ActualDy: ReturnSingle,
    RequestDx: Double,
    RequestDy: Double
  ): Container_Scroll_Parameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX, ActionY = ActionY, ActualDx = ActualDx, ActualDy = ActualDy, RequestDx = RequestDx, RequestDy = RequestDy)
  
    __obj.asInstanceOf[Container_Scroll_Parameter]
  }
}

