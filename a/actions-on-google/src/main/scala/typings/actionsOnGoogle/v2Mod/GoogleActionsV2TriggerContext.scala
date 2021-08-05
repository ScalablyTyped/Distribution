package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2TriggerContext extends StObject {
  
  /**
    * The time context for which the update can be triggered.
    */
  var timeContext: js.UndefOr[GoogleActionsV2TriggerContextTimeContext] = js.undefined
}
object GoogleActionsV2TriggerContext {
  
  inline def apply(): GoogleActionsV2TriggerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContext]
  }
  
  extension [Self <: GoogleActionsV2TriggerContext](x: Self) {
    
    inline def setTimeContext(value: GoogleActionsV2TriggerContextTimeContext): Self = StObject.set(x, "timeContext", value.asInstanceOf[js.Any])
    
    inline def setTimeContextUndefined: Self = StObject.set(x, "timeContext", js.undefined)
  }
}
