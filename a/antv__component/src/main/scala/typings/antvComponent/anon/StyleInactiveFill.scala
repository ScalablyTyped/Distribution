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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleInactiveFill] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: InactiveFill): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
