package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionAttributes extends StObject {
  
  /**
    * The name of the attribute within the SAML assertion to use as the email names for SAML users.
    */
  var email: js.UndefOr[AssertionAttribute] = js.undefined
  
  /**
    * The name of the attribute within the SAML assertion to use as the user full "friendly" names for user groups.
    */
  var groups: js.UndefOr[AssertionAttribute] = js.undefined
  
  /**
    * The name of the attribute within the SAML assertion to use as the login names for SAML users.
    */
  var login: js.UndefOr[AssertionAttribute] = js.undefined
  
  /**
    * The name of the attribute within the SAML assertion to use as the user full "friendly" names for SAML users.
    */
  var name: js.UndefOr[AssertionAttribute] = js.undefined
  
  /**
    * The name of the attribute within the SAML assertion to use as the user full "friendly" names for the users' organizations.
    */
  @JSName("org")
  var org_ : js.UndefOr[AssertionAttribute] = js.undefined
  
  /**
    * The name of the attribute within the SAML assertion to use as the user roles.
    */
  var role: js.UndefOr[AssertionAttribute] = js.undefined
}
object AssertionAttributes {
  
  inline def apply(): AssertionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssertionAttributes]
  }
  
  extension [Self <: AssertionAttributes](x: Self) {
    
    inline def setEmail(value: AssertionAttribute): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setGroups(value: AssertionAttribute): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setLogin(value: AssertionAttribute): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setName(value: AssertionAttribute): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrg_(value: AssertionAttribute): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setRole(value: AssertionAttribute): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
