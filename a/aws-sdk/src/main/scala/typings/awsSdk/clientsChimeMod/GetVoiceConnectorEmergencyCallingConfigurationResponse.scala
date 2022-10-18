package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.EmergencyCallingConfiguration] = js.undefined
}
object GetVoiceConnectorEmergencyCallingConfigurationResponse {
  
  inline def apply(): GetVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  extension [Self <: GetVoiceConnectorEmergencyCallingConfigurationResponse](x: Self) {
    
    inline def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
