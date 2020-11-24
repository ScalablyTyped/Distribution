package typings.angularCommon.httpHttpMod

import typings.angularCommon.anon.Headers
import typings.angularCommon.httpHttpMod.HttpEventType.ResponseHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common/http/http", "HttpHeaderResponse")
@js.native
/**
  * Create a new `HttpHeaderResponse` with the given parameters.
  */
class HttpHeaderResponse ()
  extends HttpResponseBase
     with HttpEvent[js.Any] {
  def this(init: Headers) = this()
  
  def clone(update: Headers): HttpHeaderResponse = js.native
  
  @JSName("type")
  val type_HttpHeaderResponse: ResponseHeader = js.native
}
