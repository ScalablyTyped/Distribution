package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var auth: adoneLib.Anon_Password
  var baseURL: java.lang.String
  var cancelToken: adoneLib.adoneNs.netNs.httpNs.clientNs.CancelToken
  var data: Data
  var formData: /* import warning: ImportType.apply Failed type conversion: {[formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>} */ js.Any
  var headers: RequestHeaders
  var httpAgent: js.Object
  var httpsAgent: js.Object
  var maxContentLength: scala.Double
  var maxRedirects: scala.Double
  var method: adoneLib.adoneLibStrings.GET | adoneLib.adoneLibStrings.POST | adoneLib.adoneLibStrings.PUT | adoneLib.adoneLibStrings.PATCH | adoneLib.adoneLibStrings.DELETE | adoneLib.adoneLibStrings.OPTIONS
  var params: js.Object
  var proxy: java.lang.String | ProxyObject | adoneLib.adoneLibNumbers.`false`
  var rejectUnauthorized: scala.Boolean
  var responseEncoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding
  var responseType: adoneLib.adoneLibStrings.buffer | adoneLib.adoneLibStrings.string | adoneLib.adoneLibStrings.stream | adoneLib.adoneLibStrings.json
  var timeout: scala.Double
  var transformRequest: js.Array[Transformer]
  var transformResponse: js.Array[Transformer]
  var transport: js.Object
  var xsrfCookieName: java.lang.String
  var xsrfHeaderName: java.lang.String
  def adapter[T](config: Config): js.Promise[Response[T]]
  def onUploadProgress(event: UploadProgressEvent): scala.Unit
  def paramsSerializer(params: js.Object): java.lang.String
  def validateStatus(status: scala.Double): scala.Boolean
}

object Config {
  @scala.inline
  def apply(
    adapter: js.Function1[Config, js.Promise[Response[js.Any]]],
    auth: adoneLib.Anon_Password,
    baseURL: java.lang.String,
    cancelToken: adoneLib.adoneNs.netNs.httpNs.clientNs.CancelToken,
    data: Data,
    formData: /* import warning: ImportType.apply Failed type conversion: {[formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>, [formKey: string] : adone.adone.net.http.client.I.FormValue | std.Array<adone.adone.net.http.client.I.FormValue>} */ js.Any,
    headers: RequestHeaders,
    httpAgent: js.Object,
    httpsAgent: js.Object,
    maxContentLength: scala.Double,
    maxRedirects: scala.Double,
    method: adoneLib.adoneLibStrings.GET | adoneLib.adoneLibStrings.POST | adoneLib.adoneLibStrings.PUT | adoneLib.adoneLibStrings.PATCH | adoneLib.adoneLibStrings.DELETE | adoneLib.adoneLibStrings.OPTIONS,
    onUploadProgress: js.Function1[UploadProgressEvent, scala.Unit],
    params: js.Object,
    paramsSerializer: js.Function1[js.Object, java.lang.String],
    proxy: java.lang.String | ProxyObject | adoneLib.adoneLibNumbers.`false`,
    rejectUnauthorized: scala.Boolean,
    responseEncoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding,
    responseType: adoneLib.adoneLibStrings.buffer | adoneLib.adoneLibStrings.string | adoneLib.adoneLibStrings.stream | adoneLib.adoneLibStrings.json,
    timeout: scala.Double,
    transformRequest: js.Array[Transformer],
    transformResponse: js.Array[Transformer],
    transport: js.Object,
    validateStatus: js.Function1[scala.Double, scala.Boolean],
    xsrfCookieName: java.lang.String,
    xsrfHeaderName: java.lang.String
  ): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adapter")(adapter)
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("baseURL")(baseURL)
    __obj.updateDynamic("cancelToken")(cancelToken)
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("formData")(formData)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("httpAgent")(httpAgent)
    __obj.updateDynamic("httpsAgent")(httpsAgent)
    __obj.updateDynamic("maxContentLength")(maxContentLength)
    __obj.updateDynamic("maxRedirects")(maxRedirects)
    __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.updateDynamic("onUploadProgress")(onUploadProgress)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("paramsSerializer")(paramsSerializer)
    __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.updateDynamic("responseEncoding")(responseEncoding)
    __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("transformRequest")(transformRequest)
    __obj.updateDynamic("transformResponse")(transformResponse)
    __obj.updateDynamic("transport")(transport)
    __obj.updateDynamic("validateStatus")(validateStatus)
    __obj.updateDynamic("xsrfCookieName")(xsrfCookieName)
    __obj.updateDynamic("xsrfHeaderName")(xsrfHeaderName)
    __obj.asInstanceOf[Config]
  }
}

