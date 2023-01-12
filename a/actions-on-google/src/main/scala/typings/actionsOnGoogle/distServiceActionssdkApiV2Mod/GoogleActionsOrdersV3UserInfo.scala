package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3UserInfo extends StObject {
  
  /**
    * Display name of the user, might be different from first or last name.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * User email, Eg: janedoe@gmail.com.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * First name of the user.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * Last name of the user.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * Phone numbers of the user.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.undefined
}
object GoogleActionsOrdersV3UserInfo {
  
  inline def apply(): GoogleActionsOrdersV3UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3UserInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsOrdersV3UserInfo] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhoneNumbers(value: js.Array[GoogleActionsOrdersV3PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: GoogleActionsOrdersV3PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
  }
}
