package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillStringOpacityNumber extends StObject {
  
  var fill: String
  
  var opacity: Double
}
object FillStringOpacityNumber {
  
  inline def apply(fill: String, opacity: Double): FillStringOpacityNumber = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStringOpacityNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillStringOpacityNumber] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
