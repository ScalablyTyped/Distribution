package typings
package atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[scala.Double] = js.undefined
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[scala.Boolean] = js.undefined
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[scala.Boolean] = js.undefined
  /** callback when tab is switched */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ scala.Double, scala.Unit]] = js.undefined
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ scala.Double, scala.Unit]] = js.undefined
  /** current tab, index or key */
  var page: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * pre-render nearby # sibling, Infinity: render all the siblings, 0: render
    * current page | default: 1
    */
  var prerenderingSiblingsNumber: js.UndefOr[scala.Double] = js.undefined
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, reactLib.reactMod.ReactNode]] = js.undefined
  /** render for TabBar */
  var renderTabBar: js.UndefOr[
    (js.Function1[/* props */ TabBarPropsType, reactLib.reactMod.ReactNode]) | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibNumbers.`false`
  ] = js.undefined
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * whether to switch tabs with swipe gestrue in the content | default: true
    */
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom
  ] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.vertical
  ] = js.undefined
  /** tabs data */
  var tabs: js.Array[TabData]
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[scala.Boolean] = js.undefined
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[scala.Boolean] = js.undefined
  /** use paged | default: true */
  var usePaged: js.UndefOr[scala.Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    tabs: js.Array[TabData],
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    distanceToChangeTab: scala.Int | scala.Double = null,
    initialPage: scala.Double | java.lang.String = null,
    keyboardShouldPersistTaps: js.UndefOr[scala.Boolean] = js.undefined,
    noRenderContent: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* tab */ TabData, /* index */ scala.Double) => scala.Unit = null,
    onTabClick: (/* tab */ TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Double | java.lang.String = null,
    prerenderingSiblingsNumber: scala.Int | scala.Double = null,
    renderTab: /* tab */ TabData => reactLib.reactMod.ReactNode = null,
    renderTabBar: (js.Function1[/* props */ TabBarPropsType, reactLib.reactMod.ReactNode]) | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibNumbers.`false` = null,
    renderUnderline: /* style */ js.Any => reactLib.reactMod.ReactNode = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
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
  ): PropsType = {
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
    __obj.asInstanceOf[PropsType]
  }
}

