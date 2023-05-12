package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorStreamingConfigurationRequest extends StObject {
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object GetVoiceConnectorStreamingConfigurationRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorStreamingConfigurationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorStreamingConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
