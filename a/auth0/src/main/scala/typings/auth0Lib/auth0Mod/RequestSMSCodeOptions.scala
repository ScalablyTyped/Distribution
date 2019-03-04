package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSMSCodeOptions extends RequestSMSOptions {
  var client_id: java.lang.String
}

object RequestSMSCodeOptions {
  @scala.inline
  def apply(client_id: java.lang.String, phone_number: java.lang.String): RequestSMSCodeOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id, phone_number = phone_number)
  
    __obj.asInstanceOf[RequestSMSCodeOptions]
  }
}

