package typings.angularStrap.mgcrea.ngStrap.tooltip

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import typings.angularStrap.anon.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | Hide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var prefixEvent: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTemplate: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var viewport: js.UndefOr[String | Padding] = js.undefined
}

object ITooltipOptions {
  @scala.inline
  def apply(
    animation: String = null,
    container: String | Boolean = null,
    delay: Double | Hide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onBeforeHide: /* tooltip */ ITooltip => Unit = null,
    onBeforeShow: /* tooltip */ ITooltip => Unit = null,
    onHide: /* tooltip */ ITooltip => Unit = null,
    onShow: /* tooltip */ ITooltip => Unit = null,
    placement: String = null,
    prefixEvent: String = null,
    target: String | IAugmentedJQuery | Boolean = null,
    template: String = null,
    templateUrl: String = null,
    title: String = null,
    titleTemplate: String = null,
    trigger: String = null,
    viewport: String | Padding = null
  ): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixEvent != null) __obj.updateDynamic("prefixEvent")(prefixEvent.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipOptions]
  }
}

