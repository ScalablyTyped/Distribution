package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberResponse extends StObject {
  
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumber] = js.undefined
}
object GetPhoneNumberResponse {
  
  @scala.inline
  def apply(): GetPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPhoneNumberResponse]
  }
  
  @scala.inline
  implicit class GetPhoneNumberResponseMutableBuilder[Self <: GetPhoneNumberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
