package typings.antDesignReactNative.tabBarItemMod

import typings.antDesignReactNative.anon.Badge
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.tabBarPropsTypeMod.TabBarIcon
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[String | Double] = js.undefined
  var icon: js.UndefOr[TabBarIcon] = js.undefined
  var iconStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var renderAsOriginal: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedIcon: js.UndefOr[TabBarIcon] = js.undefined
  var styles: js.UndefOr[ReturnType[js.Function1[/* theme */ Theme, Badge]]] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: String
  var unselectedTintColor: js.UndefOr[String] = js.undefined
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: String,
    badge: String | Double = null,
    icon: TabBarIcon = null,
    iconStyle: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    onPress: () => Unit = null,
    renderAsOriginal: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedIcon: TabBarIcon = null,
    styles: ReturnType[js.Function1[/* theme */ Theme, Badge]] = null,
    tintColor: String = null,
    unselectedTintColor: String = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconStyle)) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(renderAsOriginal)) __obj.updateDynamic("renderAsOriginal")(renderAsOriginal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarItemProps]
  }
}

