package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabAnimated extends js.Object {
  var activeTab: scala.Double
  var animated: scala.Boolean
  var goToTab: js.Any
  var instanceId: scala.Double
  var onTabClick: js.UndefOr[
    js.Function2[
      /* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, 
      /* index */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var renderTab: js.UndefOr[
    js.Function1[
      /* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var tabBarActiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  var tabBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var tabBarInactiveTextColor: js.UndefOr[java.lang.String] = js.undefined
  var tabBarPosition: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom
  ] = js.undefined
  var tabBarTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  var tabBarUnderlineStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  var tabs: js.Array[atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData]
}

object Anon_ActiveTabAnimated {
  @scala.inline
  def apply(
    activeTab: scala.Double,
    animated: scala.Boolean,
    goToTab: js.Any,
    instanceId: scala.Double,
    tabBarTextStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle],
    tabBarUnderlineStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle],
    tabs: js.Array[atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData],
    onTabClick: (/* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData, /* index */ scala.Double) => scala.Unit = null,
    renderTab: /* tab */ atAntDashDesignReactDashNativeLib.esTabsPropsTypeMod.TabData => reactLib.reactMod.ReactNode = null,
    renderUnderline: /* style */ js.Any => reactLib.reactMod.ReactNode = null,
    tabBarActiveTextColor: java.lang.String = null,
    tabBarBackgroundColor: java.lang.String = null,
    tabBarInactiveTextColor: java.lang.String = null,
    tabBarPosition: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom = null
  ): Anon_ActiveTabAnimated = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, goToTab = goToTab, instanceId = instanceId, tabBarTextStyle = tabBarTextStyle.asInstanceOf[js.Any], tabBarUnderlineStyle = tabBarUnderlineStyle.asInstanceOf[js.Any], tabs = tabs)
    if (onTabClick != null) __obj.updateDynamic("onTabClick")(js.Any.fromFunction2(onTabClick))
    if (renderTab != null) __obj.updateDynamic("renderTab")(js.Any.fromFunction1(renderTab))
    if (renderUnderline != null) __obj.updateDynamic("renderUnderline")(js.Any.fromFunction1(renderUnderline))
    if (tabBarActiveTextColor != null) __obj.updateDynamic("tabBarActiveTextColor")(tabBarActiveTextColor)
    if (tabBarBackgroundColor != null) __obj.updateDynamic("tabBarBackgroundColor")(tabBarBackgroundColor)
    if (tabBarInactiveTextColor != null) __obj.updateDynamic("tabBarInactiveTextColor")(tabBarInactiveTextColor)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveTabAnimated]
  }
}

