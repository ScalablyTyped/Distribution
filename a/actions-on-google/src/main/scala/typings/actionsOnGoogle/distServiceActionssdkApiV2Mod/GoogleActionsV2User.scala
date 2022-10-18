package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2User extends StObject {
  
  /**
    * An OAuth2 token that identifies the user in your system. Only
    * available if the user links their account.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token representing the user's identity.
    * This is a Json web token including encoded profile. The definition is at
    * https://developers.google.com/identity/protocols/OpenIDConnect#obtainuserinfo.
    */
  var idToken: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last interaction with this user.
    * This field will be omitted if the user has not interacted with the agent
    * before.
    */
  var lastSeen: js.UndefOr[String] = js.undefined
  
  /**
    * Primary locale setting of the user making the request.
    * Follows IETF BCP-47 language code
    * http://www.rfc-editor.org/rfc/bcp/bcp47.txt
    * However, the script subtag is not included.
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * List of user entitlements for every package name listed in the Action
    * package, if any.
    */
  var packageEntitlements: js.UndefOr[js.Array[GoogleActionsV2PackageEntitlement]] = js.undefined
  
  /**
    * Contains permissions granted by user to this Action.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2UserPermissions]] = js.undefined
  
  /**
    * Information about the end user. Some fields are only available if the user
    * has given permission to provide this information to the Action.
    */
  var profile: js.UndefOr[GoogleActionsV2UserProfile] = js.undefined
  
  /**
    * Unique ID for the end user.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque token supplied by the application that is persisted across
    * conversations for a particular user.
    * The maximum size of the string is 10k characters.
    */
  var userStorage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the verification status of the user.
    */
  var userVerificationStatus: js.UndefOr[GoogleActionsV2UserUserVerificationStatus] = js.undefined
}
object GoogleActionsV2User {
  
  inline def apply(): GoogleActionsV2User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2User]
  }
  
  extension [Self <: GoogleActionsV2User](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setLastSeen(value: String): Self = StObject.set(x, "lastSeen", value.asInstanceOf[js.Any])
    
    inline def setLastSeenUndefined: Self = StObject.set(x, "lastSeen", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPackageEntitlements(value: js.Array[GoogleActionsV2PackageEntitlement]): Self = StObject.set(x, "packageEntitlements", value.asInstanceOf[js.Any])
    
    inline def setPackageEntitlementsUndefined: Self = StObject.set(x, "packageEntitlements", js.undefined)
    
    inline def setPackageEntitlementsVarargs(value: GoogleActionsV2PackageEntitlement*): Self = StObject.set(x, "packageEntitlements", js.Array(value*))
    
    inline def setPermissions(value: js.Array[GoogleActionsV2UserPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: GoogleActionsV2UserPermissions*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setProfile(value: GoogleActionsV2UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserStorage(value: String): Self = StObject.set(x, "userStorage", value.asInstanceOf[js.Any])
    
    inline def setUserStorageUndefined: Self = StObject.set(x, "userStorage", js.undefined)
    
    inline def setUserVerificationStatus(value: GoogleActionsV2UserUserVerificationStatus): Self = StObject.set(x, "userVerificationStatus", value.asInstanceOf[js.Any])
    
    inline def setUserVerificationStatusUndefined: Self = StObject.set(x, "userVerificationStatus", js.undefined)
  }
}
