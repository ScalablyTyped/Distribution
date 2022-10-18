package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerConfig extends StObject {
  
  /**
    * The event type or types for which notifications are triggered.
    */
  var triggerEvents: js.UndefOr[TriggerEventTypeList] = js.undefined
  
  /**
    * The name of the notification trigger.
    */
  var triggerName: js.UndefOr[TriggerName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic through which notifications about deployment or instance events are sent.
    */
  var triggerTargetArn: js.UndefOr[TriggerTargetArn] = js.undefined
}
object TriggerConfig {
  
  inline def apply(): TriggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerConfig]
  }
  
  extension [Self <: TriggerConfig](x: Self) {
    
    inline def setTriggerEvents(value: TriggerEventTypeList): Self = StObject.set(x, "triggerEvents", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventsUndefined: Self = StObject.set(x, "triggerEvents", js.undefined)
    
    inline def setTriggerEventsVarargs(value: TriggerEventType*): Self = StObject.set(x, "triggerEvents", js.Array(value*))
    
    inline def setTriggerName(value: TriggerName): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setTriggerNameUndefined: Self = StObject.set(x, "triggerName", js.undefined)
    
    inline def setTriggerTargetArn(value: TriggerTargetArn): Self = StObject.set(x, "triggerTargetArn", value.asInstanceOf[js.Any])
    
    inline def setTriggerTargetArnUndefined: Self = StObject.set(x, "triggerTargetArn", js.undefined)
  }
}
