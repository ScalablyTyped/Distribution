package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActiveTab
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.antDesignReactNative.tabsStyleMod.TabBarStyle
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.ScrollView
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultTabBarMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends PureComponent[PropsType, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    var _containerMeasurements: js.Any = js.native
    
    var _scrollView: ScrollView = js.native
    
    var _tabContainerMeasurements: js.Any = js.native
    
    var _tabsMeasurements: js.Array[js.Any] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDefaultTabBar(): Unit = js.native
    
    def measureTab(page: Double, event: js.Any): Unit = js.native
    
    def necessarilyMeasurementsCompleted(position: Double, isLastTab: Boolean): js.Any = js.native
    
    def onContainerLayout(e: LayoutChangeEvent): Unit = js.native
    
    def onPress(index: Double): Unit = js.native
    
    def onTabContainerLayout(e: LayoutChangeEvent): Unit = js.native
    
    def renderTab(
      tab: TabData,
      index: Double,
      width: Double,
      onLayoutHandler: js.Any,
      styles: TabBarStyle,
      theme: Theme
    ): Element = js.native
    
    def updateTabPanel(position: Double, pageOffset: Double): Unit = js.native
    
    def updateTabUnderline(position: Double, pageOffset: Double, tabCount: Double): Unit = js.native
    
    def updateView(offset: js.Any): Unit = js.native
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: ActiveTab = js.native
    inline def defaultProps_=(x: ActiveTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait PropsType
    extends StObject
       with TabBarPropsType
       with WithThemeStyles[TabBarStyle] {
    
    /** default: false */
    var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.undefined
    
    var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.undefined
    
    var scrollValue: js.UndefOr[js.Any] = js.undefined
    
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object PropsType {
    
    inline def apply(
      activeTab: Double,
      animated: Boolean,
      goToTab: Double => Unit,
      instanceId: Double,
      tabs: js.Array[TabData]
    ): PropsType = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setDynamicTabUnderlineWidth(value: Boolean): Self = StObject.set(x, "dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicTabUnderlineWidthUndefined: Self = StObject.set(x, "dynamicTabUnderlineWidth", js.undefined)
      
      inline def setKeyboardShouldPersistTaps(value: Boolean): Self = StObject.set(x, "keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShouldPersistTapsUndefined: Self = StObject.set(x, "keyboardShouldPersistTaps", js.undefined)
      
      inline def setScrollValue(value: js.Any): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollValueUndefined: Self = StObject.set(x, "scrollValue", js.undefined)
      
      inline def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      inline def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    }
  }
  
  trait StateType extends StObject {
    
    var _containerWidth: Double
    
    var _leftTabUnderline: Value
    
    var _tabContainerWidth: Double
    
    var _widthTabUnderline: Value
  }
  object StateType {
    
    inline def apply(
      _containerWidth: Double,
      _leftTabUnderline: Value,
      _tabContainerWidth: Double,
      _widthTabUnderline: Value
    ): StateType = {
      val __obj = js.Dynamic.literal(_containerWidth = _containerWidth.asInstanceOf[js.Any], _leftTabUnderline = _leftTabUnderline.asInstanceOf[js.Any], _tabContainerWidth = _tabContainerWidth.asInstanceOf[js.Any], _widthTabUnderline = _widthTabUnderline.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def set_containerWidth(value: Double): Self = StObject.set(x, "_containerWidth", value.asInstanceOf[js.Any])
      
      inline def set_leftTabUnderline(value: Value): Self = StObject.set(x, "_leftTabUnderline", value.asInstanceOf[js.Any])
      
      inline def set_tabContainerWidth(value: Double): Self = StObject.set(x, "_tabContainerWidth", value.asInstanceOf[js.Any])
      
      inline def set_widthTabUnderline(value: Value): Self = StObject.set(x, "_widthTabUnderline", value.asInstanceOf[js.Any])
    }
  }
}
