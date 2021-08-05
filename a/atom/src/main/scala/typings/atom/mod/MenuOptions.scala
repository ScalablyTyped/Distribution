package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOptions extends StObject {
  
  /** The command to trigger when the item is clicked. */
  var command: js.UndefOr[String] = js.undefined
  
  /** The menu itme's label. */
  var label: String
  
  /** An array of sub menus. */
  var submenu: js.UndefOr[js.Array[MenuOptions]] = js.undefined
}
object MenuOptions {
  
  inline def apply(label: String): MenuOptions = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  
  extension [Self <: MenuOptions](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSubmenu(value: js.Array[MenuOptions]): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
    
    inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
    
    inline def setSubmenuVarargs(value: MenuOptions*): Self = StObject.set(x, "submenu", js.Array(value :_*))
  }
}
