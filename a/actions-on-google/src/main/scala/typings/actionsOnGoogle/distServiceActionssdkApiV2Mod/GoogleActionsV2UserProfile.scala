package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UserProfile extends StObject {
  
  /**
    * The user's full name as specified in their Google account.
    * Requires the NAME permission.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The user's last name as specified in their Google account.
    * Note that this field could be empty.
    * Requires the NAME permission.
    */
  var familyName: js.UndefOr[String] = js.undefined
  
  /**
    * The user's first name as specified in their Google account.
    * Requires the NAME permission.
    */
  var givenName: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UserProfile {
  
  inline def apply(): GoogleActionsV2UserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2UserProfile] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
  }
}
