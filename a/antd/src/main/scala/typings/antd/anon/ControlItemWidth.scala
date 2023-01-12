package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlItemWidth extends StObject {
  
  var controlItemWidth: Double
  
  var controlWidth: Double
  
  var dropdownHeight: Double
}
object ControlItemWidth {
  
  inline def apply(controlItemWidth: Double, controlWidth: Double, dropdownHeight: Double): ControlItemWidth = {
    val __obj = js.Dynamic.literal(controlItemWidth = controlItemWidth.asInstanceOf[js.Any], controlWidth = controlWidth.asInstanceOf[js.Any], dropdownHeight = dropdownHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlItemWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlItemWidth] (val x: Self) extends AnyVal {
    
    inline def setControlItemWidth(value: Double): Self = StObject.set(x, "controlItemWidth", value.asInstanceOf[js.Any])
    
    inline def setControlWidth(value: Double): Self = StObject.set(x, "controlWidth", value.asInstanceOf[js.Any])
    
    inline def setDropdownHeight(value: Double): Self = StObject.set(x, "dropdownHeight", value.asInstanceOf[js.Any])
  }
}
