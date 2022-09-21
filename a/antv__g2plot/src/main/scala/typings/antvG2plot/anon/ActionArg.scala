package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionArg extends StObject {
  
  var action: js.Array[String]
  
  var arg: js.Array[MaskStyle]
  
  def isEnable(context: Any): Boolean
  
  var trigger: String
}
object ActionArg {
  
  inline def apply(action: js.Array[String], arg: js.Array[MaskStyle], isEnable: Any => Boolean, trigger: String): ActionArg = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], arg = arg.asInstanceOf[js.Any], isEnable = js.Any.fromFunction1(isEnable), trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionArg]
  }
  
  extension [Self <: ActionArg](x: Self) {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setArg(value: js.Array[MaskStyle]): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgVarargs(value: MaskStyle*): Self = StObject.set(x, "arg", js.Array(value*))
    
    inline def setIsEnable(value: Any => Boolean): Self = StObject.set(x, "isEnable", js.Any.fromFunction1(value))
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
