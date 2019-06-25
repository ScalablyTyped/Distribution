package typings
package antdLib.esMenuSubMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMenuProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var onTitleClick: js.UndefOr[js.Function1[/* e */ TitleEventEntity, scala.Unit]] = js.undefined
  var onTitleMouseEnter: js.UndefOr[js.Function1[/* e */ TitleEventEntity, scala.Unit]] = js.undefined
  var onTitleMouseLeave: js.UndefOr[js.Function1[/* e */ TitleEventEntity, scala.Unit]] = js.undefined
  var popupOffset: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var rootPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object SubMenuProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onTitleClick: /* e */ TitleEventEntity => scala.Unit = null,
    onTitleMouseEnter: /* e */ TitleEventEntity => scala.Unit = null,
    onTitleMouseLeave: /* e */ TitleEventEntity => scala.Unit = null,
    popupOffset: js.Tuple2[scala.Double, scala.Double] = null,
    rootPrefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null
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

