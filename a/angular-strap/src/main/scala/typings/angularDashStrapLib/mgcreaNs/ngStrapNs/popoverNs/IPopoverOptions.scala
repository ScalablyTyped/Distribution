package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.popoverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var contentTemplate: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* popover */ IPopover, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* popover */ IPopover, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* popover */ IPopover, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* popover */ IPopover, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String | angularLib.angularMod.IAugmentedJQuery | scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var viewport: js.UndefOr[java.lang.String | angularDashStrapLib.Anon_Padding] = js.undefined
}

object IPopoverOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | scala.Boolean = null,
    content: java.lang.String = null,
    contentTemplate: java.lang.String = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    onBeforeHide: /* popover */ IPopover => scala.Unit = null,
    onBeforeShow: /* popover */ IPopover => scala.Unit = null,
    onHide: /* popover */ IPopover => scala.Unit = null,
    onShow: /* popover */ IPopover => scala.Unit = null,
    placement: java.lang.String = null,
    target: java.lang.String | angularLib.angularMod.IAugmentedJQuery | scala.Boolean = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    title: java.lang.String = null,
    trigger: java.lang.String = null,
    viewport: java.lang.String | angularDashStrapLib.Anon_Padding = null
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

