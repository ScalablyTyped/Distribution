package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerConfig extends StObject {
  
  /**
    * Specifies the configuration details of a schedule-triggered flow that you define. Currently, these settings only apply to the Scheduled trigger type.
    */
  var TriggerProperties: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.TriggerProperties] = js.undefined
  
  /**
    * Specifies the type of flow trigger. It can be OnDemand, Scheduled, or Event.
    */
  var TriggerType: typings.awsSdk.clientsCustomerprofilesMod.TriggerType
}
object TriggerConfig {
  
  inline def apply(TriggerType: TriggerType): TriggerConfig = {
    val __obj = js.Dynamic.literal(TriggerType = TriggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerConfig]
  }
  
  extension [Self <: TriggerConfig](x: Self) {
    
    inline def setTriggerProperties(value: TriggerProperties): Self = StObject.set(x, "TriggerProperties", value.asInstanceOf[js.Any])
    
    inline def setTriggerPropertiesUndefined: Self = StObject.set(x, "TriggerProperties", js.undefined)
    
    inline def setTriggerType(value: TriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
  }
}
