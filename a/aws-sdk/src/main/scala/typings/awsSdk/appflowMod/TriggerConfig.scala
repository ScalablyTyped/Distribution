package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerConfig extends StObject {
  
  /**
    *  Specifies the configuration details of a schedule-triggered flow as defined by the user. Currently, these settings only apply to the Scheduled trigger type. 
    */
  var triggerProperties: js.UndefOr[TriggerProperties] = js.undefined
  
  /**
    *  Specifies the type of flow trigger. This can be OnDemand, Scheduled, or Event. 
    */
  var triggerType: TriggerType
}
object TriggerConfig {
  
  @scala.inline
  def apply(triggerType: TriggerType): TriggerConfig = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerConfig]
  }
  
  @scala.inline
  implicit class TriggerConfigMutableBuilder[Self <: TriggerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriggerProperties(value: TriggerProperties): Self = StObject.set(x, "triggerProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerPropertiesUndefined: Self = StObject.set(x, "triggerProperties", js.undefined)
    
    @scala.inline
    def setTriggerType(value: TriggerType): Self = StObject.set(x, "triggerType", value.asInstanceOf[js.Any])
  }
}
