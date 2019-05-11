package typings
package antdLib.esMenuMenuItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends reactLib.reactMod.Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: reactLib.reactMod.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def renderItem(hasSiderCollapsed: antdLib.esLayoutSiderMod.SiderContextProps): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveMenuItem(menuItem: this.type): scala.Unit = js.native
}

