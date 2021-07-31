package typings.antDesignReactNative

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.antDesignReactNative.anon.Animated
import typings.antDesignReactNative.anon.TypeofDefaultTabBar
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.styleTabsMod.TabsStyle
import typings.antDesignReactNative.tabsPropsTypeMod.PropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNativeCommunityViewpager.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends PureComponent[TabsProps, StateType, js.Any] {
    def this(props: PropsType) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(): Unit = js.native
    
    def getOffsetIndex(current: Double, width: Double): Double = js.native
    def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
    
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[js.Any]]
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[js.Any]],
      defaultPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[js.Any]],
      defaultPrefix: String,
      allPrefix: String
    ): js.Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[js.Any]],
      defaultPrefix: Unit,
      allPrefix: String
    ): js.Any = js.native
    
    def getSubElements(): js.Function2[
        /* defaultPrefix */ js.UndefOr[String], 
        /* allPrefix */ js.UndefOr[String], 
        StringDictionary[ReactNode]
      ] = js.native
    
    def getTabBarBaseProps(): Animated = js.native
    
    def getTabIndex(props: PropsType): Double = js.native
    
    def goToTab(index: Double): Boolean = js.native
    def goToTab(index: Double, force: Boolean): Boolean = js.native
    def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
    def goToTab(index: Double, force: Unit, newState: js.Any): Boolean = js.native
    
    def handleLayout(e: LayoutChangeEvent): Unit = js.native
    
    var instanceId: Double = js.native
    
    def isTabVertical(): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
    @JSName("isTabVertical")
    def isTabVertical_vertical(direction: vertical): Boolean = js.native
    
    /** compatible for different between react and preact in `setState`. */
    var nextCurrentTab: js.Any = js.native
    
    def onMomentumScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    var prevCurrentTab: Double = js.native
    
    def renderContent(): Element = js.native
    def renderContent(
      getSubElements: js.Function2[
          /* defaultPrefix */ js.UndefOr[String], 
          /* allPrefix */ js.UndefOr[String], 
          StringDictionary[ReactNode]
        ]
    ): Element = js.native
    
    def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ComponentClass[js.Object, ComponentState]): js.UndefOr[js.Object | Null] = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    def shouldRenderTab(idx: Double): Boolean = js.native
    
    var tabCache: NumberDictionary[ReactNode] = js.native
    
    def tabClickGoToTab(index: Double): Unit = js.native
    
    var viewPager: default | Null = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StateType extends StObject {
    
    var containerWidth: Double
    
    var currentTab: Double
    
    var scrollValue: Value
    
    var scrollX: Value
  }
  object StateType {
    
    @scala.inline
    def apply(containerWidth: Double, currentTab: Double, scrollValue: Value, scrollX: Value): StateType = {
      val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTab(value: Double): Self = StObject.set(x, "currentTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollX(value: Value): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabsProps
    extends StObject
       with PropsType
       with WithThemeStyles[TabsStyle]
  object TabsProps {
    
    @scala.inline
    def apply(tabs: js.Array[TabData]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
  }
}
