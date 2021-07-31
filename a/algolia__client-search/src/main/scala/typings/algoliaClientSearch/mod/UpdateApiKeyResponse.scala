package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiKeyResponse extends StObject {
  
  /**
    * The api key.
    */
  var key: String
  
  /**
    * Date of update
    */
  var updatedAt: String
}
object UpdateApiKeyResponse {
  
  @scala.inline
  def apply(key: String, updatedAt: String): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
  
  @scala.inline
  implicit class UpdateApiKeyResponseMutableBuilder[Self <: UpdateApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
