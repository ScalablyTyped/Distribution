package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpContext extends js.Object {
  /**
    * The header keys and values in an HTTP authorization request.
    */
  var headers: js.UndefOr[HttpHeaders] = js.native
  /**
    * The query string keys and values in an HTTP authorization request.
    */
  var queryString: js.UndefOr[HttpQueryString] = js.native
}

object HttpContext {
  @scala.inline
  def apply(headers: HttpHeaders = null, queryString: HttpQueryString = null): HttpContext = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContext]
  }
}

