package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3Merchant extends StObject {
  
  /**
    * Merchant's address.
    */
  var address: js.UndefOr[GoogleActionsV2Location] = js.native
  
  /**
    * Optional ID assigned to merchant if any.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The image associated with the merchant.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * The name of the merchant like \"Panera Bread\".
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Merchant's phone numbers.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.native
}
object GoogleActionsOrdersV3Merchant {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3Merchant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Merchant]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3MerchantMutableBuilder[Self <: GoogleActionsOrdersV3Merchant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: GoogleActionsV2Location): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[GoogleActionsOrdersV3PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: GoogleActionsOrdersV3PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
  }
}
