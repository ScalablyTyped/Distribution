package typings.antd.menuItemMod

import typings.antd.siderMod.SiderContextProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  
  def renderItemChildren(inlineCollapsed: Boolean): js.UndefOr[js.Object | Null] = js.native
}
