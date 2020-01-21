package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2User extends js.Object {
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
  @scala.inline
  def apply(
    accessToken: String = null,
    idToken: String = null,
    lastSeen: String = null,
    locale: String = null,
    packageEntitlements: js.Array[GoogleActionsV2PackageEntitlement] = null,
    permissions: js.Array[GoogleActionsV2UserPermissions] = null,
    profile: GoogleActionsV2UserProfile = null,
    userId: String = null,
    userStorage: String = null,
    userVerificationStatus: GoogleActionsV2UserUserVerificationStatus = null
  ): GoogleActionsV2User = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (lastSeen != null) __obj.updateDynamic("lastSeen")(lastSeen.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (packageEntitlements != null) __obj.updateDynamic("packageEntitlements")(packageEntitlements.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (userStorage != null) __obj.updateDynamic("userStorage")(userStorage.asInstanceOf[js.Any])
    if (userVerificationStatus != null) __obj.updateDynamic("userVerificationStatus")(userVerificationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2User]
  }
}

