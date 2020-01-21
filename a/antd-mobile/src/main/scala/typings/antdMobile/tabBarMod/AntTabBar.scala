package typings.antdMobile.tabBarMod

import typings.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabBar
  extends Component[AntTabbarProps, js.Any, js.Any] {
  def getTabs(): js.Array[TabBarItemProps] = js.native
  def renderTabBar(): Element = js.native
}

