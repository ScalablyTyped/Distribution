package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.native
}
object UpdateApiCacheResponse {
  
  @scala.inline
  def apply(): UpdateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApiCacheResponse]
  }
  
  @scala.inline
  implicit class UpdateApiCacheResponseMutableBuilder[Self <: UpdateApiCacheResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
