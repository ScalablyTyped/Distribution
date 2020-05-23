package typings.atom.anon

import typings.atom.atomStrings.click
import typings.atom.atomStrings.focus
import typings.atom.atomStrings.hover
import typings.atom.atomStrings.manual
import typings.atom.mod.TooltipPlacement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Hide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var keyBindingCommand: js.UndefOr[String] = js.undefined
  var keyBindingTarget: js.UndefOr[HTMLElement] = js.undefined
  var placement: js.UndefOr[TooltipPlacement | js.Function0[TooltipPlacement]] = js.undefined
  var title: js.UndefOr[String | js.Function0[String]] = js.undefined
  var trigger: js.UndefOr[click | hover | focus | manual] = js.undefined
}

object Class {
  @scala.inline
  def apply(
    `class`: String = null,
    delay: Hide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    keyBindingCommand: String = null,
    keyBindingTarget: HTMLElement = null,
    placement: TooltipPlacement | js.Function0[TooltipPlacement] = null,
    title: String | js.Function0[String] = null,
    trigger: click | hover | focus | manual = null
  ): Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (keyBindingCommand != null) __obj.updateDynamic("keyBindingCommand")(keyBindingCommand.asInstanceOf[js.Any])
    if (keyBindingTarget != null) __obj.updateDynamic("keyBindingTarget")(keyBindingTarget.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

