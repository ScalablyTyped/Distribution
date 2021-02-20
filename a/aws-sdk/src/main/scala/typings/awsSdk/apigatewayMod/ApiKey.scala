package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiKey extends StObject {
  
  /**
    * The timestamp when the API Key was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * The description of the API Key.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the API Key can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The identifier of the API Key.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the API Key was last updated.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the API Key.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of Stage resources that are associated with the ApiKey resource.
    */
  var stageKeys: js.UndefOr[ListOfString] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The value of the API Key.
    */
  var value: js.UndefOr[String] = js.native
}
object ApiKey {
  
  @scala.inline
  def apply(): ApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKey]
  }
  
  @scala.inline
  implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStageKeys(value: ListOfString): Self = StObject.set(x, "stageKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageKeysUndefined: Self = StObject.set(x, "stageKeys", js.undefined)
    
    @scala.inline
    def setStageKeysVarargs(value: String*): Self = StObject.set(x, "stageKeys", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
