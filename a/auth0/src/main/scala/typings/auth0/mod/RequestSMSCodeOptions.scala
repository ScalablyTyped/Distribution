package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSMSCodeOptions extends RequestSMSOptions {
  var client_id: String
}

object RequestSMSCodeOptions {
  @scala.inline
  def apply(client_id: String, phone_number: String): RequestSMSCodeOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSMSCodeOptions]
  }
}

