package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MouseEnterDelay extends js.Object {
  var mouseEnterDelay: scala.Double
  var mouseLeaveDelay: scala.Double
  var placement: antdLib.esTooltipMod.TooltipPlacement
  var transitionName: java.lang.String
  var trigger: antdLib.esTooltipMod.TooltipTrigger
}

object Anon_MouseEnterDelay {
  @scala.inline
  def apply(
    mouseEnterDelay: scala.Double,
    mouseLeaveDelay: scala.Double,
    placement: antdLib.esTooltipMod.TooltipPlacement,
    transitionName: java.lang.String,
    trigger: antdLib.esTooltipMod.TooltipTrigger
  ): Anon_MouseEnterDelay = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay, mouseLeaveDelay = mouseLeaveDelay, placement = placement, transitionName = transitionName, trigger = trigger)
  
    __obj.asInstanceOf[Anon_MouseEnterDelay]
  }
}

