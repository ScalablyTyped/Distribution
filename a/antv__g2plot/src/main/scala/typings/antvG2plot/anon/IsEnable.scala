package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEnable extends StObject {
  
  var action: String
  
  var isEnable: Unit
  
  var trigger: String
}
object IsEnable {
  
  inline def apply(action: String, isEnable: Unit, trigger: String): IsEnable = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], isEnable = isEnable.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnable]
  }
  
  extension [Self <: IsEnable](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIsEnable(value: Unit): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
