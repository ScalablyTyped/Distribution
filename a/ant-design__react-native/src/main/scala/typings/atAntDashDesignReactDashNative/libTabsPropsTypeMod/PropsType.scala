package typings.atAntDashDesignReactDashNative.libTabsPropsTypeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeBooleans.`false`
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.vertical
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[Boolean] = js.undefined
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[Boolean] = js.undefined
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[Double] = js.undefined
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[Double | String] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[Boolean] = js.undefined
  /** callback when tab is switched */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  /** current tab, index or key */
  var page: js.UndefOr[Double | String] = js.undefined
  /**
    * pre-render nearby # sibling, Infinity: render all the siblings, 0: render
    * current page | default: 1
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.undefined
  /** render for TabBar */
  var renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.undefined
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactNode]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * whether to switch tabs with swipe gestrue in the content | default: true
    */
  var swipeable: js.UndefOr[Boolean] = js.undefined
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[horizontal | vertical] = js.undefined
  /** tabs data */
  var tabs: js.Array[TabData]
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[Boolean] = js.undefined
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[Boolean] = js.undefined
  /** use paged | default: true */
  var usePaged: js.UndefOr[Boolean] = js.undefined
}

object PropsType {
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
  ): PropsType = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab.asInstanceOf[js.Any])
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardShouldPersistTaps)) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor.asInstanceOf[js.Any])
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor.asInstanceOf[js.Any])
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor.asInstanceOf[js.Any])
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tabBarTextStyle != null) __obj.updateDynamic("tabBarTextStyle")(tabBarTextStyle.asInstanceOf[js.Any])
    if (tabBarUnderlineStyle != null) __obj.updateDynamic("tabBarUnderlineStyle")(tabBarUnderlineStyle.asInstanceOf[js.Any])
    if (tabDirection != null) __obj.updateDynamic("tabDirection")(tabDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(useLeftInsteadTransform)) __obj.updateDynamic("useLeftInsteadTransform")(useLeftInsteadTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnPan)) __obj.updateDynamic("useOnPan")(useOnPan.asInstanceOf[js.Any])
    if (!js.isUndefined(usePaged)) __obj.updateDynamic("usePaged")(usePaged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

