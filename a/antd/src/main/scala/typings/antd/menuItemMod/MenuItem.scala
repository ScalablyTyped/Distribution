package typings.antd.menuItemMod

import typings.antd.siderMod.SiderContextProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  def renderItemChildren(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

