package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePhoneNumberRequest extends StObject {
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
}
object DeletePhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberId: String): DeletePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class DeletePhoneNumberRequestMutableBuilder[Self <: DeletePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
