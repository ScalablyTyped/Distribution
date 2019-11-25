package typings.angularDashStrap.mgcrea.ngStrap.select

import typings.angularDashStrap.Anon_Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectOptions extends js.Object {
  var allNoneButtons: js.UndefOr[Boolean] = js.undefined
  var allText: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var iconCheckmark: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxLengthHtml: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var noneText: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object ISelectOptions {
  @scala.inline
  def apply(
    allNoneButtons: js.UndefOr[Boolean] = js.undefined,
    allText: String = null,
    animation: String = null,
    container: String | Boolean = null,
    delay: Double | Anon_Hide = null,
    html: js.UndefOr[Boolean] = js.undefined,
    iconCheckmark: String = null,
    id: String = null,
    maxLength: Int | Double = null,
    maxLengthHtml: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    noneText: String = null,
    onBeforeHide: /* select */ ISelect => Unit = null,
    onBeforeShow: /* select */ ISelect => Unit = null,
    onHide: /* select */ ISelect => Unit = null,
    onShow: /* select */ ISelect => Unit = null,
    placeholder: String = null,
    placement: String = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    trigger: String = null
  ): ISelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allNoneButtons)) __obj.updateDynamic("allNoneButtons")(allNoneButtons.asInstanceOf[js.Any])
    if (allText != null) __obj.updateDynamic("allText")(allText.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (iconCheckmark != null) __obj.updateDynamic("iconCheckmark")(iconCheckmark.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxLengthHtml != null) __obj.updateDynamic("maxLengthHtml")(maxLengthHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (noneText != null) __obj.updateDynamic("noneText")(noneText.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectOptions]
  }
}

