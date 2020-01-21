package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordChangeTicketResponse extends js.Object {
  var ticket: String
}

object PasswordChangeTicketResponse {
  @scala.inline
  def apply(ticket: String): PasswordChangeTicketResponse = {
    val __obj = js.Dynamic.literal(ticket = ticket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PasswordChangeTicketResponse]
  }
}

