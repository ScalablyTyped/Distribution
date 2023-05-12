package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceProfileDomainResponse extends StObject {
  
  /**
    * The updated details of the voice profile domain.
    */
  var VoiceProfileDomain: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfileDomain] = js.undefined
}
object UpdateVoiceProfileDomainResponse {
  
  inline def apply(): UpdateVoiceProfileDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceProfileDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceProfileDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileDomain(value: VoiceProfileDomain): Self = StObject.set(x, "VoiceProfileDomain", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainUndefined: Self = StObject.set(x, "VoiceProfileDomain", js.undefined)
  }
}
