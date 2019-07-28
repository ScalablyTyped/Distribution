package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  /**
    * The unique identifier for the user account in the directory service directory used for identity management. If Amazon Connect is unable to access the existing directory, you can use the DirectoryUserId to authenticate users. If you include the parameter, it is assumed that Amazon Connect cannot access the directory. If the parameter is not included, the UserIdentityInfo is used to authenticate users from your existing directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
    */
  var DirectoryUserId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.DirectoryUserId] = js.undefined
  /**
    * The unique identifier for the hierarchy group to assign to the user created.
    */
  var HierarchyGroupId: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyGroupId] = js.undefined
  /**
    * Information about the user, including email address, first name, and last name.
    */
  var IdentityInfo: js.UndefOr[UserIdentityInfo] = js.undefined
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: typings.awsDashSdk.clientsConnectMod.InstanceId
  /**
    * The password for the user account to create. This is required if you are using Amazon Connect for identity management. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
    */
  var Password: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Password] = js.undefined
  /**
    * Specifies the phone settings for the user, including AfterContactWorkTimeLimit, AutoAccept, DeskPhoneNumber, and PhoneType.
    */
  var PhoneConfig: UserPhoneConfig
  /**
    * The unique identifier for the routing profile to assign to the user created.
    */
  var RoutingProfileId: typings.awsDashSdk.clientsConnectMod.RoutingProfileId
  /**
    * The unique identifier of the security profile to assign to the user created.
    */
  var SecurityProfileIds: typings.awsDashSdk.clientsConnectMod.SecurityProfileIds
  /**
    * The user name in Amazon Connect for the account to create. If you are using SAML for identity management in your Amazon Connect, the value for Username can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
    */
  var Username: AgentUsername
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
    Password: Password = null
  ): CreateUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, PhoneConfig = PhoneConfig, RoutingProfileId = RoutingProfileId, SecurityProfileIds = SecurityProfileIds, Username = Username)
    if (DirectoryUserId != null) __obj.updateDynamic("DirectoryUserId")(DirectoryUserId)
    if (HierarchyGroupId != null) __obj.updateDynamic("HierarchyGroupId")(HierarchyGroupId)
    if (IdentityInfo != null) __obj.updateDynamic("IdentityInfo")(IdentityInfo)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

