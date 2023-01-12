package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateChangeConfiguration extends StObject {
  
  /**
    * The trigger type. If the value is SNOOZE_TIMEOUT, the snooze duration ends and the alarm automatically changes to the NORMAL state.
    */
  var triggerType: js.UndefOr[TriggerType] = js.undefined
}
object StateChangeConfiguration {
  
  inline def apply(): StateChangeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateChangeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateChangeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
    
    inline def setTriggerTypeUndefined: Self = StObject.set(x, "triggerType", js.undefined)
  }
}
