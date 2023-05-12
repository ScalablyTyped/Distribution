package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceProfileDomainResponse extends StObject {
  
  /**
    * The details of the voice profile domain.
    */
  var VoiceProfileDomain: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfileDomain] = js.undefined
}
object GetVoiceProfileDomainResponse {
  
  inline def apply(): GetVoiceProfileDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceProfileDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceProfileDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileDomain(value: VoiceProfileDomain): Self = StObject.set(x, "VoiceProfileDomain", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainUndefined: Self = StObject.set(x, "VoiceProfileDomain", js.undefined)
  }
}
