package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApiCacheRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
}
object DeleteApiCacheRequest {
  
  inline def apply(apiId: String): DeleteApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiCacheRequest]
  }
  
  extension [Self <: DeleteApiCacheRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
