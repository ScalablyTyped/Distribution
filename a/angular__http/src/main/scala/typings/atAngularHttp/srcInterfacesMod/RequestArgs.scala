package typings.atAngularHttp.srcInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularHttp.srcEnumsMod.RequestMethod
import typings.atAngularHttp.srcEnumsMod.ResponseContentType
import typings.atAngularHttp.srcHeadersMod.Headers
import typings.atAngularHttp.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestArgs extends RequestOptionsArgs {
  @JSName("url")
  var url_RequestArgs: String | Null
}

object RequestArgs {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: Headers = null,
    method: String | RequestMethod = null,
    params: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) = null,
    responseType: ResponseContentType = null,
    search: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
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

