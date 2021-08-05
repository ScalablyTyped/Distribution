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
  
  extension [Self <: DeleteApiKeyResponse](x: Self) {
    
    inline def setDeletedAt(value: String): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
  }
}
