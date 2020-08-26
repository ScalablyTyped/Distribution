package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSMSOptions extends js.Object {
  var phone_number: String = js.native
}

object RequestSMSOptions {
  @scala.inline
  def apply(phone_number: String): RequestSMSOptions = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSMSOptions]
  }
  @scala.inline
  implicit class RequestSMSOptionsOps[Self <: RequestSMSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
  }
  
}

