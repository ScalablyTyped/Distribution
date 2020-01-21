package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiCacheRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
}

object GetApiCacheRequest {
  @scala.inline
  def apply(apiId: String): GetApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApiCacheRequest]
  }
}

