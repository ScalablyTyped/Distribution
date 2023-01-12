package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestEmailCodeOrLinkOptions extends StObject {
  
  var email: String
  
  var send: SendType
}
object RequestEmailCodeOrLinkOptions {
  
  inline def apply(email: String, send: SendType): RequestEmailCodeOrLinkOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEmailCodeOrLinkOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestEmailCodeOrLinkOptions] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setSend(value: SendType): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
