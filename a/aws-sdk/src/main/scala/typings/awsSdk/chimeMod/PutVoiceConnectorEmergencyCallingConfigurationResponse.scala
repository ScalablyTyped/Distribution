package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends StObject {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.EmergencyCallingConfiguration] = js.native
}
object PutVoiceConnectorEmergencyCallingConfigurationResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorEmergencyCallingConfigurationResponseMutableBuilder[Self <: PutVoiceConnectorEmergencyCallingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = StObject.set(x, "EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergencyCallingConfigurationUndefined: Self = StObject.set(x, "EmergencyCallingConfiguration", js.undefined)
  }
}
