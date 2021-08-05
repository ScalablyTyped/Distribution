package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedWidth extends StObject {
  
  var animatedWidth: Double
  
  var overflowWidth: Double
}
object AnimatedWidth {
  
  inline def apply(animatedWidth: Double, overflowWidth: Double): AnimatedWidth = {
    val __obj = js.Dynamic.literal(animatedWidth = animatedWidth.asInstanceOf[js.Any], overflowWidth = overflowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedWidth]
  }
  
  extension [Self <: AnimatedWidth](x: Self) {
    
    inline def setAnimatedWidth(value: Double): Self = StObject.set(x, "animatedWidth", value.asInstanceOf[js.Any])
    
    inline def setOverflowWidth(value: Double): Self = StObject.set(x, "overflowWidth", value.asInstanceOf[js.Any])
  }
}
