package typings.antdDashMobile.libTabDashBarPropsTypeMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TabIcon] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabIcon] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: String
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: String,
    badge: String | Double = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    icon: TabIcon = null,
    onPress: () => Unit = null,
    prefixCls: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabIcon = null,
    style: CSSProperties = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabBarItemProps]
  }
}

