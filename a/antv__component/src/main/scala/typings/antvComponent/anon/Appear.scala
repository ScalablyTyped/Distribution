package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appear extends StObject {
  
  var appear: Any
  
  var enter: Duration
  
  var leave: Duration
  
  var update: Duration
}
object Appear {
  
  inline def apply(appear: Any, enter: Duration, leave: Duration, update: Duration): Appear = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appear]
  }
  
  extension [Self <: Appear](x: Self) {
    
    inline def setAppear(value: Any): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setEnter(value: Duration): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setLeave(value: Duration): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: Duration): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
