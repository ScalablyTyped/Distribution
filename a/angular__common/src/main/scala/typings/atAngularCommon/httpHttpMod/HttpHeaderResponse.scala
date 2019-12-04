package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.Anon_Headers
import typings.atAngularCommon.httpHttpMod.HttpEventType.ResponseHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpHeaderResponse")
@js.native
/**
  * Create a new `HttpHeaderResponse` with the given parameters.
  */
class HttpHeaderResponse ()
  extends HttpResponseBase
     with HttpEvent[js.Any] {
  def this(init: Anon_Headers) = this()
  @JSName("type")
  val type_HttpHeaderResponse: ResponseHeader = js.native
  def clone(update: Anon_Headers): HttpHeaderResponse = js.native
}

