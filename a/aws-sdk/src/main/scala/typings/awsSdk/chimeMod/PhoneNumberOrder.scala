package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberOrder extends StObject {
  
  /**
    * The phone number order creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
    */
  var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined
  
  /**
    * The phone number order ID.
    */
  var PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The phone number order product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  
  /**
    * The status of the phone number order.
    */
  var Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined
  
  /**
    * The updated phone number order timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
}
object PhoneNumberOrder {
  
  @scala.inline
  def apply(): PhoneNumberOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberOrder]
  }
  
  @scala.inline
  implicit class PhoneNumberOrderMutableBuilder[Self <: PhoneNumberOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setOrderedPhoneNumbers(value: OrderedPhoneNumberList): Self = StObject.set(x, "OrderedPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedPhoneNumbersUndefined: Self = StObject.set(x, "OrderedPhoneNumbers", js.undefined)
    
    @scala.inline
    def setOrderedPhoneNumbersVarargs(value: OrderedPhoneNumber*): Self = StObject.set(x, "OrderedPhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumberOrderId(value: GuidString): Self = StObject.set(x, "PhoneNumberOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberOrderIdUndefined: Self = StObject.set(x, "PhoneNumberOrderId", js.undefined)
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    @scala.inline
    def setStatus(value: PhoneNumberOrderStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
