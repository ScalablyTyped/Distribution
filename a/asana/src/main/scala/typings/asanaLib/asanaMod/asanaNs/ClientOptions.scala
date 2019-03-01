package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to configure the client */
trait ClientOptions extends DispatcherOptions {
  var asanaBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    asanaBaseUrl: java.lang.String = null,
    authenticator: asanaLib.asanaMod.asanaNs.authNs.Authenticator = null,
    clientId: java.lang.String | scala.Double = null,
    clientSecret: java.lang.String = null,
    handleUnauthorized: js.Function0[scala.Boolean | bluebirdLib.bluebirdMod.namespaced[scala.Boolean]] = null,
    redirectUri: java.lang.String = null,
    requestTimeout: java.lang.String = null,
    retryOnRateLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (handleUnauthorized != null) __obj.updateDynamic("handleUnauthorized")(handleUnauthorized)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout)
    if (!js.isUndefined(retryOnRateLimit)) __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit)
    __obj.asInstanceOf[ClientOptions]
  }
}

