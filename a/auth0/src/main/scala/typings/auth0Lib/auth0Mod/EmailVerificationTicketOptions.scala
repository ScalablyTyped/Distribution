package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailVerificationTicketOptions extends js.Object {
  var result_url: java.lang.String
  var user_id: java.lang.String
}

object EmailVerificationTicketOptions {
  @scala.inline
  def apply(result_url: java.lang.String, user_id: java.lang.String): EmailVerificationTicketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result_url")(result_url)
    __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[EmailVerificationTicketOptions]
  }
}

