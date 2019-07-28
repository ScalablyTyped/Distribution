package typings.antd

import typings.antd.esTooltipMod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowPointAtCenter extends js.Object {
  var arrowPointAtCenter: Boolean
  var autoAdjustOverflow: Boolean
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
  var placement: TooltipPlacement
  var transitionName: String
}

object Anon_ArrowPointAtCenter {
  @scala.inline
  def apply(
    arrowPointAtCenter: Boolean,
    autoAdjustOverflow: Boolean,
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: TooltipPlacement,
    transitionName: String
  ): Anon_ArrowPointAtCenter = {
    val __obj = js.Dynamic.literal(arrowPointAtCenter = arrowPointAtCenter, autoAdjustOverflow = autoAdjustOverflow, mouseEnterDelay = mouseEnterDelay, mouseLeaveDelay = mouseLeaveDelay, placement = placement, transitionName = transitionName)
  
    __obj.asInstanceOf[Anon_ArrowPointAtCenter]
  }
}

