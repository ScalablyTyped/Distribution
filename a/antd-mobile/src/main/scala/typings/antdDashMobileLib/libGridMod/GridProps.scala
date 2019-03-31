package typings
package antdDashMobileLib.libGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps
  extends antdDashMobileLib.libGridPropsTypeMod.GridPropsType {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var itemStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var square: js.UndefOr[scala.Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    activeClassName: java.lang.String = null,
    activeStyle: scala.Boolean | reactLib.reactMod.ReactNs.CSSProperties = null,
    carouselMaxRow: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    columnNum: scala.Int | scala.Double = null,
    data: js.Array[js.UndefOr[antdDashMobileLib.libGridPropsTypeMod.DataItem]] = null,
    hasLine: js.UndefOr[scala.Boolean] = js.undefined,
    isCarousel: js.UndefOr[scala.Boolean] = js.undefined,
    itemStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    onClick: (/* dataItem */ js.UndefOr[antdDashMobileLib.libGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => scala.Unit = null,
    prefixCls: java.lang.String = null,
    renderItem: (/* dataItem */ js.UndefOr[antdDashMobileLib.libGridPropsTypeMod.DataItem], /* itemIndex */ scala.Double) => reactLib.reactMod.ReactNs.ReactElement[_] = null,
    square: js.UndefOr[scala.Boolean] = js.undefined
  ): GridProps = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (carouselMaxRow != null) __obj.updateDynamic("carouselMaxRow")(carouselMaxRow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (columnNum != null) __obj.updateDynamic("columnNum")(columnNum.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(hasLine)) __obj.updateDynamic("hasLine")(hasLine)
    if (!js.isUndefined(isCarousel)) __obj.updateDynamic("isCarousel")(isCarousel)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction2(renderItem))
    if (!js.isUndefined(square)) __obj.updateDynamic("square")(square)
    __obj.asInstanceOf[GridProps]
  }
}

