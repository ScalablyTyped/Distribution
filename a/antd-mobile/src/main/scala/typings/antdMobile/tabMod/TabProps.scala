package typings.antdMobile.tabMod

import org.scalablytyped.runtime.StringDictionary
import typings.antdMobile.tabBarPropsTypeMod.TabIcon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var dataAttrs: js.UndefOr[StringDictionary[String]] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[TabIcon] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var prefixCls: String
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabIcon] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var unselectedTintColor: js.UndefOr[String] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    prefixCls: String,
    badge: String | Double = null,
    dataAttrs: StringDictionary[String] = null,
    dot: js.UndefOr[Boolean] = js.undefined,
    icon: TabIcon = null,
    onClick: () => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabIcon = null,
    tintColor: String = null,
    title: String = null,
    unselectedTintColor: String = null
  ): TabProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (dataAttrs != null) __obj.updateDynamic("dataAttrs")(dataAttrs.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

