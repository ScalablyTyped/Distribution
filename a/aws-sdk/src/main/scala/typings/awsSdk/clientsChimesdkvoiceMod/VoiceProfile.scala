package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceProfile extends StObject {
  
  /**
    * The time at which the voice profile was created and enrolled.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a voice profile expires unless you re-enroll the caller via the UpdateVoiceProfile API.
    */
  var ExpirationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the voice profile was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the voice profile.
    */
  var VoiceProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the domain that contains the voice profile.
    */
  var VoiceProfileDomainId: js.UndefOr[NonEmptyString256] = js.undefined
  
  /**
    * The ID of the voice profile.
    */
  var VoiceProfileId: js.UndefOr[NonEmptyString256] = js.undefined
}
object VoiceProfile {
  
  inline def apply(): VoiceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceProfile] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setExpirationTimestamp(value: js.Date): Self = StObject.set(x, "ExpirationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimestampUndefined: Self = StObject.set(x, "ExpirationTimestamp", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceProfileArn(value: Arn): Self = StObject.set(x, "VoiceProfileArn", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileArnUndefined: Self = StObject.set(x, "VoiceProfileArn", js.undefined)
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainIdUndefined: Self = StObject.set(x, "VoiceProfileDomainId", js.undefined)
    
    inline def setVoiceProfileId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileIdUndefined: Self = StObject.set(x, "VoiceProfileId", js.undefined)
  }
}
