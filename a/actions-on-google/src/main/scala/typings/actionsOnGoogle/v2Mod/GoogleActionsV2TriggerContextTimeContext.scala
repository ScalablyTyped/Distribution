package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2TriggerContextTimeContext extends StObject {
  
  /**
    * The high-level frequency of the recurring update.
    */
  var frequency: js.UndefOr[GoogleActionsV2TriggerContextTimeContextFrequency] = js.undefined
}
object GoogleActionsV2TriggerContextTimeContext {
  
  inline def apply(): GoogleActionsV2TriggerContextTimeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContextTimeContext]
  }
  
  extension [Self <: GoogleActionsV2TriggerContextTimeContext](x: Self) {
    
    inline def setFrequency(value: GoogleActionsV2TriggerContextTimeContextFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
