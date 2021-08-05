package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animating extends StObject {
  
  var animating: Boolean
  
  var color: String
  
  var size: String
  
  var toast: Boolean
}
object Animating {
  
  inline def apply(animating: Boolean, color: String, size: String, toast: Boolean): Animating = {
    val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toast = toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animating]
  }
  
  extension [Self <: Animating](x: Self) {
    
    inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setToast(value: Boolean): Self = StObject.set(x, "toast", value.asInstanceOf[js.Any])
  }
}
