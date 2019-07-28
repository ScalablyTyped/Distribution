package typings.angularDashStrap.mgcreaNs.ngStrapNs.popoverNs

import typings.angular.angularMod.IAugmentedJQuery
import typings.angularDashStrap.Anon_Hide
import typings.angularDashStrap.Anon_Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentTemplate: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[String | Anon_Padding] = js.undefined
}

object IPopoverOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    content: String = null,
    contentTemplate: String = null,
    delay: Double | Anon_Hide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onBeforeHide: /* popover */ IPopover => Unit = null,
    onBeforeShow: /* popover */ IPopover => Unit = null,
    onHide: /* popover */ IPopover => Unit = null,
    onShow: /* popover */ IPopover => Unit = null,
    placement: String = null,
    target: String | IAugmentedJQuery | Boolean = null,
    template: String = null,
    templateUrl: String = null,
    title: String = null,
    trigger: String = null,
    viewport: String | Anon_Padding = null
  ): IPopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverOptions]
  }
}

