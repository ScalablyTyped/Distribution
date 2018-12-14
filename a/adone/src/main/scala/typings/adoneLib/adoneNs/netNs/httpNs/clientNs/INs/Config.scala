package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  var auth: adoneLib.Anon_Username
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

