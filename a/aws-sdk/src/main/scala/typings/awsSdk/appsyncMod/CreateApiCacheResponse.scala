package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.undefined
}
object CreateApiCacheResponse {
  
  inline def apply(): CreateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiCacheResponse]
  }
  
  extension [Self <: CreateApiCacheResponse](x: Self) {
    
    inline def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    inline def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
