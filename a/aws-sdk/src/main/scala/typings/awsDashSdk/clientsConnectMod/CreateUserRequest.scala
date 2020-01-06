package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  /**
    * The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var DirectoryUserId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.DirectoryUserId] = js.native
  /**
    * The identifier of the hierarchy group for the user.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyGroupId] = js.native
  /**
    * The information about the identity of the user.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId = js.native
  /**
    * The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
    */
  var Password: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Password] = js.native
  /**
    * The phone settings for the user.
    */
  var PhoneConfig: UserPhoneConfig = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typings.awsDashSdk.clientsConnectMod.RoutingProfileId = js.native
  /**
    * The identifier of the security profile for the user.
    */
  var SecurityProfileIds: typings.awsDashSdk.clientsConnectMod.SecurityProfileIds = js.native
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  /**
    * The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
    */
  var Username: AgentUsername = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(
    InstanceId: InstanceId,
    PhoneConfig: UserPhoneConfig,
    RoutingProfileId: RoutingProfileId,
    SecurityProfileIds: SecurityProfileIds,
    Username: AgentUsername,
    DirectoryUserId: DirectoryUserId = null,
    HierarchyGroupId: HierarchyGroupId = null,
    IdentityInfo: UserIdentityInfo = null,
    Password: Password = null,
    Tags: TagMap = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneConfig = PhoneConfig.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], SecurityProfileIds = SecurityProfileIds.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    if (DirectoryUserId != null) __obj.updateDynamic("DirectoryUserId")(DirectoryUserId.asInstanceOf[js.Any])
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId.asInstanceOf[js.Any])
    if (IdentityInfo != null) __obj.updateDynamic("IdentityInfo")(IdentityInfo.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
}

