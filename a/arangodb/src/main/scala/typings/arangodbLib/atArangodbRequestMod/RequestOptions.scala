package typings
package arangodbLib.atArangodbRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var auth: js.UndefOr[arangodbLib.Anon_Password | arangodbLib.Anon_Bearer] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var followRedirect: js.UndefOr[scala.Boolean] = js.undefined
  var form: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var returnBodyOnError: js.UndefOr[scala.Boolean] = js.undefined
  var sslProtocol: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var useQuerystring: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    auth: arangodbLib.Anon_Password | arangodbLib.Anon_Bearer = null,
    body: js.Any = null,
    encoding: java.lang.String = null,
    followRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    form: js.Any = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    maxRedirects: scala.Int | scala.Double = null,
    qs: js.Object = null,
    returnBodyOnError: js.UndefOr[scala.Boolean] = js.undefined,
    sslProtocol: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    useQuerystring: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect)
    if (form != null) __obj.updateDynamic("form")(form)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (!js.isUndefined(returnBodyOnError)) __obj.updateDynamic("returnBodyOnError")(returnBodyOnError)
    if (sslProtocol != null) __obj.updateDynamic("sslProtocol")(sslProtocol.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    __obj.asInstanceOf[RequestOptions]
  }
}

