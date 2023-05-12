package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier the service generates to ensure the idempotency of the request to create an application. The service generates the clientToken when the API call is triggered. The token expires after one hour, so if you retry the API within this timeframe with the same clientToken, you will get the same response. The service also handles deleting the clientToken after it expires. 
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The application definition for this application. You can specify either inline JSON or an S3 bucket location.
    */
  var definition: Definition
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The type of the target platform for this application.
    */
  var engineType: EngineType
  
  /**
    * The identifier of a customer managed key.
    */
  var kmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the application.
    */
  var name: EntityName
  
  /**
    * A list of tags to apply to the application.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateApplicationRequest {
  
  inline def apply(definition: Definition, engineType: EngineType, name: EntityName): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
