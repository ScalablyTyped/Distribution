package typings.antDesignReactNative.defaultTabBarMod

import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.left
import typings.antDesignReactNative.antDesignReactNativeStrings.right
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.antDesignReactNative.tabsStyleMod.TabBarStyle
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends TabBarPropsType
     with WithThemeStyles[TabBarStyle] {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
  var scrollValue: js.UndefOr[js.Any] = js.undefined
  var tabStyle: js.UndefOr[ViewStyle] = js.undefined
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData],
    dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: js.UndefOr[Double] = js.undefined,
    renderTab: /* tab */ TabData => ReactNode = null,
    renderUnderline: /* style */ js.Any => ReactNode = null,
    scrollValue: js.Any = null,
    styles: Partial[TabBarStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    tabBarUnderlineStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicTabUnderlineWidth)) __obj.updateDynamic("dynamicTabUnderlineWidth")(dynamicTabUnderlineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.get.asInstanceOf[js.Any])
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (scrollValue != null) __obj.updateDynamic("scrollValue")(scrollValue.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarTextStyle)) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarUnderlineStyle)) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabStyle != null) __obj.updateDynamic("tabStyle")(tabStyle.asInstanceOf[js.Any])
    if (tabsContainerStyle != null) __obj.updateDynamic("tabsContainerStyle")(tabsContainerStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

