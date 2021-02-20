package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestorePhoneNumberResponse extends StObject {
  
  /**
    * The phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumber] = js.native
}
object RestorePhoneNumberResponse {
  
  @scala.inline
  def apply(): RestorePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestorePhoneNumberResponse]
  }
  
  @scala.inline
  implicit class RestorePhoneNumberResponseMutableBuilder[Self <: RestorePhoneNumberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
