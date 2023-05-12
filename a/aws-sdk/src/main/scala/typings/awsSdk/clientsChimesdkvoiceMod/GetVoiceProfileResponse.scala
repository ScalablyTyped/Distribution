package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceProfileResponse extends StObject {
  
  /**
    * The voice profile details.
    */
  var VoiceProfile: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfile] = js.undefined
}
object GetVoiceProfileResponse {
  
  inline def apply(): GetVoiceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfile(value: VoiceProfile): Self = StObject.set(x, "VoiceProfile", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileUndefined: Self = StObject.set(x, "VoiceProfile", js.undefined)
  }
}
