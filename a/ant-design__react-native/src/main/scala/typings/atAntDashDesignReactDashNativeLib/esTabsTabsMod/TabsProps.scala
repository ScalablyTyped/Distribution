package typings
package atAntDashDesignReactDashNativeLib.esTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.PropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esTabsStyleTabsMod.TabsStyle]

object TabsProps {
  @scala.inline
  def apply(
    tabs: js.Array[atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData],
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    distanceToChangeTab: scala.Int | scala.Double = null,
    initialPage: scala.Double | java.lang.String = null,
    keyboardShouldPersistTaps: js.UndefOr[scala.Boolean] = js.undefined,
    noRenderContent: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, /* index */ scala.Double) => scala.Unit = null,
    onTabClick: (/* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Double | java.lang.String = null,
    prerenderingSiblingsNumber: scala.Int | scala.Double = null,
    renderTab: /* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData => reactLib.reactMod.ReactNode = null,
    renderTabBar: (js.Function1[
      /* props */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabBarPropsType, 
      reactLib.reactMod.ReactNode
    ]) | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibNumbers.`false` = null,
    renderUnderline: /* style */ js.Any => reactLib.reactMod.ReactNode = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esTabsStyleTabsMod.TabsStyle] = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom = null,
    tabBarTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    tabBarUnderlineStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    tabDirection: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.vertical = null,
    useLeftInsteadTransform: js.UndefOr[scala.Boolean] = js.undefined,
    useOnPan: js.UndefOr[scala.Boolean] = js.undefined,
    usePaged: js.UndefOr[scala.Boolean] = js.undefined
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

