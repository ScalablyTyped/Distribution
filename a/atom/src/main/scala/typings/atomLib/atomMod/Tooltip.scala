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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("getArrowElement")(getArrowElement)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getTooltipElement")(getTooltipElement)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("recalculatePosition")(recalculatePosition)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("toggleEnabled")(toggleEnabled)
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

