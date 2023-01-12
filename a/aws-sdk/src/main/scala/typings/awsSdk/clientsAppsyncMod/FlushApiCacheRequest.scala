package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushApiCacheRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
}
object FlushApiCacheRequest {
  
  inline def apply(apiId: String): FlushApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushApiCacheRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlushApiCacheRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
