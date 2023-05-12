package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceProfileRequest extends StObject {
  
  /**
    * The ID of the speaker search task.
    */
  var SpeakerSearchTaskId: NonEmptyString256
}
object CreateVoiceProfileRequest {
  
  inline def apply(SpeakerSearchTaskId: NonEmptyString256): CreateVoiceProfileRequest = {
    val __obj = js.Dynamic.literal(SpeakerSearchTaskId = SpeakerSearchTaskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setSpeakerSearchTaskId(value: NonEmptyString256): Self = StObject.set(x, "SpeakerSearchTaskId", value.asInstanceOf[js.Any])
  }
}
