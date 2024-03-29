package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiKeyResponse extends StObject {
  
  /**
    * The date when the api key was deleted.
    */
  var deletedAt: String
}
object DeleteApiKeyResponse {
  
  inline def apply(deletedAt: String): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteApiKeyResponse] (val x: Self) extends AnyVal {
    
    inline def setDeletedAt(value: String): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
  }
}
