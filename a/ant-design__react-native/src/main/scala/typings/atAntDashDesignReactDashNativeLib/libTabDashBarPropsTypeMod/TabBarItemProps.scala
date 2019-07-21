package typings
package atAntDashDesignReactDashNativeLib.libTabDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var icon: js.UndefOr[TabBarIcon] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabBarIcon] = js.undefined
  var title: java.lang.String
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    badge: java.lang.String | scala.Double = null,
    icon: TabBarIcon = null,
    onPress: () => scala.Unit = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIcon: TabBarIcon = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemProps]
  }
}

