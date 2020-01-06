package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiCacheRequest extends js.Object {
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
}

