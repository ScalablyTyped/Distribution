package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpActionHeader extends js.Object {
  /**
    * The HTTP header key.
    */
  var key: HeaderKey = js.native
  /**
    * The HTTP header value. Substitution templates are supported.
    */
  var value: HeaderValue = js.native
}

object HttpActionHeader {
  @scala.inline
  def apply(key: HeaderKey, value: HeaderValue): HttpActionHeader = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpActionHeader]
  }
}

