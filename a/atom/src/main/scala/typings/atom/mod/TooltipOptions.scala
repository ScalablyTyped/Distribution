package typings.atom.mod

import typings.atom.AnonHide
import typings.atom.atomBooleans.`false`
import typings.atom.atomStrings.auto
import typings.atom.atomStrings.bottom_
import typings.atom.atomStrings.left_
import typings.atom.atomStrings.right_
import typings.atom.atomStrings.top_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /** Apply a CSS fade transition to the tooltip. */
  var animation: js.UndefOr[Boolean] = js.undefined
  /** Appends the tooltip to a specific element. */
  var container: js.UndefOr[String | HTMLElement | `false`] = js.undefined
  /**
    *  Delay showing and hiding the tooltip (ms) - does not apply to manual
    *  trigger type.
    */
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
  /** Allow HTML in the tooltip. */
  var html: js.UndefOr[Boolean] = js.undefined
  /** How to position the tooltip. */
  var placement: js.UndefOr[top_ | bottom_ | left_ | right_ | auto] = js.undefined
  /**
    *  If a selector is provided, tooltip objects will be delegated to the
    *  specified targets.
    */
  var selector: js.UndefOr[String] = js.undefined
  /** Base HTML to use when creating the tooltip. */
  var template: js.UndefOr[String] = js.undefined
  /**
    *  Default title value if title attribute isn't present.
    *  If a function is given, it will be called with its this reference set to
    *  the element that the tooltip is attached to.
    */
  var title: js.UndefOr[String | HTMLElement | js.Function0[String]] = js.undefined
  /**
    *  How tooltip is triggered - click | hover | focus | manual.
    *  You may pass multiple triggers; separate them with a space.
    */
  var trigger: js.UndefOr[String] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    container: String | HTMLElement | `false` = null,
    delay: Double | AnonHide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    placement: top_ | bottom_ | left_ | right_ | auto = null,
    selector: String = null,
    template: String = null,
    title: String | HTMLElement | js.Function0[String] = null,
    trigger: String = null
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipOptions]
  }
}

