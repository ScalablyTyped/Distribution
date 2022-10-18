package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiCacheRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
}
object GetApiCacheRequest {
  
  inline def apply(apiId: String): GetApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiCacheRequest]
  }
  
  extension [Self <: GetApiCacheRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
