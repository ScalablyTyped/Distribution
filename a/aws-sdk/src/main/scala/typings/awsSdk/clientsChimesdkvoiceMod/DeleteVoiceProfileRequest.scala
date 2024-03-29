package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceProfileRequest extends StObject {
  
  /**
    * The voice profile ID.
    */
  var VoiceProfileId: NonEmptyString256
}
object DeleteVoiceProfileRequest {
  
  inline def apply(VoiceProfileId: NonEmptyString256): DeleteVoiceProfileRequest = {
    val __obj = js.Dynamic.literal(VoiceProfileId = VoiceProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVoiceProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileId", value.asInstanceOf[js.Any])
  }
}
