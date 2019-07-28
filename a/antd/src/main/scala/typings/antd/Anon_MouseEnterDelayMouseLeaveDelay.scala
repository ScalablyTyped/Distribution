package typings.antd

import typings.antd.libTooltipMod.TooltipPlacement
import typings.antd.libTooltipMod.TooltipTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MouseEnterDelayMouseLeaveDelay extends js.Object {
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
  var placement: TooltipPlacement
  var transitionName: String
  var trigger: TooltipTrigger
}

object Anon_MouseEnterDelayMouseLeaveDelay {
  @scala.inline
  def apply(
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: TooltipPlacement,
    transitionName: String,
    trigger: TooltipTrigger
  ): Anon_MouseEnterDelayMouseLeaveDelay = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay, mouseLeaveDelay = mouseLeaveDelay, placement = placement, transitionName = transitionName, trigger = trigger)
  
    __obj.asInstanceOf[Anon_MouseEnterDelayMouseLeaveDelay]
  }
}

