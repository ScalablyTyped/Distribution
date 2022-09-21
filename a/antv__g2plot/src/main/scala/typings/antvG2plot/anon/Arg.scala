package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arg extends StObject {
  
  var action: js.Array[String]
  
  var arg: js.Array[MaskStyle]
  
  def isEnable(context: Any): Any
  @JSName("isEnable")
  var isEnable_Original: js.Function1[/* context */ Any, Any]
  
  var trigger: String
}
object Arg {
  
  inline def apply(
    action: js.Array[String],
    arg: js.Array[MaskStyle],
    isEnable: /* context */ Any => Any,
    trigger: String
  ): Arg = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], arg = arg.asInstanceOf[js.Any], isEnable = js.Any.fromFunction1(isEnable), trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arg]
  }
  
  extension [Self <: Arg](x: Self) {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setArg(value: js.Array[MaskStyle]): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgVarargs(value: MaskStyle*): Self = StObject.set(x, "arg", js.Array(value*))
    
    inline def setIsEnable(value: /* context */ Any => Any): Self = StObject.set(x, "isEnable", js.Any.fromFunction1(value))
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
