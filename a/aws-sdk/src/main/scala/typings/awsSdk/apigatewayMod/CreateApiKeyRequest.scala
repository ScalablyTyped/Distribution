package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyRequest extends StObject {
  
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the ApiKey.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the ApiKey can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
    */
  var generateDistinctId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the ApiKey.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
    */
  var stageKeys: js.UndefOr[ListOfStageKeys] = js.undefined
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * Specifies a value of the API key.
    */
  var value: js.UndefOr[String] = js.undefined
}
object CreateApiKeyRequest {
  
  inline def apply(): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  extension [Self <: CreateApiKeyRequest](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGenerateDistinctId(value: Boolean): Self = StObject.set(x, "generateDistinctId", value.asInstanceOf[js.Any])
    
    inline def setGenerateDistinctIdUndefined: Self = StObject.set(x, "generateDistinctId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStageKeys(value: ListOfStageKeys): Self = StObject.set(x, "stageKeys", value.asInstanceOf[js.Any])
    
    inline def setStageKeysUndefined: Self = StObject.set(x, "stageKeys", js.undefined)
    
    inline def setStageKeysVarargs(value: StageKey*): Self = StObject.set(x, "stageKeys", js.Array(value*))
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
