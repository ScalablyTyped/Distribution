package typings.antd.esMenuSubMenuMod

import typings.react.reactMod.Component
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMenu
  extends Component[SubMenuProps, js.Any, js.Any] {
  var subMenu: js.Any = js.native
  def onKeyDown(e: MouseEvent[HTMLElement, typings.std.MouseEvent]): Unit = js.native
  def saveSubMenu(subMenu: js.Any): Unit = js.native
}

