package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var autoRotate: Boolean
  
  var position: String
  
  var spacing: Double
  
  var style: TextBaseline
}
object Position {
  
  inline def apply(autoRotate: Boolean, position: String, spacing: Double, style: TextBaseline): Position = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: TextBaseline): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
