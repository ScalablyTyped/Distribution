package typings.antd.esMenuSubMenuMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, Unit]] = js.undefined
  var popupOffset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object SubMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onTitleClick: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => Unit = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => Unit = null,
    popupOffset: js.Tuple2[Double, Double] = null,
    rootPrefixCls: String = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): SubMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1(onTitleMouseEnter))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1(onTitleMouseLeave))
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset)
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMenuProps]
  }
}

