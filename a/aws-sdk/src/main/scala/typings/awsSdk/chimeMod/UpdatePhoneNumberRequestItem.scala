package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePhoneNumberRequestItem extends StObject {
  
  /**
    * The outbound calling name to update.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.native
  
  /**
    * The phone number ID to update.
    */
  var PhoneNumberId: NonEmptyString = js.native
  
  /**
    * The product type to update.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.native
}
object UpdatePhoneNumberRequestItem {
  
  @scala.inline
  def apply(PhoneNumberId: NonEmptyString): UpdatePhoneNumberRequestItem = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
  }
  
  @scala.inline
  implicit class UpdatePhoneNumberRequestItemMutableBuilder[Self <: UpdatePhoneNumberRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    @scala.inline
    def setPhoneNumberId(value: NonEmptyString): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
  }
}
