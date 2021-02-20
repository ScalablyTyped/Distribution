package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalSettingsRequest extends StObject {
  
  /**
    * The Amazon Chime Business Calling settings.
    */
  var BusinessCalling: BusinessCallingSettings = js.native
  
  /**
    * The Amazon Chime Voice Connector settings.
    */
  var VoiceConnector: VoiceConnectorSettings = js.native
}
object UpdateGlobalSettingsRequest {
  
  @scala.inline
  def apply(BusinessCalling: BusinessCallingSettings, VoiceConnector: VoiceConnectorSettings): UpdateGlobalSettingsRequest = {
    val __obj = js.Dynamic.literal(BusinessCalling = BusinessCalling.asInstanceOf[js.Any], VoiceConnector = VoiceConnector.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateGlobalSettingsRequestMutableBuilder[Self <: UpdateGlobalSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusinessCalling(value: BusinessCallingSettings): Self = StObject.set(x, "BusinessCalling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceConnector(value: VoiceConnectorSettings): Self = StObject.set(x, "VoiceConnector", value.asInstanceOf[js.Any])
  }
}
