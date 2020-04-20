package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlushApiCacheRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
}

object FlushApiCacheRequest {
  @scala.inline
  def apply(apiId: String): FlushApiCacheRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushApiCacheRequest]
  }
}

