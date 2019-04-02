package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Menu")
@js.native
class Menu protected ()
  extends antdLib.libMenuMod.default {
  def this(props: antdLib.libMenuMod.MenuProps) = this()
}

/* static members */
@JSImport("antd", "Menu")
@js.native
object Menu extends js.Object {
  var Divider: js.Any = js.native
  var Item: antdLib.Anon_IsMenuItem = js.native
  var ItemGroup: js.Any = js.native
  var SubMenu: antdLib.Anon_ContextTypesIsSubMenu = js.native
  var childContextTypes: antdLib.Anon_AntdMenuThemeInlineCollapsed = js.native
  var contextTypes: antdLib.Anon_CollapsedWidth = js.native
  var defaultProps: stdLib.Partial[antdLib.libMenuMod.MenuProps] = js.native
  def getDerivedStateFromProps(nextProps: antdLib.libMenuMod.MenuProps): antdLib.Anon_OpenKeys | scala.Null = js.native
}

