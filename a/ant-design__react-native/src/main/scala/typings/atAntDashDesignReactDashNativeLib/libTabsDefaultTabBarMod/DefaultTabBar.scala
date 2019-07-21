package typings
package atAntDashDesignReactDashNativeLib.libTabsDefaultTabBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
@js.native
class DefaultTabBar protected ()
  extends reactLib.reactMod.PureComponent[PropsType, StateType, js.Any] {
  def this(props: PropsType) = this()
  var _containerMeasurements: js.Any = js.native
  var _scrollView: reactDashNativeLib.reactDashNativeMod.ScrollView = js.native
  var _tabContainerMeasurements: js.Any = js.native
  var _tabsMeasurements: js.Array[_] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDefaultTabBar(): scala.Unit = js.native
  def measureTab(page: scala.Double, event: js.Any): scala.Unit = js.native
  def necessarilyMeasurementsCompleted(position: scala.Double, isLastTab: scala.Boolean): js.Any = js.native
  def onContainerLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def onPress(index: scala.Double): scala.Unit = js.native
  def onTabContainerLayout(e: reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent): scala.Unit = js.native
  def renderTab(
    tab: atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod.TabData,
    index: scala.Double,
    width: scala.Double,
    onLayoutHandler: js.Any,
    styles: atAntDashDesignReactDashNativeLib.Anon_ContainerTab,
    theme: atAntDashDesignReactDashNativeLib.libStyleMod.Theme
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  def updateTabPanel(position: scala.Double, pageOffset: scala.Double): scala.Unit = js.native
  def updateTabUnderline(position: scala.Double, pageOffset: scala.Double, tabCount: scala.Double): scala.Unit = js.native
  def updateView(offset: js.Any): scala.Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/DefaultTabBar", "DefaultTabBar")
@js.native
object DefaultTabBar extends js.Object {
  var defaultProps: atAntDashDesignReactDashNativeLib.Anon_ActiveTab = js.native
}

