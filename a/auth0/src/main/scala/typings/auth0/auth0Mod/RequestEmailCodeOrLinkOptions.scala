package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEmailCodeOrLinkOptions extends js.Object {
  var email: String
  var send: SendType
}

object RequestEmailCodeOrLinkOptions {
  @scala.inline
  def apply(email: String, send: SendType): RequestEmailCodeOrLinkOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestEmailCodeOrLinkOptions]
  }
}

