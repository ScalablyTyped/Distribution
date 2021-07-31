package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String
}
object GetPhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberId: String): GetPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberRequest]
  }
  
  @scala.inline
  implicit class GetPhoneNumberRequestMutableBuilder[Self <: GetPhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
