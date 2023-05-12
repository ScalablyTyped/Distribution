package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceProfileDomainRequest extends StObject {
  
  /**
    * The voice profile domain ID.
    */
  var VoiceProfileDomainId: NonEmptyString256
}
object GetVoiceProfileDomainRequest {
  
  inline def apply(VoiceProfileDomainId: NonEmptyString256): GetVoiceProfileDomainRequest = {
    val __obj = js.Dynamic.literal(VoiceProfileDomainId = VoiceProfileDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVoiceProfileDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceProfileDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
  }
}
