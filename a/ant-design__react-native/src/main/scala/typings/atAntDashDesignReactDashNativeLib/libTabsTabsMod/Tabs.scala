package typings
package atAntDashDesignReactDashNativeLib.libTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends reactLib.reactMod.PureComponent[TabsProps, StateType, js.Any] {
  def this(props: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.PropsType) = this()
  var instanceId: scala.Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: scala.Double = js.native
  var scrollView: atAntDashDesignReactDashNativeLib.Anon_Component = js.native
  var tabCache: org.scalablytyped.runtime.NumberDictionary[reactLib.reactMod.ReactNode] = js.native
  var viewPager: reactDashNativeLib.reactDashNativeMod.ViewPagerAndroid | scala.Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(nextProps: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.PropsType): scala.Unit = js.native
  def getOffsetIndex(current: scala.Double, width: scala.Double): scala.Double = js.native
  def getOffsetIndex(current: scala.Double, width: scala.Double, threshold: scala.Double): scala.Double = js.native
  def getSubElement(
    tab: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ]
  ): js.Any = js.native
  def getSubElement(
    tab: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ],
    defaultPrefix: java.lang.String
  ): js.Any = js.native
  def getSubElement(
    tab: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.TabData,
    index: scala.Double,
    subElements: js.Function2[
      /* defaultPrefix */ java.lang.String, 
      /* allPrefix */ java.lang.String, 
      org.scalablytyped.runtime.StringDictionary[_]
    ],
    defaultPrefix: java.lang.String,
    allPrefix: java.lang.String
  ): js.Any = js.native
  def getSubElements(): js.Function2[
    /* defaultPrefix */ js.UndefOr[java.lang.String], 
    /* allPrefix */ js.UndefOr[java.lang.String], 
    org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode]
  ] = js.native
  def getTabBarBaseProps(): atAntDashDesignReactDashNativeLib.Anon_ActiveTabAnimatedBottom = js.native
  def getTabIndex(props: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.PropsType): scala.Double = js.native
  def goToTab(index: scala.Double): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean): scala.Boolean = js.native
  def goToTab(index: scala.Double, force: scala.Boolean, newState: js.Any): scala.Boolean = js.native
  def handleLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def isTabVertical(): scala.Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_horizontal(direction: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal): scala.Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_vertical(direction: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.vertical): scala.Boolean = js.native
  def onMomentumScrollEnd(
    e: reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent]
  ): scala.Unit = js.native
  def renderContent(): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[java.lang.String], 
      /* allPrefix */ js.UndefOr[java.lang.String], 
      org.scalablytyped.runtime.StringDictionary[reactLib.reactMod.ReactNode]
    ]
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def renderTabBar(
    tabBarProps: js.Any,
    DefaultTabBar: reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]
  ): js.UndefOr[js.Object | scala.Null] = js.native
  def scrollTo(index: scala.Double): scala.Unit = js.native
  def scrollTo(index: scala.Double, animated: scala.Boolean): scala.Unit = js.native
  def setScrollView(sv: js.Any): scala.Unit = js.native
  def shouldRenderTab(idx: scala.Double): scala.Boolean = js.native
  def tabClickGoToTab(index: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: atAntDashDesignReactDashNativeLib.TypeofClassDefaultTabBarDefaultProps = js.native
  var defaultProps: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.PropsType = js.native
}

