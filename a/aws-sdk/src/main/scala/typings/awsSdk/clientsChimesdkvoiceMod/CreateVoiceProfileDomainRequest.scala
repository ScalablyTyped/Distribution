package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVoiceProfileDomainRequest extends StObject {
  
  /**
    * The unique identifier for the client request. Use a different token for different domain creation requests.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestId] = js.undefined
  
  /**
    * A description of the voice profile domain.
    */
  var Description: js.UndefOr[VoiceProfileDomainDescription] = js.undefined
  
  /**
    * The name of the voice profile domain.
    */
  var Name: VoiceProfileDomainName
  
  /**
    * The server-side encryption configuration for the request.
    */
  var ServerSideEncryptionConfiguration: typings.awsSdk.clientsChimesdkvoiceMod.ServerSideEncryptionConfiguration
  
  /**
    * The tags assigned to the domain.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateVoiceProfileDomainRequest {
  
  inline def apply(Name: VoiceProfileDomainName, ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration): CreateVoiceProfileDomainRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVoiceProfileDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVoiceProfileDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestId): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDescription(value: VoiceProfileDomainDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: VoiceProfileDomainName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionConfiguration(value: ServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
