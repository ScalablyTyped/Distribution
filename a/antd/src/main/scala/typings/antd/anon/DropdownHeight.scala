package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownHeight extends StObject {
  
  var controlItemWidth: Double
  
  var dropdownHeight: Double
  
  var zIndexPopup: Double
}
object DropdownHeight {
  
  inline def apply(controlItemWidth: Double, dropdownHeight: Double, zIndexPopup: Double): DropdownHeight = {
    val __obj = js.Dynamic.literal(controlItemWidth = controlItemWidth.asInstanceOf[js.Any], dropdownHeight = dropdownHeight.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownHeight]
  }
  
  extension [Self <: DropdownHeight](x: Self) {
    
    inline def setControlItemWidth(value: Double): Self = StObject.set(x, "controlItemWidth", value.asInstanceOf[js.Any])
    
    inline def setDropdownHeight(value: Double): Self = StObject.set(x, "dropdownHeight", value.asInstanceOf[js.Any])
    
    inline def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
  }
}
