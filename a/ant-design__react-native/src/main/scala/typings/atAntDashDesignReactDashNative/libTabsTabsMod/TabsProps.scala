package typings.atAntDashDesignReactDashNative.libTabsTabsMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeNumbers.`false`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.vertical
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod.PropsType
import typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod.TabBarPropsType
import typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod.TabData
import typings.atAntDashDesignReactDashNative.libTabsStyleTabsMod.TabsStyle
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    distanceToChangeTab: Int | Double = null,
    initialPage: Double | String = null,
    keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ Double) => Unit = null,
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    page: Double | String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    renderTab: /* tab */ TabData => ReactNode = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false` = null,
    renderUnderline: /* style */ js.Any => ReactNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[TabsStyle] = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom = null,
    tabBarTextStyle: StyleProp[TextStyle] = null,
    tabBarUnderlineStyle: StyleProp[ViewStyle] = null,
    tabDirection: horizontal | vertical = null,
    useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined,
    useOnPan: js.UndefOr[Boolean] = js.undefined,
    usePaged: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab)
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps)
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform)
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan)
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged)
    __obj.asInstanceOf[TabsProps]
  }
}

