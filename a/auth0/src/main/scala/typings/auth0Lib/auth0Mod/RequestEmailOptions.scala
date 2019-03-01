package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEmailOptions extends js.Object {
  var email: java.lang.String
}

object RequestEmailOptions {
  @scala.inline
  def apply(email: java.lang.String): RequestEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[RequestEmailOptions]
  }
}

