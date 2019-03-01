package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.dropdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object IDropdownOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeHide: js.Function1[/* dropdown */ IDropdown, scala.Unit] = null,
    onBeforeShow: js.Function1[/* dropdown */ IDropdown, scala.Unit] = null,
    onHide: js.Function1[/* dropdown */ IDropdown, scala.Unit] = null,
    onShow: js.Function1[/* dropdown */ IDropdown, scala.Unit] = null,
    placement: java.lang.String = null,
    template: java.lang.String = null,
    templateUrl: java.lang.String = null,
    trigger: java.lang.String = null
  ): IDropdownOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(onBeforeHide)
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(onBeforeShow)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (template != null) __obj.updateDynamic("template")(template)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[IDropdownOptions]
  }
}

