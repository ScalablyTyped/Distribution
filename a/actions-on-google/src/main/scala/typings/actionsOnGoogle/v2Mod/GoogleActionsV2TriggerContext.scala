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
  
  @scala.inline
  def apply(): GoogleActionsV2TriggerContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContext]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TriggerContextMutableBuilder[Self <: GoogleActionsV2TriggerContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeContext(value: GoogleActionsV2TriggerContextTimeContext): Self = StObject.set(x, "timeContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeContextUndefined: Self = StObject.set(x, "timeContext", js.undefined)
  }
}
