package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSpeakerSearchTaskRequest extends StObject {
  
  /**
    * The speaker search task ID.
    */
  var SpeakerSearchTaskId: NonEmptyString256
  
  /**
    * The Voice Connector ID.
    */
  var VoiceConnectorId: NonEmptyString128
}
object StopSpeakerSearchTaskRequest {
  
  inline def apply(SpeakerSearchTaskId: NonEmptyString256, VoiceConnectorId: NonEmptyString128): StopSpeakerSearchTaskRequest = {
    val __obj = js.Dynamic.literal(SpeakerSearchTaskId = SpeakerSearchTaskId.asInstanceOf[js.Any], VoiceConnectorId = VoiceConnectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSpeakerSearchTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopSpeakerSearchTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setSpeakerSearchTaskId(value: NonEmptyString256): Self = StObject.set(x, "SpeakerSearchTaskId", value.asInstanceOf[js.Any])
    
    inline def setVoiceConnectorId(value: NonEmptyString128): Self = StObject.set(x, "VoiceConnectorId", value.asInstanceOf[js.Any])
  }
}
