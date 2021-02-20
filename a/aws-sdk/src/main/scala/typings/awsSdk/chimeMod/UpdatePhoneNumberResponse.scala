package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePhoneNumberResponse extends StObject {
  
  /**
    * The updated phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumber] = js.native
}
object UpdatePhoneNumberResponse {
  
  @scala.inline
  def apply(): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberResponseMutableBuilder[Self <: UpdatePhoneNumberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
