package typings.asana.anon

import typings.asana.mod.resources.VersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsanaBaseUrl extends js.Object {
  var _cachedVersionInfo: VersionInfo
  var asanaBaseUrl: String
  var authenticator: ApiKey
  var requestTimeout: Double
  var retryOnRateLimit: Boolean
}

object AsanaBaseUrl {
  @scala.inline
  def apply(
    _cachedVersionInfo: VersionInfo,
    asanaBaseUrl: String,
    authenticator: ApiKey,
    requestTimeout: Double,
    retryOnRateLimit: Boolean
  ): AsanaBaseUrl = {
    val __obj = js.Dynamic.literal(_cachedVersionInfo = _cachedVersionInfo.asInstanceOf[js.Any], asanaBaseUrl = asanaBaseUrl.asInstanceOf[js.Any], authenticator = authenticator.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], retryOnRateLimit = retryOnRateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsanaBaseUrl]
  }
}

