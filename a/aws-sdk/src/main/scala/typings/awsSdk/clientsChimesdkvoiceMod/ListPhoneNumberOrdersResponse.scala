package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumberOrdersResponse extends StObject {
  
  /**
    * The token used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number order details.
    */
  var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
}
object ListPhoneNumberOrdersResponse {
  
  inline def apply(): ListPhoneNumberOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhoneNumberOrdersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberOrders(value: PhoneNumberOrderList): Self = StObject.set(x, "PhoneNumberOrders", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberOrdersUndefined: Self = StObject.set(x, "PhoneNumberOrders", js.undefined)
    
    inline def setPhoneNumberOrdersVarargs(value: PhoneNumberOrder*): Self = StObject.set(x, "PhoneNumberOrders", js.Array(value*))
  }
}
