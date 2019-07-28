package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import org.scalablytyped.runtime.StringDictionary
import typings.adone.Anon_Password
import typings.adone.adoneNs.netNs.httpNs.clientNs.CancelToken
import typings.adone.adoneNs.utilNs.iconvNs.INs.SupportedEncoding
import typings.adone.adoneNumbers.`false`
import typings.adone.adoneStrings.DELETE
import typings.adone.adoneStrings.GET
import typings.adone.adoneStrings.OPTIONS
import typings.adone.adoneStrings.PATCH
import typings.adone.adoneStrings.POST
import typings.adone.adoneStrings.PUT
import typings.adone.adoneStrings.buffer
import typings.adone.adoneStrings.json
import typings.adone.adoneStrings.stream
import typings.adone.adoneStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var auth: Anon_Password
  var baseURL: String
  var cancelToken: CancelToken
  var data: Data
  var formData: StringDictionary[FormValue | js.Array[FormValue]]
  var headers: RequestHeaders
  var httpAgent: js.Object
  var httpsAgent: js.Object
  var maxContentLength: Double
  var maxRedirects: Double
  var method: GET | POST | PUT | PATCH | DELETE | OPTIONS
  var params: js.Object
  var proxy: String | ProxyObject | `false`
  var rejectUnauthorized: Boolean
  var responseEncoding: SupportedEncoding
  var responseType: buffer | string | stream | json
  var timeout: Double
  var transformRequest: js.Array[Transformer]
  var transformResponse: js.Array[Transformer]
  var transport: js.Object
  var xsrfCookieName: String
  var xsrfHeaderName: String
  def adapter[T](config: Config): js.Promise[Response[T]]
  def onUploadProgress(event: UploadProgressEvent): Unit
  def paramsSerializer(params: js.Object): String
  def validateStatus(status: Double): Boolean
}

object Config {
  @scala.inline
  def apply(
    adapter: Config => js.Promise[Response[js.Any]],
    auth: Anon_Password,
    baseURL: String,
    cancelToken: CancelToken,
    data: Data,
    formData: StringDictionary[FormValue | js.Array[FormValue]],
    headers: RequestHeaders,
    httpAgent: js.Object,
    httpsAgent: js.Object,
    maxContentLength: Double,
    maxRedirects: Double,
    method: GET | POST | PUT | PATCH | DELETE | OPTIONS,
    onUploadProgress: UploadProgressEvent => Unit,
    params: js.Object,
    paramsSerializer: js.Object => String,
    proxy: String | ProxyObject | `false`,
    rejectUnauthorized: Boolean,
    responseEncoding: SupportedEncoding,
    responseType: buffer | string | stream | json,
    timeout: Double,
    transformRequest: js.Array[Transformer],
    transformResponse: js.Array[Transformer],
    transport: js.Object,
    validateStatus: Double => Boolean,
    xsrfCookieName: String,
    xsrfHeaderName: String
  ): Config = {
    val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), auth = auth, baseURL = baseURL, cancelToken = cancelToken, data = data.asInstanceOf[js.Any], formData = formData, headers = headers, httpAgent = httpAgent, httpsAgent = httpsAgent, maxContentLength = maxContentLength, maxRedirects = maxRedirects, method = method.asInstanceOf[js.Any], onUploadProgress = js.Any.fromFunction1(onUploadProgress), params = params, paramsSerializer = js.Any.fromFunction1(paramsSerializer), proxy = proxy.asInstanceOf[js.Any], rejectUnauthorized = rejectUnauthorized, responseEncoding = responseEncoding, responseType = responseType.asInstanceOf[js.Any], timeout = timeout, transformRequest = transformRequest, transformResponse = transformResponse, transport = transport, validateStatus = js.Any.fromFunction1(validateStatus), xsrfCookieName = xsrfCookieName, xsrfHeaderName = xsrfHeaderName)
  
    __obj.asInstanceOf[Config]
  }
}

