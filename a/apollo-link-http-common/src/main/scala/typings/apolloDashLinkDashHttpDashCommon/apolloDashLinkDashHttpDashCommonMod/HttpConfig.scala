package typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConfig extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var http: js.UndefOr[HttpQueryOptions] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
}

object HttpConfig {
  @scala.inline
  def apply(
    credentials: js.Any = null,
    headers: js.Any = null,
    http: HttpQueryOptions = null,
    options: js.Any = null
  ): HttpConfig = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpConfig]
  }
}

