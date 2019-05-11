package typings
package antdDashMobileLib.esTabDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[TabIcon] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabIcon] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: java.lang.String
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    badge: java.lang.String | scala.Double = null,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    icon: TabIcon = null,
    onPress: () => scala.Unit = null,
    prefixCls: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIcon: TabIcon = null,
    style: reactLib.reactMod.CSSProperties = null
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

