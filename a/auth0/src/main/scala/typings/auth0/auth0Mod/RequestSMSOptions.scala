package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSMSOptions extends js.Object {
  var phone_number: String
}

object RequestSMSOptions {
  @scala.inline
  def apply(phone_number: String): RequestSMSOptions = {
    val __obj = js.Dynamic.literal(phone_number = phone_number)
  
    __obj.asInstanceOf[RequestSMSOptions]
  }
}

