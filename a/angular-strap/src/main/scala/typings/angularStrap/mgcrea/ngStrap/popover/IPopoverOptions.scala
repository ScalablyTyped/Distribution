package typings.angularStrap.mgcrea.ngStrap.popover

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.AnonHide
import typings.angularStrap.AnonPadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentTemplate: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double | AnonHide] = js.undefined
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
  var viewport: js.UndefOr[String | AnonPadding] = js.undefined
}

object IPopoverOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoClose: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    content: String = null,
    contentTemplate: String = null,
    delay: Double | AnonHide = null,
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
    viewport: String | AnonPadding = null
  ): IPopoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPopoverOptions]
  }
}

