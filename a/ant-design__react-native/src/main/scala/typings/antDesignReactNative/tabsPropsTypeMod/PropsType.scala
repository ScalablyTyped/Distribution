package typings.antDesignReactNative.tabsPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typings.antDesignReactNative.antDesignReactNativeStrings.bottom
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.top
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsType extends js.Object {
  
  /** whether to change tabs with animation | default: true */
  var animated: js.UndefOr[Boolean] = js.native
  
  /** destroy inactive tab | default: false */
  var destroyInactiveTab: js.UndefOr[Boolean] = js.native
  
  /** distance to change tab, width ratio | default: 0.3 */
  var distanceToChangeTab: js.UndefOr[Double] = js.native
  
  /** initial Tab, index or key */
  var initialPage: js.UndefOr[Double | String] = js.native
  
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
  
  /** can't render content | default: false */
  var noRenderContent: js.UndefOr[Boolean] = js.native
  
  /** callback when tab is switched */
  var onChange: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  /** on tab click */
  var onTabClick: js.UndefOr[js.Function2[/* tab */ TabData, /* index */ Double, Unit]] = js.native
  
  /** current tab, index or key */
  var page: js.UndefOr[Double | String] = js.native
  
  /**
    * pre-render nearby # sibling, Infinity: render all the siblings, 0: render
    * current page | default: 1
    */
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
  
  /** render the tab of tabbar */
  var renderTab: js.UndefOr[js.Function1[/* tab */ TabData, ReactNode]] = js.native
  
  /** render for TabBar */
  var renderTabBar: js.UndefOr[(js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`] = js.native
  
  /** render the underline of tabbar */
  var renderUnderline: js.UndefOr[js.Function1[/* style */ js.Any, ReactNode]] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /**
    * whether to switch tabs with swipe gestrue in the content | default: true
    */
  var swipeable: js.UndefOr[Boolean] = js.native
  
  /** tabBar active text color */
  var tabBarActiveTextColor: js.UndefOr[String] = js.native
  
  /** tabBar background color */
  var tabBarBackgroundColor: js.UndefOr[String] = js.native
  
  /** tabBar inactive text color */
  var tabBarInactiveTextColor: js.UndefOr[String] = js.native
  
  /** TabBar's position | default: top */
  var tabBarPosition: js.UndefOr[top | bottom] = js.native
  
  /** tabBar text style */
  var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  /** tabBar underline style */
  var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  /** tab paging direction | default: horizontal */
  var tabDirection: js.UndefOr[horizontal | vertical] = js.native
  
  /** tabs data */
  var tabs: js.Array[TabData] = js.native
  
  /** use left instead of transform | default: false */
  var useLeftInsteadTransform: js.UndefOr[Boolean] = js.native
  
  /** use scroll follow pan | default: true */
  var useOnPan: js.UndefOr[Boolean] = js.native
  
  /** use paged | default: true */
  var usePaged: js.UndefOr[Boolean] = js.native
}
object PropsType {
  
  @scala.inline
  def apply(tabs: js.Array[TabData]): PropsType = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTabsVarargs(value: TabData*): Self = this.set("tabs", js.Array(value :_*))
    
    @scala.inline
    def setTabs(value: js.Array[TabData]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setDestroyInactiveTab(value: Boolean): Self = this.set("destroyInactiveTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestroyInactiveTab: Self = this.set("destroyInactiveTab", js.undefined)
    
    @scala.inline
    def setDistanceToChangeTab(value: Double): Self = this.set("distanceToChangeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceToChangeTab: Self = this.set("distanceToChangeTab", js.undefined)
    
    @scala.inline
    def setInitialPage(value: Double | String): Self = this.set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialPage: Self = this.set("initialPage", js.undefined)
    
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    
    @scala.inline
    def setNoRenderContent(value: Boolean): Self = this.set("noRenderContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRenderContent: Self = this.set("noRenderContent", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnTabClick(value: (/* tab */ TabData, /* index */ Double) => Unit): Self = this.set("onTabClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnTabClick: Self = this.set("onTabClick", js.undefined)
    
    @scala.inline
    def setPage(value: Double | String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPrerenderingSiblingsNumber(value: Double): Self = this.set("prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrerenderingSiblingsNumber: Self = this.set("prerenderingSiblingsNumber", js.undefined)
    
    @scala.inline
    def setRenderTab(value: /* tab */ TabData => ReactNode): Self = this.set("renderTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
    
    @scala.inline
    def setRenderTabBarFunction1(value: /* props */ TabBarPropsType => ReactNode): Self = this.set("renderTabBar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderTabBar(value: (js.Function1[/* props */ TabBarPropsType, ReactNode]) | `false`): Self = this.set("renderTabBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTabBar: Self = this.set("renderTabBar", js.undefined)
    
    @scala.inline
    def setRenderUnderline(value: /* style */ js.Any => ReactNode): Self = this.set("renderUnderline", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderUnderline: Self = this.set("renderUnderline", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarActiveTextColor: Self = this.set("tabBarActiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarBackgroundColor: Self = this.set("tabBarBackgroundColor", js.undefined)
    
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarInactiveTextColor: Self = this.set("tabBarInactiveTextColor", js.undefined)
    
    @scala.inline
    def setTabBarPosition(value: top | bottom): Self = this.set("tabBarPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarPosition: Self = this.set("tabBarPosition", js.undefined)
    
    @scala.inline
    def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = this.set("tabBarTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarTextStyle: Self = this.set("tabBarTextStyle", js.undefined)
    
    @scala.inline
    def setTabBarTextStyleNull: Self = this.set("tabBarTextStyle", null)
    
    @scala.inline
    def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = this.set("tabBarUnderlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBarUnderlineStyle: Self = this.set("tabBarUnderlineStyle", js.undefined)
    
    @scala.inline
    def setTabBarUnderlineStyleNull: Self = this.set("tabBarUnderlineStyle", null)
    
    @scala.inline
    def setTabDirection(value: horizontal | vertical): Self = this.set("tabDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabDirection: Self = this.set("tabDirection", js.undefined)
    
    @scala.inline
    def setUseLeftInsteadTransform(value: Boolean): Self = this.set("useLeftInsteadTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLeftInsteadTransform: Self = this.set("useLeftInsteadTransform", js.undefined)
    
    @scala.inline
    def setUseOnPan(value: Boolean): Self = this.set("useOnPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOnPan: Self = this.set("useOnPan", js.undefined)
    
    @scala.inline
    def setUsePaged(value: Boolean): Self = this.set("usePaged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePaged: Self = this.set("usePaged", js.undefined)
  }
}
