package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationAction extends StObject {
  
  var animates: js.Array[Animate]
  
  var option: AnimationActionOption
}
object AnimationAction {
  
  inline def apply(animates: js.Array[Animate], option: AnimationActionOption): AnimationAction = {
    val __obj = js.Dynamic.literal(animates = animates.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAction]
  }
  
  extension [Self <: AnimationAction](x: Self) {
    
    inline def setAnimates(value: js.Array[Animate]): Self = StObject.set(x, "animates", value.asInstanceOf[js.Any])
    
    inline def setAnimatesVarargs(value: Animate*): Self = StObject.set(x, "animates", js.Array(value :_*))
    
    inline def setOption(value: AnimationActionOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
