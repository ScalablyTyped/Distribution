package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceProfileResponse extends StObject {
  
  /**
    * The requested voice profile.
    */
  var VoiceProfile: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceProfile] = js.undefined
}
object CreateVoiceProfileResponse {
  
  inline def apply(): CreateVoiceProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVoiceProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceProfile(value: VoiceProfile): Self = StObject.set(x, "VoiceProfile", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileUndefined: Self = StObject.set(x, "VoiceProfile", js.undefined)
  }
}
