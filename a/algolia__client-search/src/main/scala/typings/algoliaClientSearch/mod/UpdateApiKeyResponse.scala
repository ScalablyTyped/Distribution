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
  
  inline def apply(key: String, updatedAt: String): UpdateApiKeyResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
