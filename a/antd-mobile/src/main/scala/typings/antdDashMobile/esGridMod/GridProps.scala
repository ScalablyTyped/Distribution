package typings.antdDashMobile.esGridMod

import typings.antdDashMobile.esGridPropsTypeMod.DataItem
import typings.antdDashMobile.esGridPropsTypeMod.GridPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps extends GridPropsType {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[Boolean | CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var itemStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var square: js.UndefOr[Boolean] = js.undefined
}

object GridProps {
  @scala.inline
  def apply(
    activeClassName: String = null,
    activeStyle: Boolean | CSSProperties = null,
    carouselMaxRow: Int | Double = null,
    className: String = null,
    columnNum: Int | Double = null,
    data: js.Array[js.UndefOr[DataItem]] = null,
    hasLine: js.UndefOr[Boolean] = js.undefined,
    isCarousel: js.UndefOr[Boolean] = js.undefined,
    itemStyle: CSSProperties = null,
    onClick: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit = null,
    prefixCls: String = null,
    renderItem: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement = null,
    square: js.UndefOr[Boolean] = js.undefined
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

