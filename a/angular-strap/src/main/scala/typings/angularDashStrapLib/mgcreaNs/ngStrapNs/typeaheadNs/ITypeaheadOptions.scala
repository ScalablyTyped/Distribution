package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.typeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITypeaheadOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var autoSelect: js.UndefOr[scala.Boolean] = js.undefined
  var comparator: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var trimValue: js.UndefOr[scala.Boolean] = js.undefined
  var watchOptions: js.UndefOr[scala.Boolean] = js.undefined
}

object ITypeaheadOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    autoSelect: js.UndefOr[scala.Boolean] = js.undefined,
    comparator: java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    minLength: scala.Int | scala.Double = null,
    onBeforeHide: /* typeahead */ ITypeahead => scala.Unit = null,
    onBeforeShow: /* typeahead */ ITypeahead => scala.Unit = null,
    onHide: /* typeahead */ ITypeahead => scala.Unit = null,
    onSelect: /* typeahead */ ITypeahead => scala.Unit = null,
    onShow: /* typeahead */ ITypeahead => scala.Unit = null,
    placement: java.lang.String = null,
    template: java.lang.String = null,
    trigger: java.lang.String = null,
    trimValue: js.UndefOr[scala.Boolean] = js.undefined,
    watchOptions: js.UndefOr[scala.Boolean] = js.undefined
  ): ITypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoSelect)) __obj.updateDynamic("autoSelect")(autoSelect)
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (id != null) __obj.updateDynamic("id")(id)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (template != null) __obj.updateDynamic("template")(template)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(trimValue)) __obj.updateDynamic("trimValue")(trimValue)
    if (!js.isUndefined(watchOptions)) __obj.updateDynamic("watchOptions")(watchOptions)
    __obj.asInstanceOf[ITypeaheadOptions]
  }
}

