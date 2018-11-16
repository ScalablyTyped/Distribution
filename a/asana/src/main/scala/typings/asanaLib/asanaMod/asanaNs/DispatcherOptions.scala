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

