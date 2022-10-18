package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataIntegrationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * A description of the DataIntegration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The KMS key for the DataIntegration.
    */
  var KmsKey: js.UndefOr[NonBlankString] = js.undefined
  
  /**
    * The name of the DataIntegration.
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
  
  /**
    * The name of the data and how often it should be pulled from the source.
    */
  var ScheduleConfig: js.UndefOr[ScheduleConfiguration] = js.undefined
  
  /**
    * The URI of the data source.
    */
  var SourceURI: js.UndefOr[NonBlankString] = js.undefined
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDataIntegrationRequest {
  
  inline def apply(Name: Name): CreateDataIntegrationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataIntegrationRequest]
  }
  
  extension [Self <: CreateDataIntegrationRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKey(value: NonBlankString): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfig(value: ScheduleConfiguration): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfigUndefined: Self = StObject.set(x, "ScheduleConfig", js.undefined)
    
    inline def setSourceURI(value: NonBlankString): Self = StObject.set(x, "SourceURI", value.asInstanceOf[js.Any])
    
    inline def setSourceURIUndefined: Self = StObject.set(x, "SourceURI", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
