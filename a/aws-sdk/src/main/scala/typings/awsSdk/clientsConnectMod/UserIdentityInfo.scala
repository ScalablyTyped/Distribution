package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserIdentityInfo extends StObject {
  
  /**
    * The email address. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var Email: js.UndefOr[typings.awsSdk.clientsConnectMod.Email] = js.undefined
  
  /**
    * The first name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.undefined
  
  /**
    * The last name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.undefined
  
  /**
    * The user's mobile number.
    */
  var Mobile: js.UndefOr[PhoneNumber] = js.undefined
  
  /**
    * The user's secondary email address. If you provide a secondary email, the user receives email notifications -- other than password reset notifications -- to this email address instead of to their primary email address.
    */
  var SecondaryEmail: js.UndefOr[Email] = js.undefined
}
object UserIdentityInfo {
  
  inline def apply(): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserIdentityInfo]
  }
  
  extension [Self <: UserIdentityInfo](x: Self) {
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setFirstName(value: AgentFirstName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: AgentLastName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setMobile(value: PhoneNumber): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "Mobile", js.undefined)
    
    inline def setSecondaryEmail(value: Email): Self = StObject.set(x, "SecondaryEmail", value.asInstanceOf[js.Any])
    
    inline def setSecondaryEmailUndefined: Self = StObject.set(x, "SecondaryEmail", js.undefined)
  }
}
