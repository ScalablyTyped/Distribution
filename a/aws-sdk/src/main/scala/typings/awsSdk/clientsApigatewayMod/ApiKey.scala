package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKey extends StObject {
  
  /**
    * The timestamp when the API Key was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the API Key.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the API Key can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the API Key.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the API Key was last updated.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the API Key.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Stage resources that are associated with the ApiKey resource.
    */
  var stageKeys: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
  
  /**
    * The value of the API Key.
    */
  var value: js.UndefOr[String] = js.undefined
}
object ApiKey {
  
  inline def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  
  extension [Self <: ApiKey](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStageKeys(value: ListOfString): Self = StObject.set(x, "stageKeys", value.asInstanceOf[js.Any])
    
    inline def setStageKeysUndefined: Self = StObject.set(x, "stageKeys", js.undefined)
    
    inline def setStageKeysVarargs(value: String*): Self = StObject.set(x, "stageKeys", js.Array(value*))
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
