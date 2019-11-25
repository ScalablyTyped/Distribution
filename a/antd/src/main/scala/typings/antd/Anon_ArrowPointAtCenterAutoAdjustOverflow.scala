package typings.antd

import typings.antd.libTooltipMod.TooltipPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowPointAtCenterAutoAdjustOverflow extends js.Object {
  var arrowPointAtCenter: Boolean
  var autoAdjustOverflow: Boolean
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
  var placement: TooltipPlacement
  var transitionName: String
}

object Anon_ArrowPointAtCenterAutoAdjustOverflow {
  @scala.inline
  def apply(
    arrowPointAtCenter: Boolean,
    autoAdjustOverflow: Boolean,
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: TooltipPlacement,
    transitionName: String
  ): Anon_ArrowPointAtCenterAutoAdjustOverflow = {
    val __obj = js.Dynamic.literal(arrowPointAtCenter = arrowPointAtCenter.asInstanceOf[js.Any], autoAdjustOverflow = autoAdjustOverflow.asInstanceOf[js.Any], mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArrowPointAtCenterAutoAdjustOverflow]
  }
}

