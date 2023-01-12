package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmCapabilities extends StObject {
  
  /**
    * Specifies whether to get notified for alarm state changes.
    */
  var acknowledgeFlow: js.UndefOr[AcknowledgeFlow] = js.undefined
  
  /**
    * Specifies the default alarm state. The configuration applies to all alarms that were created based on this alarm model.
    */
  var initializationConfiguration: js.UndefOr[InitializationConfiguration] = js.undefined
}
object AlarmCapabilities {
  
  inline def apply(): AlarmCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAcknowledgeFlow(value: AcknowledgeFlow): Self = StObject.set(x, "acknowledgeFlow", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeFlowUndefined: Self = StObject.set(x, "acknowledgeFlow", js.undefined)
    
    inline def setInitializationConfiguration(value: InitializationConfiguration): Self = StObject.set(x, "initializationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setInitializationConfigurationUndefined: Self = StObject.set(x, "initializationConfiguration", js.undefined)
  }
}
