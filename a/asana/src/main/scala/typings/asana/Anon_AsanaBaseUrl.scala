package typings.asana

import typings.asana.asanaMod.resources.VersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsanaBaseUrl extends js.Object {
  var _cachedVersionInfo: VersionInfo
  var asanaBaseUrl: String
  var authenticator: Anon_ApiKey
  var requestTimeout: Double
  var retryOnRateLimit: Boolean
}

object Anon_AsanaBaseUrl {
  @scala.inline
  def apply(
    _cachedVersionInfo: VersionInfo,
    asanaBaseUrl: String,
    authenticator: Anon_ApiKey,
    requestTimeout: Double,
    retryOnRateLimit: Boolean
  ): Anon_AsanaBaseUrl = {
    val __obj = js.Dynamic.literal(_cachedVersionInfo = _cachedVersionInfo.asInstanceOf[js.Any], asanaBaseUrl = asanaBaseUrl.asInstanceOf[js.Any], authenticator = authenticator.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], retryOnRateLimit = retryOnRateLimit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AsanaBaseUrl]
  }
}

