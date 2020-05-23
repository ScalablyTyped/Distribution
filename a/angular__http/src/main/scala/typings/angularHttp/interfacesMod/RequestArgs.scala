package typings.angularHttp.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularHttp.enumsMod.RequestMethod
import typings.angularHttp.enumsMod.ResponseContentType
import typings.angularHttp.headersMod.Headers
import typings.angularHttp.urlSearchParamsMod.URLSearchParams
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
    headers: js.UndefOr[Null | Headers] = js.undefined,
    method: js.UndefOr[Null | String | RequestMethod] = js.undefined,
    params: js.UndefOr[Null | String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])] = js.undefined,
    responseType: js.UndefOr[Null | ResponseContentType] = js.undefined,
    search: js.UndefOr[Null | String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])] = js.undefined,
    url: String = null,
    withCredentials: js.UndefOr[Null | Boolean] = js.undefined
  ): RequestArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(responseType)) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestArgs]
  }
}

