package typings.activexDashMsforms.MSForms.EventHelperTypes

import typings.activexDashMsforms.MSForms.ReturnSingle
import typings.activexDashMsforms.MSForms.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPage_Scroll_Parameter extends js.Object {
  val ActionX: fmScrollAction
  val ActionY: fmScrollAction
  val ActualDx: ReturnSingle
  val ActualDy: ReturnSingle
  val Index: Double
  val RequestDx: Double
  val RequestDy: Double
}

object MultiPage_Scroll_Parameter {
  @scala.inline
  def apply(
    ActionX: fmScrollAction,
    ActionY: fmScrollAction,
    ActualDx: ReturnSingle,
    ActualDy: ReturnSingle,
    Index: Double,
    RequestDx: Double,
    RequestDy: Double
  ): MultiPage_Scroll_Parameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX, ActionY = ActionY, ActualDx = ActualDx, ActualDy = ActualDy, Index = Index, RequestDx = RequestDx, RequestDy = RequestDy)
  
    __obj.asInstanceOf[MultiPage_Scroll_Parameter]
  }
}

