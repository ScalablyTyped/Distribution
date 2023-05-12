package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorOriginationRequest extends StObject {
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object GetVoiceConnectorOriginationRequest {
  
  inline def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorOriginationRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorOriginationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceConnectorOriginationRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
