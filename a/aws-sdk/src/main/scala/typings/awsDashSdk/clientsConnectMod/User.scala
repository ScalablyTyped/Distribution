package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  /**
    * The ARN of the user account.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The directory Id for the user account in the existing directory used for identity management.
    */
  var DirectoryUserId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.DirectoryUserId] = js.undefined
  /**
    * The identifier for the hierarchy group assigned to the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
  /**
    * The identifier of the user account.
    */
  var Id: js.UndefOr[UserId] = js.undefined
  /**
    * A UserIdentityInfo object.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
  /**
    * A UserPhoneConfig object.
    */
  var PhoneConfig: js.UndefOr[UserPhoneConfig] = js.undefined
  /**
    * The identifier of the routing profile assigned to the user.
    */
  var RoutingProfileId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.RoutingProfileId] = js.undefined
  /**
    * The identifier(s) for the security profile assigned to the user.
    */
  var SecurityProfileIds: js.UndefOr[typings.awsDashSdk.clientsConnectMod.SecurityProfileIds] = js.undefined
  /**
    * The user name assigned to the user account.
    */
  var Username: js.UndefOr[AgentUsername] = js.undefined
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
    Username: AgentUsername = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (DirectoryUserId != null) __obj.updateDynamic("DirectoryUserId")(DirectoryUserId)
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (IdentityInfo != null) __obj.updateDynamic("IdentityInfo")(IdentityInfo)
    if (PhoneConfig != null) __obj.updateDynamic("PhoneConfig")(PhoneConfig)
    if (RoutingProfileId != null) __obj.updateDynamic("RoutingProfileId")(RoutingProfileId)
    if (SecurityProfileIds != null) __obj.updateDynamic("SecurityProfileIds")(SecurityProfileIds)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[User]
  }
}

