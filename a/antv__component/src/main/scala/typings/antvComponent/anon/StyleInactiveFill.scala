package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleInactiveFill extends StObject {
  
  var style: InactiveFill
}
object StyleInactiveFill {
  
  inline def apply(style: InactiveFill): StyleInactiveFill = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleInactiveFill]
  }
  
  extension [Self <: StyleInactiveFill](x: Self) {
    
    inline def setStyle(value: InactiveFill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
