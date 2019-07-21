package typings
package atAntDashDesignReactDashNativeLib.esTabsDefaultTabBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabBarPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esTabsStyleMod.TabBarStyle] {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[scala.Boolean] = js.undefined
  var scrollValue: js.UndefOr[js.Any] = js.undefined
  var tabStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var tabsContainerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: scala.Double,
    animated: scala.Boolean,
    goToTab: scala.Double => scala.Unit,
    instanceId: scala.Double,
    tabs: js.Array[atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData],
    dynamicTabUnderlineWidth: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardShouldPersistTaps: js.UndefOr[scala.Boolean] = js.undefined,
    onTabClick: (/* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Int | scala.Double = null,
    renderTab: /* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData => reactLib.reactMod.ReactNode = null,
    renderUnderline: /* style */ js.Any => reactLib.reactMod.ReactNode = null,
    scrollValue: js.Any = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esTabsStyleMod.TabBarStyle] = null,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.left | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.right = null,
    tabBarTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    tabBarUnderlineStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    tabsContainerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId, tabs = tabs)
    if (!js.isUndefined(dynamicTabUnderlineWidth)) __obj.updateDynamic("dynamicTabUnderlineWidth")(dynamicTabUnderlineWidth)
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle)
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle)
    __obj.asInstanceOf[PropsType]
  }
}

