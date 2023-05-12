package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceProfileDomainRequest extends StObject {
  
  /**
    * The description of the voice profile domain.
    */
  var Description: js.UndefOr[VoiceProfileDomainDescription] = js.undefined
  
  /**
    * The name of the voice profile domain.
    */
  var Name: js.UndefOr[VoiceProfileDomainName] = js.undefined
  
  /**
    * The domain ID.
    */
  var VoiceProfileDomainId: NonEmptyString256
}
object UpdateVoiceProfileDomainRequest {
  
  inline def apply(VoiceProfileDomainId: NonEmptyString256): UpdateVoiceProfileDomainRequest = {
    val __obj = js.Dynamic.literal(VoiceProfileDomainId = VoiceProfileDomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVoiceProfileDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceProfileDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: VoiceProfileDomainDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: VoiceProfileDomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
  }
}
