package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class RequestSMSCodeOptionsMutableBuilder[Self <: RequestSMSCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
  }
}
