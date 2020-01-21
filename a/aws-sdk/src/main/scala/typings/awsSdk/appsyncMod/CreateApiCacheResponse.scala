package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiCacheResponse extends js.Object {
  /**
    * The ApiCache object.
    */
  var apiCache: js.UndefOr[ApiCache] = js.native
}

object CreateApiCacheResponse {
  @scala.inline
  def apply(apiCache: ApiCache = null): CreateApiCacheResponse = {
    val __obj = js.Dynamic.literal()
    if (apiCache != null) __obj.updateDynamic("apiCache")(apiCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiCacheResponse]
  }
}

