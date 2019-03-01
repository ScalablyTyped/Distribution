package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestEmailCodeOrLinkOptions extends js.Object {
  var email: java.lang.String
  var send: SendType
}

object RequestEmailCodeOrLinkOptions {
  @scala.inline
  def apply(email: java.lang.String, send: SendType): RequestEmailCodeOrLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[RequestEmailCodeOrLinkOptions]
  }
}

