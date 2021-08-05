package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumberOrdersResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results.
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
  
  extension [Self <: ListPhoneNumberOrdersResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberOrders(value: PhoneNumberOrderList): Self = StObject.set(x, "PhoneNumberOrders", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberOrdersUndefined: Self = StObject.set(x, "PhoneNumberOrders", js.undefined)
    
    inline def setPhoneNumberOrdersVarargs(value: PhoneNumberOrder*): Self = StObject.set(x, "PhoneNumberOrders", js.Array(value :_*))
  }
}
