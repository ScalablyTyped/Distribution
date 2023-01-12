package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddApiKeyResponse extends StObject {
  
  /**
    * Date of creation of the api key.
    */
  var createdAt: String
  
  /**
    * The returned api key.
    */
  var key: String
}
object AddApiKeyResponse {
  
  inline def apply(createdAt: String, key: String): AddApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
