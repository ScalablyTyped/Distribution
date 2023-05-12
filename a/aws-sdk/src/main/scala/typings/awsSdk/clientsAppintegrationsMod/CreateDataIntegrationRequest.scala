package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataIntegrationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A description of the DataIntegration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The configuration for what files should be pulled from the source.
    */
  var FileConfiguration: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.FileConfiguration] = js.undefined
  
  /**
    * The KMS key for the DataIntegration.
    */
  var KmsKey: NonBlankString
  
  /**
    * The name of the DataIntegration.
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
  
  /**
    * The configuration for what data should be pulled from the source.
    */
  var ObjectConfiguration: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.ObjectConfiguration] = js.undefined
  
  /**
    * The name of the data and how often it should be pulled from the source.
    */
  var ScheduleConfig: ScheduleConfiguration
  
  /**
    * The URI of the data source.
    */
  var SourceURI: typings.awsSdk.clientsAppintegrationsMod.SourceURI
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDataIntegrationRequest {
  
  inline def apply(KmsKey: NonBlankString, Name: Name, ScheduleConfig: ScheduleConfiguration, SourceURI: SourceURI): CreateDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(KmsKey = KmsKey.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ScheduleConfig = ScheduleConfig.asInstanceOf[js.Any], SourceURI = SourceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDataIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFileConfiguration(value: FileConfiguration): Self = StObject.set(x, "FileConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFileConfigurationUndefined: Self = StObject.set(x, "FileConfiguration", js.undefined)
    
    inline def setKmsKey(value: NonBlankString): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setObjectConfiguration(value: ObjectConfiguration): Self = StObject.set(x, "ObjectConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObjectConfigurationUndefined: Self = StObject.set(x, "ObjectConfiguration", js.undefined)
    
    inline def setScheduleConfig(value: ScheduleConfiguration): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceURI(value: SourceURI): Self = StObject.set(x, "SourceURI", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
