package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgIsEnable extends StObject {
  
  var action: js.Array[String]
  
  var arg: Unit
  
  var isEnable: Unit
  
  var trigger: String
}
object ArgIsEnable {
  
  inline def apply(action: js.Array[String], arg: Unit, isEnable: Unit, trigger: String): ArgIsEnable = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], arg = arg.asInstanceOf[js.Any], isEnable = isEnable.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgIsEnable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgIsEnable] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setArg(value: Unit): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setIsEnable(value: Unit): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
