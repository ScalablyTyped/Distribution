package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var credentials: js.UndefOr[java.lang.String] = js.undefined
  var fetch: js.UndefOr[
    (js.Function1[/* input */ stdLib.RequestInfo, js.Promise[stdLib.Response]]) | (js.Function2[
      /* input */ stdLib.RequestInfo, 
      /* init */ stdLib.RequestInit, 
      js.Promise[stdLib.Response]
    ])
  ] = js.undefined
  var fetchOptions: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var includeExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String | UriFunction] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(
    credentials: java.lang.String = null,
    fetch: (js.Function1[/* input */ stdLib.RequestInfo, js.Promise[stdLib.Response]]) | (js.Function2[
      /* input */ stdLib.RequestInfo, 
      /* init */ stdLib.RequestInit, 
      js.Promise[stdLib.Response]
    ]) = null,
    fetchOptions: js.Any = null,
    headers: js.Any = null,
    includeExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String | UriFunction = null
  ): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(includeExtensions)) __obj.updateDynamic("includeExtensions")(includeExtensions)
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
}

