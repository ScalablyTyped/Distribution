package typings.antd

import org.scalablytyped.runtime.Instantiable0
import typings.antd.anon.TypeofItem
import typings.antd.anon.TypeofItemGroup
import typings.antd.anon.TypeofSubMenu
import typings.antd.menuContextMod.MenuTheme
import typings.rcMenu.dividerMod.DividerProps
import typings.rcMenu.mod.ItemGroup
import typings.react.mod.Component
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  class default () extends Menu
  /* static members */
  object default {
    
    @JSImport("antd/lib/menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/menu", "default.Divider")
    @js.native
    def Divider: FC[DividerProps] = js.native
    inline def Divider_=(x: FC[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/menu", "default.Item")
    @js.native
    def Item: TypeofItem = js.native
    
    @JSImport("antd/lib/menu", "default.ItemGroup")
    @js.native
    def ItemGroup: TypeofItemGroup & Instantiable0[typings.rcMenu.mod.ItemGroup] = js.native
    inline def ItemGroup_=(x: TypeofItemGroup & Instantiable0[ItemGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ItemGroup")(x.asInstanceOf[js.Any])
    
    inline def Item_=(x: TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/menu", "default.SubMenu")
    @js.native
    def SubMenu: Instantiable0[typings.antd.subMenuMod.default] & TypeofSubMenu = js.native
    inline def SubMenu_=(x: Instantiable0[typings.antd.subMenuMod.default] & TypeofSubMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubMenu")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.vertical
    - typings.antd.antdStrings.`vertical-left`
    - typings.antd.antdStrings.`vertical-right`
    - typings.antd.antdStrings.horizontal
    - typings.antd.antdStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    inline def horizontal: typings.antd.antdStrings.horizontal = "horizontal".asInstanceOf[typings.antd.antdStrings.horizontal]
    
    inline def `inline`: typings.antd.antdStrings.`inline` = "inline".asInstanceOf[typings.antd.antdStrings.`inline`]
    
    inline def vertical: typings.antd.antdStrings.vertical = "vertical".asInstanceOf[typings.antd.antdStrings.vertical]
    
    inline def `vertical-left`: typings.antd.antdStrings.`vertical-left` = "vertical-left".asInstanceOf[typings.antd.antdStrings.`vertical-left`]
    
    inline def `vertical-right`: typings.antd.antdStrings.`vertical-right` = "vertical-right".asInstanceOf[typings.antd.antdStrings.`vertical-right`]
  }
  
  trait MenuProps
    extends StObject
       with typings.rcMenu.menuMod.MenuProps {
    
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    var inlineIndent: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[MenuTheme] = js.undefined
  }
  object MenuProps {
    
    inline def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    extension [Self <: MenuProps](x: Self) {
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      inline def setTheme(value: MenuTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
