package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationAction extends StObject {
  
  var animates: js.Array[Animate]
  
  var option: AnimationActionOption
}
object AnimationAction {
  
  @scala.inline
  def apply(animates: js.Array[Animate], option: AnimationActionOption): AnimationAction = {
    val __obj = js.Dynamic.literal(animates = animates.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAction]
  }
  
  @scala.inline
  implicit class AnimationActionMutableBuilder[Self <: AnimationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimates(value: js.Array[Animate]): Self = StObject.set(x, "animates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatesVarargs(value: Animate*): Self = StObject.set(x, "animates", js.Array(value :_*))
    
    @scala.inline
    def setOption(value: AnimationActionOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
