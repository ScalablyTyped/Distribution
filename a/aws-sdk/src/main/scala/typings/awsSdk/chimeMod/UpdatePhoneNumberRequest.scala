package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePhoneNumberRequest extends StObject {
  
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: String = js.native
  
  /**
    * The product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}
object UpdatePhoneNumberRequest {
  
  @scala.inline
  def apply(PhoneNumberId: String): UpdatePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequest]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberRequestMutableBuilder[Self <: UpdatePhoneNumberRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    @scala.inline
    def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
  }
}
