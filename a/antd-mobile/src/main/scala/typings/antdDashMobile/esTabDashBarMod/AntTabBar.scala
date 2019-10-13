package typings.antdDashMobile.esTabDashBarMod

import typings.antdDashMobile.esTabDashBarPropsTypeMod.TabBarItemProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabBar
  extends Component[AntTabbarProps, js.Any, js.Any] {
  def getTabs(): js.Array[TabBarItemProps] = js.native
  def renderTabBar(): Element = js.native
}

