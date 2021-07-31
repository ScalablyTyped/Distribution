package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationActionOption extends StObject {
  
  var transformOrigin: String
  
  var transition: AnimationTransition
}
object AnimationActionOption {
  
  @scala.inline
  def apply(transformOrigin: String, transition: AnimationTransition): AnimationActionOption = {
    val __obj = js.Dynamic.literal(transformOrigin = transformOrigin.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationActionOption]
  }
  
  @scala.inline
  implicit class AnimationActionOptionMutableBuilder[Self <: AnimationActionOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: AnimationTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}
