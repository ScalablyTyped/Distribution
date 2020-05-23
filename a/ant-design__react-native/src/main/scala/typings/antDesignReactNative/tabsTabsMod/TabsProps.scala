package typings.antDesignReactNative.tabsTabsMod

import typings.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.styleTabsMod.TabsStyle
import typings.antDesignReactNative.tabsPropsTypeMod.PropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends PropsType
     with WithThemeStyles[TabsStyle]

object TabsProps {
  @scala.inline
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[Boolean] = js.undefined,
    distanceToChangeTab: js.UndefOr[Double] = js.undefined,
    initialPage: Double | String = null,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Unit = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: Double | String = null,
    prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined,
    renderTab: /* tab */ TabData => ReactNode = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false` = null,
    renderUnderline: /* style */ js.Any => ReactNode = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[TabsStyle] = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom = null,
    tabBarTextStyle: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    tabBarUnderlineStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    tabDirection: horizontal | vertical = null,
    useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined,
    useOnPan: js.UndefOr[Boolean] = js.undefined,
    usePaged: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceToChangeTab)) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.get.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(prerenderingSiblingsNumber)) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.get.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.get.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarTextStyle)) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBarUnderlineStyle)) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

