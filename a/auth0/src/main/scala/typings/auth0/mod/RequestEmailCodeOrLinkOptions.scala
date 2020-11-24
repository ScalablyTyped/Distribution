package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEmailCodeOrLinkOptions extends js.Object {
  
  var email: String = js.native
  
  var send: SendType = js.native
}
object RequestEmailCodeOrLinkOptions {
  
  @scala.inline
  def apply(email: String, send: SendType): RequestEmailCodeOrLinkOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEmailCodeOrLinkOptions]
  }
  
  @scala.inline
  implicit class RequestEmailCodeOrLinkOptionsOps[Self <: RequestEmailCodeOrLinkOptions] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: SendType): Self = this.set("send", value.asInstanceOf[js.Any])
  }
}
