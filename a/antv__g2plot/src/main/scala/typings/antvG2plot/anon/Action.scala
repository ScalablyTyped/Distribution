package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var isEnable: (js.Function1[/* context */ Any, Boolean]) | js.Function0[`true`]
  
  var trigger: String
}
object Action {
  
  inline def apply(
    action: String,
    isEnable: (js.Function1[/* context */ Any, Boolean]) | js.Function0[`true`],
    trigger: String
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], isEnable = isEnable.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setIsEnable(value: (js.Function1[/* context */ Any, Boolean]) | js.Function0[`true`]): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
    
    inline def setIsEnableFunction0(value: () => `true`): Self = StObject.set(x, "isEnable", js.Any.fromFunction0(value))
    
    inline def setIsEnableFunction1(value: /* context */ Any => Boolean): Self = StObject.set(x, "isEnable", js.Any.fromFunction1(value))
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
