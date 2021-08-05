package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestSMSOptions extends StObject {
  
  var phone_number: String
}
object RequestSMSOptions {
  
  inline def apply(phone_number: String): RequestSMSOptions = {
    val __obj = js.Dynamic.literal(phone_number = phone_number.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSMSOptions]
  }
  
  extension [Self <: RequestSMSOptions](x: Self) {
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
  }
}
