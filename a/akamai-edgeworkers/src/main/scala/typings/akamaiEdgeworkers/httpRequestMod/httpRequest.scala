package typings.akamaiEdgeworkers.httpRequestMod

import typings.akamaiEdgeworkers.anon.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("http-request", "httpRequest")
@js.native
object httpRequest extends js.Object {
  
  /**
    * Performs a subrequest, fetching the requested resource asynchronously.
    *
    * @param url A String containing the URL to fetch. Can be an absolute
    *      or relative URL. Relative URLs will use the parent request as
    *      the base URL. Only "http" and "https" are supported for the
    *      scheme. Specifying port numbers is not supported.
    * @param options May include
    *  - `method` The HTTP method to use.
    *  - `headers` Request headers to specify.
    *  - `body` The request payload.
    *  - `timeout` The request timeout, in milliseconds.
    */
  def apply(url: String): js.Promise[HttpResponse] = js.native
  def apply(url: String, options: Headers): js.Promise[HttpResponse] = js.native
}
