package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  val element: stdLib.HTMLElement
  val enabled: scala.Boolean
  val hoverState: atomLib.atomLibStrings.in | atomLib.atomLibStrings.out | scala.Null
  val options: TooltipOptions
  val timeout: scala.Double
  def disable(): scala.Unit
  def enable(): scala.Unit
  def getArrowElement(): stdLib.HTMLElement
  def getTitle(): java.lang.String
  def getTooltipElement(): stdLib.HTMLElement
  def recalculatePosition(): scala.Unit
  def toggle(): scala.Unit
  def toggleEnabled(): scala.Unit
}

object Tooltip {
  @scala.inline
  def apply(
    disable: js.Function0[scala.Unit],
    element: stdLib.HTMLElement,
    enable: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    getArrowElement: js.Function0[stdLib.HTMLElement],
    getTitle: js.Function0[java.lang.String],
    getTooltipElement: js.Function0[stdLib.HTMLElement],
    options: TooltipOptions,
    recalculatePosition: js.Function0[scala.Unit],
    timeout: scala.Double,
    toggle: js.Function0[scala.Unit],
    toggleEnabled: js.Function0[scala.Unit],
    hoverState: atomLib.atomLibStrings.in | atomLib.atomLibStrings.out = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal(disable = disable, element = element, enable = enable, enabled = enabled, getArrowElement = getArrowElement, getTitle = getTitle, getTooltipElement = getTooltipElement, options = options, recalculatePosition = recalculatePosition, timeout = timeout, toggle = toggle, toggleEnabled = toggleEnabled)
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

