package typings.antd.esMenuMenuItemMod

import typings.antd.esLayoutSiderMod.SiderContextProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

