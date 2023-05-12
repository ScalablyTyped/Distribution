package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSupportedPhoneNumberCountriesRequest extends StObject {
  
  /**
    * The phone number product type.
    */
  var ProductType: PhoneNumberProductType
}
object ListSupportedPhoneNumberCountriesRequest {
  
  inline def apply(ProductType: PhoneNumberProductType): ListSupportedPhoneNumberCountriesRequest = {
    val __obj = js.Dynamic.literal(ProductType = ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSupportedPhoneNumberCountriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSupportedPhoneNumberCountriesRequest] (val x: Self) extends AnyVal {
    
    inline def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
  }
}
