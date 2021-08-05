package typings.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.TypeofItem
import typings.antd.anon.TypeofItemGroup
import typings.antd.anon.TypeofSubMenu
import typings.antd.menuMod.default
import typings.rcMenu.dividerMod.DividerProps
import typings.rcMenu.mod.ItemGroup
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Menu")
@js.native
class Menu () extends default
/* static members */
object Menu {
  
  @JSImport("antd", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd", "Menu.Divider")
  @js.native
  def Divider: FC[DividerProps] = js.native
  inline def Divider_=(x: FC[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Menu.Item")
  @js.native
  def Item: TypeofItem = js.native
  
  @JSImport("antd", "Menu.ItemGroup")
  @js.native
  def ItemGroup: TypeofItemGroup & Instantiable0[typings.rcMenu.mod.ItemGroup] = js.native
  inline def ItemGroup_=(x: TypeofItemGroup & Instantiable0[ItemGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
  
  inline def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("antd", "Menu.SubMenu")
  @js.native
  def SubMenu: Instantiable0[typings.antd.subMenuMod.default] & TypeofSubMenu = js.native
  inline def SubMenu_=(x: Instantiable0[typings.antd.subMenuMod.default] & TypeofSubMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubMenu")(x.asInstanceOf[js.Any])
}
