package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVoiceProfileDomainRequest extends StObject {
  
  /**
    * The voice profile domain ID.
    */
  var VoiceProfileDomainId: NonEmptyString256
}
object DeleteVoiceProfileDomainRequest {
  
  inline def apply(VoiceProfileDomainId: NonEmptyString256): DeleteVoiceProfileDomainRequest = {
    val __obj = js.Dynamic.literal(VoiceProfileDomainId = VoiceProfileDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVoiceProfileDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteVoiceProfileDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
  }
}
