package typings.atAntDashDesignReactDashNative.esTabsTabsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.atAntDashDesignReactDashNative.Anon_ActiveTabAnimated
import typings.atAntDashDesignReactDashNative.Anon_Component
import typings.atAntDashDesignReactDashNative.TypeofClassDefaultTabBar
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.vertical
import typings.atAntDashDesignReactDashNative.esTabsPropsTypeMod.PropsType
import typings.atAntDashDesignReactDashNative.esTabsPropsTypeMod.TabData
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.PureComponent
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.LayoutChangeEvent
import typings.reactDashNative.reactDashNativeMod.NativeScrollEvent
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.ViewPagerAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es/tabs/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends PureComponent[TabsProps, StateType, js.Any] {
  def this(props: PropsType) = this()
  var instanceId: Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: Double = js.native
  var scrollView: Anon_Component = js.native
  var tabCache: NumberDictionary[ReactNode] = js.native
  var viewPager: ViewPagerAndroid | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
  def getOffsetIndex(current: Double, width: Double): Double = js.native
  def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
  ): js.Any = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
    defaultPrefix: String
  ): js.Any = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
    defaultPrefix: String,
    allPrefix: String
  ): js.Any = js.native
  def getSubElements(): js.Function2[
    /* defaultPrefix */ js.UndefOr[String], 
    /* allPrefix */ js.UndefOr[String], 
    StringDictionary[ReactNode]
  ] = js.native
  def getTabBarBaseProps(): Anon_ActiveTabAnimated = js.native
  def getTabIndex(props: PropsType): Double = js.native
  def goToTab(index: Double): Boolean = js.native
  def goToTab(index: Double, force: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
  def handleLayout(e: LayoutChangeEvent): Unit = js.native
  def isTabVertical(): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_vertical(direction: vertical): Boolean = js.native
  def onMomentumScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
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
  def setScrollView(sv: js.Any): Unit = js.native
  def shouldRenderTab(idx: Double): Boolean = js.native
  def tabClickGoToTab(index: Double): Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/es/tabs/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofClassDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

