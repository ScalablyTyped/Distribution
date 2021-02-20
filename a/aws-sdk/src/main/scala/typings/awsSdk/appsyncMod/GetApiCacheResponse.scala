package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiCacheResponse extends StObject {
  
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.native
}
object GetApiCacheResponse {
  
  @scala.inline
  def apply(): GetApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiCacheResponse]
  }
  
  @scala.inline
  implicit class GetApiCacheResponseMutableBuilder[Self <: GetApiCacheResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiCache(value: ApiCache): Self = StObject.set(x, "apiCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiCacheUndefined: Self = StObject.set(x, "apiCache", js.undefined)
  }
}
