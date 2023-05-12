package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The updated configuration.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.EmergencyCallingConfiguration] = js.undefined
}
object PutVoiceConnectorEmergencyCallingConfigurationResponse {
  
  inline def apply(): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutVoiceConnectorEmergencyCallingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
