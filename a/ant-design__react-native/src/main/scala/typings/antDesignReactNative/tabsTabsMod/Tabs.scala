package typings.antDesignReactNative.tabsTabsMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.antDesignReactNative.anon.Animated
import typings.antDesignReactNative.anon.TypeofDefaultTabBar
import typings.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typings.antDesignReactNative.antDesignReactNativeStrings.vertical
import typings.antDesignReactNative.tabsPropsTypeMod.PropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends Component[TabsProps, StateType, js.Any] {
  def this(props: PropsType) = this()
  var instanceId: Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: Double = js.native
  var tabCache: NumberDictionary[ReactNode] = js.native
  var viewPager: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewPager */ js.Any) | Null = js.native
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
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
  ): js.Any = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
    defaultPrefix: js.UndefOr[scala.Nothing],
    allPrefix: String
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
  def getTabBarBaseProps(): Animated = js.native
  def getTabIndex(props: PropsType): Double = js.native
  def goToTab(index: Double): Boolean = js.native
  def goToTab(index: Double, force: js.UndefOr[scala.Nothing], newState: js.Any): Boolean = js.native
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
  def shouldRenderTab(idx: Double): Boolean = js.native
  def tabClickGoToTab(index: Double): Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

