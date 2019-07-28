package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.esTabsPropsTypeMod.TabData
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTabAnimated extends js.Object {
  var activeTab: Double
  var animated: Boolean
  var goToTab: js.Any
  var instanceId: Double
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.undefined
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.undefined
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactNode]] = js.undefined
  var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
  var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
  var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  var tabBarTextStyle: StyleProp[TextStyle]
  var tabBarUnderlineStyle: StyleProp[ViewStyle]
  var tabs: js.Array[TabData]
}

object Anon_ActiveTabAnimated {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: js.Any,
    instanceId: Double,
    tabBarTextStyle: StyleProp[TextStyle],
    tabBarUnderlineStyle: StyleProp[ViewStyle],
    tabs: js.Array[TabData],
    onTabClick: (/* tab */ TabData, /* index */ Double) => Unit = null,
    renderTab: /* tab */ TabData => ReactNode = null,
    renderUnderline: /* style */ js.Any => ReactNode = null,
    tabBarActiveTextColor: String = null,
    tabBarBackgroundColor: String = null,
    tabBarInactiveTextColor: String = null,
    tabBarPosition: top | bottom = null
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

