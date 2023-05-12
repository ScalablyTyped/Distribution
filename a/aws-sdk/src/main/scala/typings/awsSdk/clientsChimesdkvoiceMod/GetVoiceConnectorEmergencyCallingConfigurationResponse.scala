package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The details of the emergency calling configuration.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.EmergencyCallingConfiguration] = js.undefined
}
object GetVoiceConnectorEmergencyCallingConfigurationResponse {
  
  inline def apply(): GetVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorEmergencyCallingConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
