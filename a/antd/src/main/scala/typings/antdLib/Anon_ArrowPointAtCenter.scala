package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrowPointAtCenter extends js.Object {
  var arrowPointAtCenter: scala.Boolean
  var autoAdjustOverflow: scala.Boolean
  var mouseEnterDelay: scala.Double
  var mouseLeaveDelay: scala.Double
  var placement: antdLib.libTooltipMod.TooltipPlacement
  var transitionName: java.lang.String
}

object Anon_ArrowPointAtCenter {
  @scala.inline
  def apply(
    arrowPointAtCenter: scala.Boolean,
    autoAdjustOverflow: scala.Boolean,
    mouseEnterDelay: scala.Double,
    mouseLeaveDelay: scala.Double,
    placement: antdLib.libTooltipMod.TooltipPlacement,
    transitionName: java.lang.String
  ): Anon_ArrowPointAtCenter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow)
    __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay)
    __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay)
    __obj.updateDynamic("placement")(placement)
    __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[Anon_ArrowPointAtCenter]
  }
}

