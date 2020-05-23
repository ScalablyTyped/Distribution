package typings.antvG2.mod

import typings.antvG2.anon.Fill
import typings.antvG2.anon.Marker
import typings.antvG2.antvG2Strings.`bottom-center`
import typings.antvG2.antvG2Strings.`bottom-left`
import typings.antvG2.antvG2Strings.`bottom-right`
import typings.antvG2.antvG2Strings.`left-bottom`
import typings.antvG2.antvG2Strings.`left-center`
import typings.antvG2.antvG2Strings.`left-top`
import typings.antvG2.antvG2Strings.`right-bottom`
import typings.antvG2.antvG2Strings.`right-center`
import typings.antvG2.antvG2Strings.`right-top`
import typings.antvG2.antvG2Strings.`top-center`
import typings.antvG2.antvG2Strings.`top-left`
import typings.antvG2.antvG2Strings.`top-right`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.horizontal
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.multiple
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.single
import typings.antvG2.antvG2Strings.top
import typings.antvG2.antvG2Strings.vertica
import typings.antvG2.mod.Styles.text
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig extends js.Object {
  var allowAllCanceled: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[Fill] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var containerTpl: js.UndefOr[String] = js.undefined
  var custom: js.UndefOr[Double] = js.undefined
  var defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var itemFormatter: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var itemGap: js.UndefOr[Double] = js.undefined
  var itemMarginBottom: js.UndefOr[Double] = js.undefined
  var itemTpl: js.UndefOr[String] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var items: js.UndefOr[js.Array[Marker]] = js.undefined
  var layout: js.UndefOr[vertica | horizontal] = js.undefined
  var marker: js.UndefOr[String | js.Function] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var position: js.UndefOr[
    top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right`
  ] = js.undefined
  var selectedMode: js.UndefOr[single | multiple] = js.undefined
  var slidable: js.UndefOr[Boolean] = js.undefined
  var textStyle: js.UndefOr[text] = js.undefined
  var title: js.UndefOr[text] = js.undefined
  var unCheckColor: js.UndefOr[String] = js.undefined
  var useHtml: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LegendConfig {
  @scala.inline
  def apply(
    allowAllCanceled: js.UndefOr[Double] = js.undefined,
    background: Fill = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    containerTpl: String = null,
    custom: js.UndefOr[Double] = js.undefined,
    defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    itemFormatter: /* value */ String => String = null,
    itemGap: js.UndefOr[Double] = js.undefined,
    itemMarginBottom: js.UndefOr[Double] = js.undefined,
    itemTpl: String = null,
    itemWidth: js.UndefOr[Double] = js.undefined,
    items: js.Array[Marker] = null,
    layout: vertica | horizontal = null,
    marker: String | js.Function = null,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    onClick: /* e */ MouseEvent => Unit = null,
    onHover: /* e */ MouseEvent => Unit = null,
    position: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-right` | `bottom-left` | `bottom-center` | `bottom-right` = null,
    selectedMode: single | multiple = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    textStyle: text = null,
    title: text = null,
    unCheckColor: String = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): LegendConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAllCanceled)) __obj.updateDynamic("allowAllCanceled")(allowAllCanceled.get.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultClickHandlerEnabled)) __obj.updateDynamic("defaultClickHandlerEnabled")(defaultClickHandlerEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.get.asInstanceOf[js.Any])
    if (itemFormatter != null) __obj.updateDynamic("itemFormatter")(js.Any.fromFunction1(itemFormatter))
    if (!js.isUndefined(itemGap)) __obj.updateDynamic("itemGap")(itemGap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemMarginBottom)) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.get.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unCheckColor != null) __obj.updateDynamic("unCheckColor")(unCheckColor.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
}

