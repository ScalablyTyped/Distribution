package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.selectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOptions extends js.Object {
  var allNoneButtons: js.UndefOr[scala.Boolean] = js.undefined
  var allText: js.UndefOr[java.lang.String] = js.undefined
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var iconCheckmark: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var maxLengthHtml: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var noneText: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* select */ ISelect, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* select */ ISelect, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* select */ ISelect, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* select */ ISelect, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object ISelectOptions {
  @scala.inline
  def apply(
    allNoneButtons: js.UndefOr[scala.Boolean] = js.undefined,
    allText: java.lang.String = null,
    animation: java.lang.String = null,
    container: java.lang.String | scala.Boolean = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    iconCheckmark: java.lang.String = null,
    id: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    maxLengthHtml: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    noneText: java.lang.String = null,
    onBeforeHide: /* select */ ISelect => scala.Unit = null,
    onBeforeShow: /* select */ ISelect => scala.Unit = null,
    onHide: /* select */ ISelect => scala.Unit = null,
    onShow: /* select */ ISelect => scala.Unit = null,
    placeholder: java.lang.String = null,
    placement: java.lang.String = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: java.lang.String = null
  ): ISelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allNoneButtons)) __obj.updateDynamic("allNoneButtons")(allNoneButtons)
    if (allText != null) __obj.updateDynamic("allText")(allText)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (iconCheckmark != null) __obj.updateDynamic("iconCheckmark")(iconCheckmark)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLengthHtml != null) __obj.updateDynamic("maxLengthHtml")(maxLengthHtml)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (noneText != null) __obj.updateDynamic("noneText")(noneText)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (template != null) __obj.updateDynamic("template")(template)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ISelectOptions]
  }
}

