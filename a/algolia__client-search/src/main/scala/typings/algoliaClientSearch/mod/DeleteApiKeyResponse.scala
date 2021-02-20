package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiKeyResponse extends StObject {
  
  /**
    * The date when the api key was deleted.
    */
  var deletedAt: String = js.native
}
object DeleteApiKeyResponse {
  
  @scala.inline
  def apply(deletedAt: String): DeleteApiKeyResponse = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyResponse]
  }
  
  @scala.inline
  implicit class DeleteApiKeyResponseMutableBuilder[Self <: DeleteApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletedAt(value: String): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
  }
}
