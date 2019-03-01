package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenManagerOptions extends BaseClientOptions {
  var headers: js.UndefOr[js.Any] = js.undefined
}

object TokenManagerOptions {
  @scala.inline
  def apply(baseUrl: java.lang.String, clientId: java.lang.String = null, headers: js.Any = null): TokenManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseUrl")(baseUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[TokenManagerOptions]
  }
}

