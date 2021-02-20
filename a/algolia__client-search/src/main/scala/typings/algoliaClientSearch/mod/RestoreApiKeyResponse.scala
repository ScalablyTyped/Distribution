package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreApiKeyResponse extends StObject {
  
  /**
    * Restoration date of the API key.
    */
  var createdAt: String = js.native
}
object RestoreApiKeyResponse {
  
  @scala.inline
  def apply(createdAt: String): RestoreApiKeyResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreApiKeyResponse]
  }
  
  @scala.inline
  implicit class RestoreApiKeyResponseMutableBuilder[Self <: RestoreApiKeyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
  }
}
