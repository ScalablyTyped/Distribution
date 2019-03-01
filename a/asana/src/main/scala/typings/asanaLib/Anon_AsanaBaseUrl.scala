package typings
package asanaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsanaBaseUrl extends js.Object {
  var _cachedVersionInfo: asanaLib.asanaMod.asanaNs.resourcesNs.VersionInfo
  var asanaBaseUrl: java.lang.String
  var authenticator: Anon_ApiKey
  var requestTimeout: scala.Double
  var retryOnRateLimit: scala.Boolean
}

object Anon_AsanaBaseUrl {
  @scala.inline
  def apply(
    _cachedVersionInfo: asanaLib.asanaMod.asanaNs.resourcesNs.VersionInfo,
    asanaBaseUrl: java.lang.String,
    authenticator: Anon_ApiKey,
    requestTimeout: scala.Double,
    retryOnRateLimit: scala.Boolean
  ): Anon_AsanaBaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_cachedVersionInfo")(_cachedVersionInfo)
    __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    __obj.updateDynamic("authenticator")(authenticator)
    __obj.updateDynamic("requestTimeout")(requestTimeout)
    __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit)
    __obj.asInstanceOf[Anon_AsanaBaseUrl]
  }
}

