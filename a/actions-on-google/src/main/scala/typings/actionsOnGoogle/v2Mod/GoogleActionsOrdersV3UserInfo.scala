package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3UserInfo extends StObject {
  
  /**
    * Display name of the user, might be different from first or last name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * User email, Eg: janedoe@gmail.com.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * First name of the user.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * Last name of the user.
    */
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * Phone numbers of the user.
    */
  var phoneNumbers: js.UndefOr[js.Array[GoogleActionsOrdersV3PhoneNumber]] = js.native
}
object GoogleActionsOrdersV3UserInfo {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3UserInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3UserInfo]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3UserInfoMutableBuilder[Self <: GoogleActionsOrdersV3UserInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[GoogleActionsOrdersV3PhoneNumber]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: GoogleActionsOrdersV3PhoneNumber*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
  }
}
