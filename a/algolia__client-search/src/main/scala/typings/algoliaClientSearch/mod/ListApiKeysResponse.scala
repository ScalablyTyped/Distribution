package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiKeysResponse extends StObject {
  
  /**
    * List of keys
    */
  var keys: js.Array[GetApiKeyResponse]
}
object ListApiKeysResponse {
  
  inline def apply(keys: js.Array[GetApiKeyResponse]): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  extension [Self <: ListApiKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[GetApiKeyResponse]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: GetApiKeyResponse*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
