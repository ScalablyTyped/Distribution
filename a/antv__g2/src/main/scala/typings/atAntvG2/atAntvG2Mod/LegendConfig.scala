package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.Anon_Fill
import typings.atAntvG2.Anon_FillMarker
import typings.atAntvG2.atAntvG2Mod.Styles.text
import typings.atAntvG2.atAntvG2Strings.`bottom-center`
import typings.atAntvG2.atAntvG2Strings.`bottom-left`
import typings.atAntvG2.atAntvG2Strings.`bottom-right`
import typings.atAntvG2.atAntvG2Strings.`left-bottom`
import typings.atAntvG2.atAntvG2Strings.`left-center`
import typings.atAntvG2.atAntvG2Strings.`left-top`
import typings.atAntvG2.atAntvG2Strings.`right-bottom`
import typings.atAntvG2.atAntvG2Strings.`right-center`
import typings.atAntvG2.atAntvG2Strings.`right-top`
import typings.atAntvG2.atAntvG2Strings.`top-bottom`
import typings.atAntvG2.atAntvG2Strings.`top-center`
import typings.atAntvG2.atAntvG2Strings.`top-left`
import typings.atAntvG2.atAntvG2Strings.bottom
import typings.atAntvG2.atAntvG2Strings.horizontal
import typings.atAntvG2.atAntvG2Strings.left
import typings.atAntvG2.atAntvG2Strings.multiple
import typings.atAntvG2.atAntvG2Strings.right
import typings.atAntvG2.atAntvG2Strings.single
import typings.atAntvG2.atAntvG2Strings.top
import typings.atAntvG2.atAntvG2Strings.vertica
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendConfig extends js.Object {
  var allowAllCanceled: js.UndefOr[Double] = js.undefined
  var background: js.UndefOr[Anon_Fill] = js.undefined
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
  var items: js.UndefOr[js.Array[Anon_FillMarker]] = js.undefined
  var layout: js.UndefOr[vertica | horizontal] = js.undefined
  var marker: js.UndefOr[String | js.Function] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
  var position: js.UndefOr[
    top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-bottom` | `bottom-left` | `bottom-center` | `bottom-right`
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
    allowAllCanceled: Int | Double = null,
    background: Anon_Fill = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    containerTpl: String = null,
    custom: Int | Double = null,
    defaultClickHandlerEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    itemFormatter: /* value */ String => String = null,
    itemGap: Int | Double = null,
    itemMarginBottom: Int | Double = null,
    itemTpl: String = null,
    itemWidth: Int | Double = null,
    items: js.Array[Anon_FillMarker] = null,
    layout: vertica | horizontal = null,
    marker: String | js.Function = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    onClick: /* e */ MouseEvent => Unit = null,
    onHover: /* e */ MouseEvent => Unit = null,
    position: top | bottom | left | right | `left-top` | `left-center` | `left-bottom` | `right-top` | `right-center` | `right-bottom` | `top-left` | `top-center` | `top-bottom` | `bottom-left` | `bottom-center` | `bottom-right` = null,
    selectedMode: single | multiple = null,
    slidable: js.UndefOr[Boolean] = js.undefined,
    textStyle: text = null,
    title: text = null,
    unCheckColor: String = null,
    useHtml: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): LegendConfig = {
    val __obj = js.Dynamic.literal()
    if (allowAllCanceled != null) __obj.updateDynamic("allowAllCanceled")(allowAllCanceled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerTpl != null) __obj.updateDynamic("containerTpl")(containerTpl.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultClickHandlerEnabled)) __obj.updateDynamic("defaultClickHandlerEnabled")(defaultClickHandlerEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (itemFormatter != null) __obj.updateDynamic("itemFormatter")(js.Any.fromFunction1(itemFormatter))
    if (itemGap != null) __obj.updateDynamic("itemGap")(itemGap.asInstanceOf[js.Any])
    if (itemMarginBottom != null) __obj.updateDynamic("itemMarginBottom")(itemMarginBottom.asInstanceOf[js.Any])
    if (itemTpl != null) __obj.updateDynamic("itemTpl")(itemTpl.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1(onHover))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selectedMode != null) __obj.updateDynamic("selectedMode")(selectedMode.asInstanceOf[js.Any])
    if (!js.isUndefined(slidable)) __obj.updateDynamic("slidable")(slidable.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unCheckColor != null) __obj.updateDynamic("unCheckColor")(unCheckColor.asInstanceOf[js.Any])
    if (!js.isUndefined(useHtml)) __obj.updateDynamic("useHtml")(useHtml.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendConfig]
  }
}

