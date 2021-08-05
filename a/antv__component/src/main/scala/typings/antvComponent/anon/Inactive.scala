package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inactive extends StObject {
  
  var active: NameStyle
  
  var inactive: MarkerStyleNameStyle
  
  var unchecked: MarkerStyle
}
object Inactive {
  
  inline def apply(active: NameStyle, inactive: MarkerStyleNameStyle, unchecked: MarkerStyle): Inactive = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], inactive = inactive.asInstanceOf[js.Any], unchecked = unchecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inactive]
  }
  
  extension [Self <: Inactive](x: Self) {
    
    inline def setActive(value: NameStyle): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setInactive(value: MarkerStyleNameStyle): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
    
    inline def setUnchecked(value: MarkerStyle): Self = StObject.set(x, "unchecked", value.asInstanceOf[js.Any])
  }
}
