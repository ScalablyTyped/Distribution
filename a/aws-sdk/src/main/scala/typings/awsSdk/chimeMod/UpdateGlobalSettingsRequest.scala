package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: js.UndefOr[BusinessCallingSettings] = js.undefined
  
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
}
object UpdateGlobalSettingsRequest {
  
  inline def apply(): UpdateGlobalSettingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalSettingsRequest]
  }
  
  extension [Self <: UpdateGlobalSettingsRequest](x: Self) {
    
    inline def setBusinessCalling(value: BusinessCallingSettings): Self = StObject.set(x, "BusinessCalling", value.asInstanceOf[js.Any])
    
    inline def setBusinessCallingUndefined: Self = StObject.set(x, "BusinessCalling", js.undefined)
    
    inline def setVoiceConnector(value: VoiceConnectorSettings): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorUndefined: Self = StObject.set(x, "VoiceConnector", js.undefined)
  }
}
