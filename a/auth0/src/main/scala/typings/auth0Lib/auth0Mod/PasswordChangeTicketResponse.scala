package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordChangeTicketResponse extends js.Object {
  var ticket: java.lang.String
}

object PasswordChangeTicketResponse {
  @scala.inline
  def apply(ticket: java.lang.String): PasswordChangeTicketResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ticket")(ticket)
    __obj.asInstanceOf[PasswordChangeTicketResponse]
  }
}

