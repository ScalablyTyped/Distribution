package typings.angularStrap.mgcrea.ngStrap.dropdown

import typings.angularStrap.AnonHide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object IDropdownOptions {
  @scala.inline
  def apply(
    animation: String = null,
    container: String | Boolean = null,
    delay: Double | AnonHide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    onBeforeHide: /* dropdown */ IDropdown => Unit = null,
    onBeforeShow: /* dropdown */ IDropdown => Unit = null,
    onHide: /* dropdown */ IDropdown => Unit = null,
    onShow: /* dropdown */ IDropdown => Unit = null,
    placement: String = null,
    template: String = null,
    templateUrl: String = null,
    trigger: String = null
  ): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOptions]
  }
}

