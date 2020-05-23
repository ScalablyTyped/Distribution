package typings.antd.subMenuMod

import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMenu
  extends Component[SubMenuProps, js.Any, js.Any] {
  var subMenu: js.Any = js.native
  def onKeyDown(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def renderTitle(): js.UndefOr[js.Object | Null] = js.native
  def saveSubMenu(subMenu: js.Any): Unit = js.native
}

