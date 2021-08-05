package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemIcon extends StObject {
  
  var clearIcon: ReactNode
  
  var itemIcon: js.Object | Null
  
  var removeIcon: js.Object | Null
  
  var suffixIcon: js.Object | Null
}
object ItemIcon {
  
  inline def apply(): ItemIcon = {
    val __obj = js.Dynamic.literal(itemIcon = null, removeIcon = null, suffixIcon = null)
    __obj.asInstanceOf[ItemIcon]
  }
  
  extension [Self <: ItemIcon](x: Self) {
    
    inline def setClearIcon(value: ReactNode): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
    
    inline def setItemIcon(value: js.Object): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    inline def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
    
    inline def setRemoveIcon(value: js.Object): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
    
    inline def setSuffixIcon(value: js.Object): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
  }
}
