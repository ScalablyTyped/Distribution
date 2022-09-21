package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownWidth extends StObject {
  
  var dropdownWidth: Double
  
  var zIndexPopup: Double
}
object DropdownWidth {
  
  inline def apply(dropdownWidth: Double, zIndexPopup: Double): DropdownWidth = {
    val __obj = js.Dynamic.literal(dropdownWidth = dropdownWidth.asInstanceOf[js.Any], zIndexPopup = zIndexPopup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownWidth]
  }
  
  extension [Self <: DropdownWidth](x: Self) {
    
    inline def setDropdownWidth(value: Double): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
    
    inline def setZIndexPopup(value: Double): Self = StObject.set(x, "zIndexPopup", value.asInstanceOf[js.Any])
  }
}
