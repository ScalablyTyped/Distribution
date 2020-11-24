package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularStrings.abort
import typings.angular.angularStrings.complete
import typings.angular.angularStrings.error
import typings.angular.angularStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHttpResponse[T] extends js.Object {
  
  var config: IRequestConfig = js.native
  
  var data: T = js.native
  
  def headers(): StringDictionary[String] = js.native
  def headers(headerName: String): String = js.native
  @JSName("headers")
  var headers_Original: IHttpHeadersGetter = js.native
  
  var status: Double = js.native
  
  var statusText: String = js.native
  
  /** Added in AngularJS 1.6.6 */
  var xhrStatus: complete | error | timeout | abort = js.native
}
