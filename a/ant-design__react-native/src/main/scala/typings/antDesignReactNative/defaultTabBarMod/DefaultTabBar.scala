package typings.antDesignReactNative.defaultTabBarMod

import typings.antDesignReactNative.anon.ActiveTab
import typings.antDesignReactNative.anon.Tab
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.ScrollView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends Component[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  var _containerMeasurements: js.Any = js.native
  var _scrollView: ScrollView = js.native
  var _tabContainerMeasurements: js.Any = js.native
  var _tabsMeasurements: js.Array[_] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDefaultTabBar(): Unit = js.native
  def measureTab(page: Double, event: js.Any): Unit = js.native
  def necessarilyMeasurementsCompleted(position: Double, isLastTab: Boolean): js.Any = js.native
  def onContainerLayout(e: LayoutChangeEvent): Unit = js.native
  def onPress(index: Double): Unit = js.native
  def onTabContainerLayout(e: LayoutChangeEvent): Unit = js.native
  def renderTab(tab: TabData, index: Double, width: Double, onLayoutHandler: js.Any, styles: Tab, theme: Theme): Element = js.native
  def updateTabPanel(position: Double, pageOffset: Double): Unit = js.native
  def updateTabUnderline(position: Double, pageOffset: Double, tabCount: Double): Unit = js.native
  def updateView(offset: js.Any): Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  var defaultProps: ActiveTab = js.native
}

