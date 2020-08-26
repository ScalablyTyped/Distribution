package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSMSCodeOptions extends RequestSMSOptions {
  var client_id: String = js.native
}

object RequestSMSCodeOptions {
  @scala.inline
  def apply(client_id: String, phone_number: String): RequestSMSCodeOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSMSCodeOptions]
  }
  @scala.inline
  implicit class RequestSMSCodeOptionsOps[Self <: RequestSMSCodeOptions] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
  }
  
}

