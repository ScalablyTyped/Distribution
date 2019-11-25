package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailVerificationTicketOptions extends js.Object {
  var result_url: String
  var user_id: String
}

object EmailVerificationTicketOptions {
  @scala.inline
  def apply(result_url: String, user_id: String): EmailVerificationTicketOptions = {
    val __obj = js.Dynamic.literal(result_url = result_url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailVerificationTicketOptions]
  }
}

