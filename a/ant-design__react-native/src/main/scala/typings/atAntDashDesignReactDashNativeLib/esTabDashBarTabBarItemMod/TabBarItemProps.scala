package typings
package atAntDashDesignReactDashNativeLib.esTabDashBarTabBarItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarItemProps extends js.Object {
  var badge: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var icon: js.UndefOr[atAntDashDesignReactDashNativeLib.esTabDashBarPropsTypeMod.TabBarIcon] = js.undefined
  var iconStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle]
  ] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var renderAsOriginal: js.UndefOr[scala.Boolean] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedIcon: js.UndefOr[atAntDashDesignReactDashNativeLib.esTabDashBarPropsTypeMod.TabBarIcon] = js.undefined
  var styles: js.UndefOr[
    stdLib.ReturnType[
      js.Function1[
        /* theme */ atAntDashDesignReactDashNativeLib.esStyleMod.Theme, 
        atAntDashDesignReactDashNativeLib.Anon_Badge
      ]
    ]
  ] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
  var unselectedTintColor: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarItemProps {
  @scala.inline
  def apply(
    title: java.lang.String,
    badge: java.lang.String | scala.Double = null,
    icon: atAntDashDesignReactDashNativeLib.esTabDashBarPropsTypeMod.TabBarIcon = null,
    iconStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ImageStyle] = null,
    onPress: () => scala.Unit = null,
    renderAsOriginal: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedIcon: atAntDashDesignReactDashNativeLib.esTabDashBarPropsTypeMod.TabBarIcon = null,
    styles: stdLib.ReturnType[
      js.Function1[
        /* theme */ atAntDashDesignReactDashNativeLib.esStyleMod.Theme, 
        atAntDashDesignReactDashNativeLib.Anon_Badge
      ]
    ] = null,
    tintColor: java.lang.String = null,
    unselectedTintColor: java.lang.String = null
  ): TabBarItemProps = {
    val __obj = js.Dynamic.literal(title = title)
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (!js.isUndefined(renderAsOriginal)) __obj.updateDynamic("renderAsOriginal")(renderAsOriginal)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedIcon != null) __obj.updateDynamic("selectedIcon")(selectedIcon.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor)
    __obj.asInstanceOf[TabBarItemProps]
  }
}

