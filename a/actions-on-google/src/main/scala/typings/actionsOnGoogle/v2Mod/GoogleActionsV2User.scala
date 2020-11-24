package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2User extends js.Object {
  
  /**
    * An OAuth2 token that identifies the user in your system. Only
    * available if the user links their account.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * Token representing the user's identity.
    * This is a Json web token including encoded profile. The definition is at
    * https://developers.google.com/identity/protocols/OpenIDConnect#obtainuserinfo.
    */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * The timestamp of the last interaction with this user.
    * This field will be omitted if the user has not interacted with the agent
    * before.
    */
  var lastSeen: js.UndefOr[String] = js.native
  
  /**
    * Primary locale setting of the user making the request.
    * Follows IETF BCP-47 language code
    * http://www.rfc-editor.org/rfc/bcp/bcp47.txt
    * However, the script subtag is not included.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * List of user entitlements for every package name listed in the Action
    * package, if any.
    */
  var packageEntitlements: js.UndefOr[js.Array[GoogleActionsV2PackageEntitlement]] = js.native
  
  /**
    * Contains permissions granted by user to this Action.
    */
  var permissions: js.UndefOr[js.Array[GoogleActionsV2UserPermissions]] = js.native
  
  /**
    * Information about the end user. Some fields are only available if the user
    * has given permission to provide this information to the Action.
    */
  var profile: js.UndefOr[GoogleActionsV2UserProfile] = js.native
  
  /**
    * Unique ID for the end user.
    */
  var userId: js.UndefOr[String] = js.native
  
  /**
    * An opaque token supplied by the application that is persisted across
    * conversations for a particular user.
    * The maximum size of the string is 10k characters.
    */
  var userStorage: js.UndefOr[String] = js.native
  
  /**
    * Indicates the verification status of the user.
    */
  var userVerificationStatus: js.UndefOr[GoogleActionsV2UserUserVerificationStatus] = js.native
}
object GoogleActionsV2User {
  
  @scala.inline
  def apply(): GoogleActionsV2User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2User]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UserOps[Self <: GoogleActionsV2User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setLastSeen(value: String): Self = this.set("lastSeen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSeen: Self = this.set("lastSeen", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPackageEntitlementsVarargs(value: GoogleActionsV2PackageEntitlement*): Self = this.set("packageEntitlements", js.Array(value :_*))
    
    @scala.inline
    def setPackageEntitlements(value: js.Array[GoogleActionsV2PackageEntitlement]): Self = this.set("packageEntitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageEntitlements: Self = this.set("packageEntitlements", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: GoogleActionsV2UserPermissions*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[GoogleActionsV2UserPermissions]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProfile(value: GoogleActionsV2UserProfile): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
    
    @scala.inline
    def setUserStorage(value: String): Self = this.set("userStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserStorage: Self = this.set("userStorage", js.undefined)
    
    @scala.inline
    def setUserVerificationStatus(value: GoogleActionsV2UserUserVerificationStatus): Self = this.set("userVerificationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVerificationStatus: Self = this.set("userVerificationStatus", js.undefined)
  }
}
