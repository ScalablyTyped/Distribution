package typings.asana.asanaMod

import org.scalablytyped.runtime.StringDictionary
import typings.asana.asanaMod.authNs.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options to configure the client */
trait ClientOptions extends DispatcherOptions {
  var asanaBaseUrl: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String | Double] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var defaultHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    asanaBaseUrl: String = null,
    authenticator: Authenticator = null,
    clientId: String | Double = null,
    clientSecret: String = null,
    defaultHeaders: StringDictionary[String] = null,
    handleUnauthorized: () => Boolean | typings.bluebird.bluebirdMod.^[Boolean] = null,
    redirectUri: String = null,
    requestTimeout: String = null,
    retryOnRateLimit: js.UndefOr[Boolean] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (defaultHeaders != null) __obj.updateDynamic("defaultHeaders")(defaultHeaders)
    if (handleUnauthorized != null) __obj.updateDynamic("handleUnauthorized")(js.Any.fromFunction0(handleUnauthorized))
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout)
    if (!js.isUndefined(retryOnRateLimit)) __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit)
    __obj.asInstanceOf[ClientOptions]
  }
}

