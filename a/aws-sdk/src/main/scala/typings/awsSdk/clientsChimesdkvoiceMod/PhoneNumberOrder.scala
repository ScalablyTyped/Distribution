package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberOrder extends StObject {
  
  /**
    * The phone number order creation time stamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of phone number being ordered, local or toll-free.
    */
  var OrderType: js.UndefOr[PhoneNumberOrderType] = js.undefined
  
  /**
    * The ordered phone number details, such as the phone number in E.164 format and the phone number status.
    */
  var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined
  
  /**
    * The ID of the phone order.
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
    * The updated phone number order time stamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object PhoneNumberOrder {
  
  inline def apply(): PhoneNumberOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberOrder] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setOrderType(value: PhoneNumberOrderType): Self = StObject.set(x, "OrderType", value.asInstanceOf[js.Any])
    
    inline def setOrderTypeUndefined: Self = StObject.set(x, "OrderType", js.undefined)
    
    inline def setOrderedPhoneNumbers(value: OrderedPhoneNumberList): Self = StObject.set(x, "OrderedPhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setOrderedPhoneNumbersUndefined: Self = StObject.set(x, "OrderedPhoneNumbers", js.undefined)
    
    inline def setOrderedPhoneNumbersVarargs(value: OrderedPhoneNumber*): Self = StObject.set(x, "OrderedPhoneNumbers", js.Array(value*))
    
    inline def setPhoneNumberOrderId(value: GuidString): Self = StObject.set(x, "PhoneNumberOrderId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberOrderIdUndefined: Self = StObject.set(x, "PhoneNumberOrderId", js.undefined)
    
    inline def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    inline def setStatus(value: PhoneNumberOrderStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
