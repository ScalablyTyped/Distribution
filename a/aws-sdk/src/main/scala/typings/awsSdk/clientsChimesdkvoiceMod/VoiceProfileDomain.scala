package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceProfileDomain extends StObject {
  
  /**
    * The time at which the voice profile domain was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the voice profile domain.
    */
  var Description: js.UndefOr[VoiceProfileDomainDescription] = js.undefined
  
  /**
    * The name of the voice profile domain.
    */
  var Name: js.UndefOr[VoiceProfileDomainName] = js.undefined
  
  /**
    * A structure that contains the configuration settings for server-side encryption.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ServerSideEncryptionConfiguration] = js.undefined
  
  /**
    * The time at which the voice profile was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The voice profile domain's Amazon Resource Number (ARN).
    */
  var VoiceProfileDomainArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the voice profile domain.
    */
  var VoiceProfileDomainId: js.UndefOr[NonEmptyString256] = js.undefined
}
object VoiceProfileDomain {
  
  inline def apply(): VoiceProfileDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceProfileDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceProfileDomain] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDescription(value: VoiceProfileDomainDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: VoiceProfileDomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceProfileDomainArn(value: Arn): Self = StObject.set(x, "VoiceProfileDomainArn", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainArnUndefined: Self = StObject.set(x, "VoiceProfileDomainArn", js.undefined)
    
    inline def setVoiceProfileDomainId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileDomainId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileDomainIdUndefined: Self = StObject.set(x, "VoiceProfileDomainId", js.undefined)
  }
}
