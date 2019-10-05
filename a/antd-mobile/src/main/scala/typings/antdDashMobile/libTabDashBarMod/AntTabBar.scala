package typings.antdDashMobile.libTabDashBarMod

import typings.antdDashMobile.libTabDashBarPropsTypeMod.TabBarItemProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabBar
  extends Component[AntTabbarProps, js.Any, js.Any] {
  def getTabs(): js.Array[TabBarItemProps] = js.native
  def renderTabBar(): Element = js.native
}

