package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreApiKeyResponse extends StObject {
  
  /**
    * Restoration date of the API key.
    */
  var createdAt: String
}
object RestoreApiKeyResponse {
  
  inline def apply(createdAt: String): RestoreApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
  }
}
