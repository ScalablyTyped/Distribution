package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.undefined
}
object GetApiCacheResponse {
  
  inline def apply(): GetApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiCacheResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetApiCacheResponse] (val x: Self) extends AnyVal {
    
    inline def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    inline def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
