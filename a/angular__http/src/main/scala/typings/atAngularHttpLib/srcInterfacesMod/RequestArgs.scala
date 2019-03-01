package typings
package atAngularHttpLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestArgs extends RequestOptionsArgs {
  @JSName("url")
  var url_RequestArgs: java.lang.String | scala.Null
}

object RequestArgs {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: atAngularHttpLib.srcHeadersMod.Headers = null,
    method: java.lang.String | atAngularHttpLib.srcEnumsMod.RequestMethod = null,
    params: java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) = null,
    responseType: atAngularHttpLib.srcEnumsMod.ResponseContentType = null,
    search: java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) = null,
    url: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestArgs = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[RequestArgs]
  }
}

