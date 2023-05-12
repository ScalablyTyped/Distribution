package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceProfileDomainResponse extends StObject {
  
  /**
    * The requested voice profile domain.
    */
  var VoiceProfileDomain: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfileDomain] = js.undefined
}
object CreateVoiceProfileDomainResponse {
  
  inline def apply(): CreateVoiceProfileDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceProfileDomainResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceProfileDomainResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfileDomain(value: VoiceProfileDomain): Self = StObject.set(x, "VoiceProfileDomain", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainUndefined: Self = StObject.set(x, "VoiceProfileDomain", js.undefined)
  }
}
