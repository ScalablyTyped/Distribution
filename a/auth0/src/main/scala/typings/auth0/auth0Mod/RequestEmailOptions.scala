package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEmailOptions extends js.Object {
  var email: String
}

object RequestEmailOptions {
  @scala.inline
  def apply(email: String): RequestEmailOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestEmailOptions]
  }
}

