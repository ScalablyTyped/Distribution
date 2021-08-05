package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: BusinessCallingSettings
  
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: VoiceConnectorSettings
}
object UpdateGlobalSettingsRequest {
  
  inline def apply(BusinessCalling: BusinessCallingSettings, VoiceConnector: VoiceConnectorSettings): UpdateGlobalSettingsRequest = {
    val __obj = js.Dynamic.literal(BusinessCalling = BusinessCalling.asInstanceOf[js.Any], VoiceConnector = VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalSettingsRequest]
  }
  
  extension [Self <: UpdateGlobalSettingsRequest](x: Self) {
    
    inline def setBusinessCalling(value: BusinessCallingSettings): Self = StObject.set(x, "BusinessCalling", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnector(value: VoiceConnectorSettings): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
  }
}
