package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApiKeysResponse extends StObject {
  
  /**
    * List of keys
    */
  var keys: js.Array[GetApiKeyResponse] = js.native
}
object ListApiKeysResponse {
  
  @scala.inline
  def apply(keys: js.Array[GetApiKeyResponse]): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  @scala.inline
  implicit class ListApiKeysResponseMutableBuilder[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[GetApiKeyResponse]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: GetApiKeyResponse*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
