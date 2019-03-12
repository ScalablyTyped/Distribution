package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DispatcherOptions extends js.Object {
  var authenticator: js.UndefOr[asanaLib.asanaMod.asanaNs.authNs.Authenticator] = js.undefined
  var handleUnauthorized: js.UndefOr[js.Function0[scala.Boolean | bluebirdLib.bluebirdMod.namespaced[scala.Boolean]]] = js.undefined
  var requestTimeout: js.UndefOr[java.lang.String] = js.undefined
  var retryOnRateLimit: js.UndefOr[scala.Boolean] = js.undefined
}

object DispatcherOptions {
  @scala.inline
  def apply(
    authenticator: asanaLib.asanaMod.asanaNs.authNs.Authenticator = null,
    handleUnauthorized: () => scala.Boolean | bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = null,
    requestTimeout: java.lang.String = null,
    retryOnRateLimit: js.UndefOr[scala.Boolean] = js.undefined
  ): DispatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator)
    if (handleUnauthorized != null) __obj.updateDynamic("handleUnauthorized")(js.Any.fromFunction0(handleUnauthorized))
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout)
    if (!js.isUndefined(retryOnRateLimit)) __obj.updateDynamic("retryOnRateLimit")(retryOnRateLimit)
    __obj.asInstanceOf[DispatcherOptions]
  }
}

