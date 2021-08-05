package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.undefined
}
object UpdateApiCacheResponse {
  
  inline def apply(): UpdateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiCacheResponse]
  }
  
  extension [Self <: UpdateApiCacheResponse](x: Self) {
    
    inline def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    inline def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
