package typings.angularHttp.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularHttp.enumsMod.RequestMethod
import typings.angularHttp.enumsMod.ResponseContentType
import typings.angularHttp.headersMod.Headers
import typings.angularHttp.urlSearchParamsMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptionsArgs extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[Headers | Null] = js.undefined
  var method: js.UndefOr[String | RequestMethod | Null] = js.undefined
  var params: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.undefined
  var responseType: js.UndefOr[ResponseContentType | Null] = js.undefined
  /** @deprecated from 4.0.0. Use params instead. */
  var search: js.UndefOr[String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) | Null] = js.undefined
  var url: js.UndefOr[String | Null] = js.undefined
  var withCredentials: js.UndefOr[Boolean | Null] = js.undefined
}

object RequestOptionsArgs {
  @scala.inline
  def apply(
    body: js.Any = null,
    headers: js.UndefOr[Null | Headers] = js.undefined,
    method: js.UndefOr[Null | String | RequestMethod] = js.undefined,
    params: js.UndefOr[Null | String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])] = js.undefined,
    responseType: js.UndefOr[Null | ResponseContentType] = js.undefined,
    search: js.UndefOr[Null | String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]])] = js.undefined,
    url: js.UndefOr[Null | String] = js.undefined,
    withCredentials: js.UndefOr[Null | Boolean] = js.undefined
  ): RequestOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(responseType)) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptionsArgs]
  }
}

