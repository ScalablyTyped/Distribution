package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.configProviderContextMod.DirectionType
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuContextMod extends Shortcut {
  
  @JSImport("antd/lib/menu/MenuContext", JSImport.Default)
  @js.native
  val default: Context[MenuContextProps] = js.native
  
  trait MenuContextProps extends StObject {
    
    var antdMenuTheme: js.UndefOr[MenuTheme] = js.undefined
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    /** @private Internal Usage. Safe to remove */
    var disableMenuItemTitleTooltip: js.UndefOr[Boolean] = js.undefined
    
    var firstLevel: Boolean
    
    var inlineCollapsed: Boolean
    
    var prefixCls: String
  }
  object MenuContextProps {
    
    inline def apply(firstLevel: Boolean, inlineCollapsed: Boolean, prefixCls: String): MenuContextProps = {
      val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], inlineCollapsed = inlineCollapsed.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextProps]
    }
    
    extension [Self <: MenuContextProps](x: Self) {
      
      inline def setAntdMenuTheme(value: MenuTheme): Self = StObject.set(x, "antdMenuTheme", value.asInstanceOf[js.Any])
      
      inline def setAntdMenuThemeUndefined: Self = StObject.set(x, "antdMenuTheme", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisableMenuItemTitleTooltip(value: Boolean): Self = StObject.set(x, "disableMenuItemTitleTooltip", value.asInstanceOf[js.Any])
      
      inline def setDisableMenuItemTitleTooltipUndefined: Self = StObject.set(x, "disableMenuItemTitleTooltip", js.undefined)
      
      inline def setFirstLevel(value: Boolean): Self = StObject.set(x, "firstLevel", value.asInstanceOf[js.Any])
      
      inline def setInlineCollapsed(value: Boolean): Self = StObject.set(x, "inlineCollapsed", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.light
    - typings.antd.antdStrings.dark
  */
  trait MenuTheme extends StObject
  object MenuTheme {
    
    inline def dark: typings.antd.antdStrings.dark = "dark".asInstanceOf[typings.antd.antdStrings.dark]
    
    inline def light: typings.antd.antdStrings.light = "light".asInstanceOf[typings.antd.antdStrings.light]
  }
  
  type _To = Context[MenuContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `menuContextMod.foo` */
  override def _to: Context[MenuContextProps] = default
}
