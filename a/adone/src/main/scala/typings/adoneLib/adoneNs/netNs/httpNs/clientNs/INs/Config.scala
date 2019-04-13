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
  var formData: org.scalablytyped.runtime.StringDictionary[FormValue | js.Array[FormValue]]
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
    adapter: Config => js.Promise[Response[js.Any]],
    auth: adoneLib.Anon_Password,
    baseURL: java.lang.String,
    cancelToken: adoneLib.adoneNs.netNs.httpNs.clientNs.CancelToken,
    data: Data,
    formData: org.scalablytyped.runtime.StringDictionary[FormValue | js.Array[FormValue]],
    headers: RequestHeaders,
    httpAgent: js.Object,
    httpsAgent: js.Object,
    maxContentLength: scala.Double,
    maxRedirects: scala.Double,
    method: adoneLib.adoneLibStrings.GET | adoneLib.adoneLibStrings.POST | adoneLib.adoneLibStrings.PUT | adoneLib.adoneLibStrings.PATCH | adoneLib.adoneLibStrings.DELETE | adoneLib.adoneLibStrings.OPTIONS,
    onUploadProgress: UploadProgressEvent => scala.Unit,
    params: js.Object,
    paramsSerializer: js.Object => java.lang.String,
    proxy: java.lang.String | ProxyObject | adoneLib.adoneLibNumbers.`false`,
    rejectUnauthorized: scala.Boolean,
    responseEncoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding,
    responseType: adoneLib.adoneLibStrings.buffer | adoneLib.adoneLibStrings.string | adoneLib.adoneLibStrings.stream | adoneLib.adoneLibStrings.json,
    timeout: scala.Double,
    transformRequest: js.Array[Transformer],
    transformResponse: js.Array[Transformer],
    transport: js.Object,
    validateStatus: scala.Double => scala.Boolean,
    xsrfCookieName: java.lang.String,
    xsrfHeaderName: java.lang.String
  ): Config = {
    val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), auth = auth, baseURL = baseURL, cancelToken = cancelToken, data = data.asInstanceOf[js.Any], formData = formData, headers = headers, httpAgent = httpAgent, httpsAgent = httpsAgent, maxContentLength = maxContentLength, maxRedirects = maxRedirects, method = method.asInstanceOf[js.Any], onUploadProgress = js.Any.fromFunction1(onUploadProgress), params = params, paramsSerializer = js.Any.fromFunction1(paramsSerializer), proxy = proxy.asInstanceOf[js.Any], rejectUnauthorized = rejectUnauthorized, responseEncoding = responseEncoding, responseType = responseType.asInstanceOf[js.Any], timeout = timeout, transformRequest = transformRequest, transformResponse = transformResponse, transport = transport, validateStatus = js.Any.fromFunction1(validateStatus), xsrfCookieName = xsrfCookieName, xsrfHeaderName = xsrfHeaderName)
  
    __obj.asInstanceOf[Config]
  }
}

