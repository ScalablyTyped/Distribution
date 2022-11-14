package typings.antDesignProUtils.anon

import typings.antd.libMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  var menu: MenuProps
  
  var overlay: Unit
}
object Menu {
  
  inline def apply(menu: MenuProps, overlay: Unit): Menu = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setMenu(value: MenuProps): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: Unit): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
