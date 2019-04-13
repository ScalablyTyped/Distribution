package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceDirectory extends js.Object {
  /**
    * The directory alias.
    */
  var Alias: js.UndefOr[Alias] = js.undefined
  /**
    * The user name for the service account.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.undefined
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
  /**
    * The name of the directory.
    */
  var DirectoryName: js.UndefOr[DirectoryName] = js.undefined
  /**
    * The directory type.
    */
  var DirectoryType: js.UndefOr[WorkspaceDirectoryType] = js.undefined
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  var DnsIpAddresses: js.UndefOr[DnsIpAddresses] = js.undefined
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  var IamRoleId: js.UndefOr[ARN] = js.undefined
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  var RegistrationCode: js.UndefOr[RegistrationCode] = js.undefined
  /**
    * The state of the directory's registration with Amazon WorkSpaces
    */
  var State: js.UndefOr[WorkspaceDirectoryState] = js.undefined
  /**
    * The identifiers of the subnets used with the directory.
    */
  var SubnetIds: js.UndefOr[SubnetIds] = js.undefined
  /**
    * The default creation properties for all WorkSpaces in the directory.
    */
  var WorkspaceCreationProperties: js.UndefOr[DefaultWorkspaceCreationProperties] = js.undefined
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  var WorkspaceSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  var ipGroupIds: js.UndefOr[IpGroupIdList] = js.undefined
}

object WorkspaceDirectory {
  @scala.inline
  def apply(
    Alias: Alias = null,
    CustomerUserName: UserName = null,
    DirectoryId: DirectoryId = null,
    DirectoryName: DirectoryName = null,
    DirectoryType: WorkspaceDirectoryType = null,
    DnsIpAddresses: DnsIpAddresses = null,
    IamRoleId: ARN = null,
    RegistrationCode: RegistrationCode = null,
    State: WorkspaceDirectoryState = null,
    SubnetIds: SubnetIds = null,
    WorkspaceCreationProperties: DefaultWorkspaceCreationProperties = null,
    WorkspaceSecurityGroupId: SecurityGroupId = null,
    ipGroupIds: IpGroupIdList = null
  ): WorkspaceDirectory = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    if (CustomerUserName != null) __obj.updateDynamic("CustomerUserName")(CustomerUserName)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (DirectoryName != null) __obj.updateDynamic("DirectoryName")(DirectoryName)
    if (DirectoryType != null) __obj.updateDynamic("DirectoryType")(DirectoryType.asInstanceOf[js.Any])
    if (DnsIpAddresses != null) __obj.updateDynamic("DnsIpAddresses")(DnsIpAddresses)
    if (IamRoleId != null) __obj.updateDynamic("IamRoleId")(IamRoleId)
    if (RegistrationCode != null) __obj.updateDynamic("RegistrationCode")(RegistrationCode)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (WorkspaceCreationProperties != null) __obj.updateDynamic("WorkspaceCreationProperties")(WorkspaceCreationProperties)
    if (WorkspaceSecurityGroupId != null) __obj.updateDynamic("WorkspaceSecurityGroupId")(WorkspaceSecurityGroupId)
    if (ipGroupIds != null) __obj.updateDynamic("ipGroupIds")(ipGroupIds)
    __obj.asInstanceOf[WorkspaceDirectory]
  }
}

