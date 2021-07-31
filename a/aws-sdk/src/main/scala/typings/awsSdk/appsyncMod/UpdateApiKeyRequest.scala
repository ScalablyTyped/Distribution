package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiKeyRequest extends StObject {
  
  /**
    * The ID for the GraphQL API.
    */
  var apiId: String
  
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The time from update time after which the API key expires. The date is represented as seconds since the epoch. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.undefined
  
  /**
    * The API key ID.
    */
  var id: String
}
object UpdateApiKeyRequest {
  
  @scala.inline
  def apply(apiId: String, id: String): UpdateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyRequest]
  }
  
  @scala.inline
  implicit class UpdateApiKeyRequestMutableBuilder[Self <: UpdateApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExpires(value: Long): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
