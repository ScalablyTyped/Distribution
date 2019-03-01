package typings
package atAngularHttpLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptionsArgs extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[atAngularHttpLib.srcHeadersMod.Headers | scala.Null] = js.undefined
  var method: js.UndefOr[java.lang.String | atAngularHttpLib.srcEnumsMod.RequestMethod | scala.Null] = js.undefined
  var params: js.UndefOr[
    java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) | scala.Null
  ] = js.undefined
  var responseType: js.UndefOr[atAngularHttpLib.srcEnumsMod.ResponseContentType | scala.Null] = js.undefined
  /** @deprecated from 4.0.0. Use params instead. */
  var search: js.UndefOr[
    java.lang.String | atAngularHttpLib.srcUrlUnderscoreSearchUnderscoreParamsMod.URLSearchParams | (org.scalablytyped.runtime.StringDictionary[js.Any | js.Array[_]]) | scala.Null
  ] = js.undefined
  var url: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object RequestOptionsArgs {
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
  ): RequestOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[RequestOptionsArgs]
  }
}

