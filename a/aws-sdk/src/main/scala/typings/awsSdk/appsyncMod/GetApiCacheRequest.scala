package typings.awsSdk.appsyncMod

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
  
  @scala.inline
  def apply(apiId: String): GetApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiCacheRequest]
  }
  
  @scala.inline
  implicit class GetApiCacheRequestMutableBuilder[Self <: GetApiCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
