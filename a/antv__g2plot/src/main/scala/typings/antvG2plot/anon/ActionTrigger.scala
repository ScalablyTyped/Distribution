package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionTrigger extends StObject {
  
  var action: js.Array[String]
  
  var trigger: String
}
object ActionTrigger {
  
  inline def apply(action: js.Array[String], trigger: String): ActionTrigger = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionTrigger] (val x: Self) extends AnyVal {
    
    inline def setAction(value: js.Array[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: String*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
