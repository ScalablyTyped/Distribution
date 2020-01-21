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
    headers: Headers = null,
    method: String | RequestMethod = null,
    params: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) = null,
    responseType: ResponseContentType = null,
    search: String | URLSearchParams | (StringDictionary[js.Any | js.Array[_]]) = null,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): RequestOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptionsArgs]
  }
}

