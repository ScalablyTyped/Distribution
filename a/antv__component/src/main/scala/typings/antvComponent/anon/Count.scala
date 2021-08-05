package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var length: Double
  
  var style: Stroke
}
object Count {
  
  inline def apply(count: Double, length: Double, style: Stroke): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Stroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
