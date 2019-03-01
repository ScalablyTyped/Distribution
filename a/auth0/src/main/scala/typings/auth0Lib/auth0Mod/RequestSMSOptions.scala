package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSMSOptions extends js.Object {
  var phone_number: java.lang.String
}

object RequestSMSOptions {
  @scala.inline
  def apply(phone_number: java.lang.String): RequestSMSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("phone_number")(phone_number)
    __obj.asInstanceOf[RequestSMSOptions]
  }
}

