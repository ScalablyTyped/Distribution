package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiCacheResponse extends js.Object {
  var apiCache: js.UndefOr[ApiCache] = js.native
}

object GetApiCacheResponse {
  @scala.inline
  def apply(apiCache: ApiCache = null): GetApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    if (apiCache != null) __obj.updateDynamic("apiCache")(apiCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiCacheResponse]
  }
}

