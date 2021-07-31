package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceConnectorRequest extends StObject {
  
  /**
    * The Amazon Chime Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString
}
object GetVoiceConnectorRequest {
  
  @scala.inline
  def apply(VoiceConnectorId: NonEmptyString): GetVoiceConnectorRequest = {
    val __obj = js.Dynamic.literal(VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceConnectorRequest]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorRequestMutableBuilder[Self <: GetVoiceConnectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceConnectorId(value: NonEmptyString): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
