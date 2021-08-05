package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityNumber extends StObject {
  
  var opacity: Double
}
object OpacityNumber {
  
  inline def apply(opacity: Double): OpacityNumber = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityNumber]
  }
  
  extension [Self <: OpacityNumber](x: Self) {
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
