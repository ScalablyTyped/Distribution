package typings.antd.esMenuMenuItemMod

import typings.antd.esLayoutSiderMod.SiderContextProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: typings.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

