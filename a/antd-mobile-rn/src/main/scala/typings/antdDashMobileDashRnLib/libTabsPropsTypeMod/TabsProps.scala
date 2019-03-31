package typings
package antdDashMobileDashRnLib.libTabsPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps
  extends rmcDashTabsLib.libPropsTypeMod.PropsType {
  /** render for replace the tab of tabbar. */
  var renderTab: js.UndefOr[
    js.Function1[
      /* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    tabs: js.Array[rmcDashTabsLib.libModelsMod.ModelsNs.TabData],
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    destroyInactiveTab: js.UndefOr[scala.Boolean] = js.undefined,
    distanceToChangeTab: scala.Int | scala.Double = null,
    initialPage: scala.Double | java.lang.String = null,
    noRenderContent: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    onTabClick: (/* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData, /* index */ scala.Double) => scala.Unit = null,
    page: scala.Double | java.lang.String = null,
    prerenderingSiblingsNumber: scala.Int | scala.Double = null,
    renderTab: /* tab */ rmcDashTabsLib.libModelsMod.ModelsNs.TabData => reactLib.reactMod.ReactNs.ReactNode = null,
    renderTabBar: (js.Function1[
      /* props */ rmcDashTabsLib.libPropsTypeMod.TabBarPropsType, 
      reactLib.reactMod.ReactNs.ReactNode
    ]) | rmcDashTabsLib.rmcDashTabsLibNumbers.`false` = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: rmcDashTabsLib.rmcDashTabsLibStrings.top | rmcDashTabsLib.rmcDashTabsLibStrings.bottom | rmcDashTabsLib.rmcDashTabsLibStrings.left | rmcDashTabsLib.rmcDashTabsLibStrings.right = null,
    tabBarTextStyle: reactLib.reactMod.ReactNs.CSSProperties | js.Any = null,
    tabBarUnderlineStyle: reactLib.reactMod.ReactNs.CSSProperties | js.Any = null,
    tabDirection: rmcDashTabsLib.rmcDashTabsLibStrings.horizontal | rmcDashTabsLib.rmcDashTabsLibStrings.vertical = null,
    useLeftInsteadTransform: js.UndefOr[scala.Boolean] = js.undefined,
    useOnPan: js.UndefOr[scala.Boolean] = js.undefined,
    usePaged: js.UndefOr[scala.Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (!js.isUndefined(destroyInactiveTab)) __obj.updateDynamic("destroyInactiveTab")(destroyInactiveTab)
    if (distanceToChangeTab != null) __obj.updateDynamic("distanceToChangeTab")(distanceToChangeTab.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderTabBar != null) __obj.updateDynamic("renderTabBar")(renderTabBar.asInstanceOf[js.Any])
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

