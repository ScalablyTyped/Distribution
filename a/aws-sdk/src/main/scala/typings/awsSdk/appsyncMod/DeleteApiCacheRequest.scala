package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApiCacheRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
}
object DeleteApiCacheRequest {
  
  @scala.inline
  def apply(apiId: String): DeleteApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiCacheRequest]
  }
  
  @scala.inline
  implicit class DeleteApiCacheRequestMutableBuilder[Self <: DeleteApiCacheRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
