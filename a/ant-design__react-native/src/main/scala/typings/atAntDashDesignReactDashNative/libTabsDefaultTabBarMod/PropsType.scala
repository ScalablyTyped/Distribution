package typings.atAntDashDesignReactDashNative.libTabsDefaultTabBarMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.left
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.right
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod.TabBarPropsType
import typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod.TabData
import typings.atAntDashDesignReactDashNative.libTabsStyleMod.TabBarStyle
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    page: Int | Double = null,
    renderTab: /* tab */ TabData => ReactNode = null,
    renderUnderline: /* style */ js.Any => ReactNode = null,
    scrollValue: js.Any = null,
    styles: Partial[TabBarStyle] = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom | left | right = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    tabStyle: ViewStyle = null,
    tabsContainerStyle: ViewStyle = null
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

