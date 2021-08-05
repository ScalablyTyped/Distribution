package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: LabelStyle
  
  var inactive: LabelStyleFillString
}
object Active {
  
  inline def apply(active: LabelStyle, inactive: LabelStyleFillString): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: LabelStyle): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setInactive(value: LabelStyleFillString): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
  }
}
