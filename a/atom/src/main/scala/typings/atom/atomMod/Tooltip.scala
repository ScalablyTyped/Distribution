package typings.atom.atomMod

import typings.atom.atomStrings.in
import typings.atom.atomStrings.out
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  val element: HTMLElement
  val enabled: Boolean
  val hoverState: in | out | Null
  val options: TooltipOptions
  val timeout: Double
  def disable(): Unit
  def enable(): Unit
  def getArrowElement(): HTMLElement
  def getTitle(): String
  def getTooltipElement(): HTMLElement
  def recalculatePosition(): Unit
  def toggle(): Unit
  def toggleEnabled(): Unit
}

object Tooltip {
  @scala.inline
  def apply(
    disable: () => Unit,
    element: HTMLElement,
    enable: () => Unit,
    enabled: Boolean,
    getArrowElement: () => HTMLElement,
    getTitle: () => String,
    getTooltipElement: () => HTMLElement,
    options: TooltipOptions,
    recalculatePosition: () => Unit,
    timeout: Double,
    toggle: () => Unit,
    toggleEnabled: () => Unit,
    hoverState: in | out = null
  ): Tooltip = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), enabled = enabled.asInstanceOf[js.Any], getArrowElement = js.Any.fromFunction0(getArrowElement), getTitle = js.Any.fromFunction0(getTitle), getTooltipElement = js.Any.fromFunction0(getTooltipElement), options = options.asInstanceOf[js.Any], recalculatePosition = js.Any.fromFunction0(recalculatePosition), timeout = timeout.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle), toggleEnabled = js.Any.fromFunction0(toggleEnabled))
    if (hoverState != null) __obj.updateDynamic("hoverState")(hoverState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
}

