package typings.atAngularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "HttpXsrfTokenExtractor")
@js.native
abstract class HttpXsrfTokenExtractor () extends js.Object {
  /**
    * Get the XSRF token to use with an outgoing request.
    *
    * Will be called for every request, so the token may change between requests.
    */
  def getToken(): String | Null = js.native
}

