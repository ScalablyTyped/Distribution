package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiKeyRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The ID for the API key.
    */
  var id: String
}
object DeleteApiKeyRequest {
  
  @scala.inline
  def apply(apiId: String, id: String): DeleteApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyRequest]
  }
  
  @scala.inline
  implicit class DeleteApiKeyRequestMutableBuilder[Self <: DeleteApiKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
