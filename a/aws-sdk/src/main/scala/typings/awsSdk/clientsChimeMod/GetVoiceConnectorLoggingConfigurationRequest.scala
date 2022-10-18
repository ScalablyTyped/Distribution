package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorLoggingConfigurationRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object GetVoiceConnectorLoggingConfigurationRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationRequest]
  }
  
  extension [Self <: GetVoiceConnectorLoggingConfigurationRequest](x: Self) {
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
