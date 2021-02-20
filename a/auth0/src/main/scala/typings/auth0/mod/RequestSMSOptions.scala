package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSMSOptions extends StObject {
  
  var phone_number: String = js.native
}
object RequestSMSOptions {
  
  @scala.inline
  def apply(phone_number: String): RequestSMSOptions = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSMSOptions]
  }
  
  @scala.inline
  implicit class RequestSMSOptionsMutableBuilder[Self <: RequestSMSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
  }
}
