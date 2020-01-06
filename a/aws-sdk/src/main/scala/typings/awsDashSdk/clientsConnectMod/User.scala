package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the user account in the directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.DirectoryUserId] = js.native
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyGroupId] = js.native
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.native
  /**
    * Information about the user identity.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  /**
    * Information about the phone configuration for the user.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.RoutingProfileId] = js.native
  /**
    * The identifiers of the security profiles for the user.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsDashSdk.clientsConnectMod.SecurityProfileIds] = js.native
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.native
}

object User {
  @scala.inline
  def apply(
    Arn: ARN = null,
    DirectoryUserId: DirectoryUserId = null,
    HierarchyGroupId: HierarchyGroupId = null,
    Id: UserId = null,
    IdentityInfo: UserIdentityInfo = null,
    PhoneConfig: UserPhoneConfig = null,
    RoutingProfileId: RoutingProfileId = null,
    SecurityProfileIds: SecurityProfileIds = null,
    Tags: TagMap = null,
    Username: AgentUsername = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DirectoryUserId != null) __obj.updateDynamic("DirectoryUserId")(DirectoryUserId.asInstanceOf[js.Any])
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (IdentityInfo != null) __obj.updateDynamic("IdentityInfo")(IdentityInfo.asInstanceOf[js.Any])
    if (PhoneConfig != null) __obj.updateDynamic("PhoneConfig")(PhoneConfig.asInstanceOf[js.Any])
    if (RoutingProfileId != null) __obj.updateDynamic("RoutingProfileId")(RoutingProfileId.asInstanceOf[js.Any])
    if (SecurityProfileIds != null) __obj.updateDynamic("SecurityProfileIds")(SecurityProfileIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

