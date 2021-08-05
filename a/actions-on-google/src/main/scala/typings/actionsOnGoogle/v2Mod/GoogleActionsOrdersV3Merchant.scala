package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3Merchant extends StObject {
  
  /**
    * Merchant's address.
    */
  var address: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * Optional ID assigned to merchant if any.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The image associated with the merchant.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * The name of the merchant like \"Panera Bread\".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Merchant's phone numbers.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.undefined
}
object GoogleActionsOrdersV3Merchant {
  
  inline def apply(): GoogleActionsOrdersV3Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Merchant]
  }
  
  extension [Self <: GoogleActionsOrdersV3Merchant](x: Self) {
    
    inline def setAddress(value: GoogleActionsV2Location): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumbers(value: js.Array[GoogleActionsOrdersV3PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: GoogleActionsOrdersV3PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
  }
}
