package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHttpResponse[T] extends js.Object {
  var config: IRequestConfig = js.native
  var data: T = js.native
  @JSName("headers")
  var headers_Original: IHttpHeadersGetter = js.native
  var status: scala.Double = js.native
  var statusText: java.lang.String = js.native
  /** Added in AngularJS 1.6.6 */
  var xhrStatus: angularLib.angularLibStrings.complete | angularLib.angularLibStrings.error | angularLib.angularLibStrings.timeout | angularLib.angularLibStrings.abort = js.native
  def headers(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def headers(headerName: java.lang.String): java.lang.String = js.native
}

