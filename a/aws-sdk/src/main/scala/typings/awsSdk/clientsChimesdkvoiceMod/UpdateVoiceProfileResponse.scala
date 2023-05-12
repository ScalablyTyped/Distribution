package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVoiceProfileResponse extends StObject {
  
  /**
    * The updated voice profile settings.
    */
  var VoiceProfile: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfile] = js.undefined
}
object UpdateVoiceProfileResponse {
  
  inline def apply(): UpdateVoiceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVoiceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVoiceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfile(value: VoiceProfile): Self = StObject.set(x, "VoiceProfile", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileUndefined: Self = StObject.set(x, "VoiceProfile", js.undefined)
  }
}
