package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceProfileSummary extends StObject {
  
  /**
    * The time at which a voice profile summary was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Extends the life of the voice profile. You can use UpdateVoiceProfile to refresh an existing voice profile's voice print and extend the life of the summary.
    */
  var ExpirationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a voice profile summary was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the voice profile in a voice profile summary.
    */
  var VoiceProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the voice profile domain in a voice profile summary.
    */
  var VoiceProfileDomainId: js.UndefOr[NonEmptyString256] = js.undefined
  
  /**
    * The ID of the voice profile in a voice profile summary.
    */
  var VoiceProfileId: js.UndefOr[NonEmptyString256] = js.undefined
}
object VoiceProfileSummary {
  
  inline def apply(): VoiceProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceProfileSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceProfileSummary] (val x: Self) extends AnyVal {
    
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
