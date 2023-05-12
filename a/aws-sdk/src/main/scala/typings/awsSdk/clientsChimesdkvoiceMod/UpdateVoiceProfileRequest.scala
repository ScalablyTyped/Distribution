package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceProfileRequest extends StObject {
  
  /**
    * The ID of the speaker search task.
    */
  var SpeakerSearchTaskId: NonEmptyString256
  
  /**
    * The profile ID.
    */
  var VoiceProfileId: NonEmptyString256
}
object UpdateVoiceProfileRequest {
  
  inline def apply(SpeakerSearchTaskId: NonEmptyString256, VoiceProfileId: NonEmptyString256): UpdateVoiceProfileRequest = {
    val __obj = js.Dynamic.literal(SpeakerSearchTaskId = SpeakerSearchTaskId.asInstanceOf[js.Any], VoiceProfileId = VoiceProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setSpeakerSearchTaskId(value: NonEmptyString256): Self = StObject.set(x, "SpeakerSearchTaskId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileId", value.asInstanceOf[js.Any])
  }
}
