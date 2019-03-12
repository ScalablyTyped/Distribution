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
    disable: () => scala.Unit,
    element: stdLib.HTMLElement,
    enable: () => scala.Unit,
    enabled: scala.Boolean,
    getArrowElement: () => stdLib.HTMLElement,
    getTitle: () => java.lang.String,
    getTooltipElement: () => stdLib.HTMLElement,
    options: TooltipOptions,
    recalculatePosition: () => scala.Unit,
    timeout: scala.Double,
    toggle: () => scala.Unit,
    toggleEnabled: () => scala.Unit,
    hoverState: atomLib.atomLibStrings.in | atomLib.atomLibStrings.out = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element, enable = js.Any.fromFunction0(enable), enabled = enabled, getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options, recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout, toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled))
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

