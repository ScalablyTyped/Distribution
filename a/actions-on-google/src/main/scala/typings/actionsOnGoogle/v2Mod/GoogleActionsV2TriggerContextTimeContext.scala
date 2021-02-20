package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2TriggerContextTimeContext extends StObject {
  
  /**
    * The high-level frequency of the recurring update.
    */
  var frequency: js.UndefOr[GoogleActionsV2TriggerContextTimeContextFrequency] = js.native
}
object GoogleActionsV2TriggerContextTimeContext {
  
  @scala.inline
  def apply(): GoogleActionsV2TriggerContextTimeContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2TriggerContextTimeContext]
  }
  
  @scala.inline
  implicit class GoogleActionsV2TriggerContextTimeContextMutableBuilder[Self <: GoogleActionsV2TriggerContextTimeContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: GoogleActionsV2TriggerContextTimeContextFrequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
