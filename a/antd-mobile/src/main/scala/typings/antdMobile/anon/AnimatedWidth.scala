package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedWidth extends StObject {
  
  var animatedWidth: Double
  
  var overflowWidth: Double
}
object AnimatedWidth {
  
  @scala.inline
  def apply(animatedWidth: Double, overflowWidth: Double): AnimatedWidth = {
    val __obj = js.Dynamic.literal(animatedWidth = animatedWidth.asInstanceOf[js.Any], overflowWidth = overflowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedWidth]
  }
  
  @scala.inline
  implicit class AnimatedWidthMutableBuilder[Self <: AnimatedWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimatedWidth(value: Double): Self = StObject.set(x, "animatedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowWidth(value: Double): Self = StObject.set(x, "overflowWidth", value.asInstanceOf[js.Any])
  }
}
