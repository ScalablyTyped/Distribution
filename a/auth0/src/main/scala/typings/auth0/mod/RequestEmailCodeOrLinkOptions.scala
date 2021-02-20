package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEmailCodeOrLinkOptions extends StObject {
  
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
  implicit class RequestEmailCodeOrLinkOptionsMutableBuilder[Self <: RequestEmailCodeOrLinkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: SendType): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
