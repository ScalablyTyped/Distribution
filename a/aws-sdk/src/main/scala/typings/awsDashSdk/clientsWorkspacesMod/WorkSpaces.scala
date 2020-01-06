package typings.awsDashSdk.clientsWorkspacesMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkSpaces extends Service {
  @JSName("config")
  var config_WorkSpaces: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(): Request[AssociateIpGroupsResult, AWSError] = js.native
  def associateIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ AssociateIpGroupsResult, Unit]): Request[AssociateIpGroupsResult, AWSError] = js.native
  /**
    * Associates the specified IP access control group with the specified directory.
    */
  def associateIpGroups(params: AssociateIpGroupsRequest): Request[AssociateIpGroupsResult, AWSError] = js.native
  def associateIpGroups(
    params: AssociateIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateIpGroupsResult, Unit]
  ): Request[AssociateIpGroupsResult, AWSError] = js.native
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(): Request[AuthorizeIpRulesResult, AWSError] = js.native
  def authorizeIpRules(callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeIpRulesResult, Unit]): Request[AuthorizeIpRulesResult, AWSError] = js.native
  /**
    * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
    */
  def authorizeIpRules(params: AuthorizeIpRulesRequest): Request[AuthorizeIpRulesResult, AWSError] = js.native
  def authorizeIpRules(
    params: AuthorizeIpRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AuthorizeIpRulesResult, Unit]
  ): Request[AuthorizeIpRulesResult, AWSError] = js.native
  /**
    * Copies the specified image from the specified Region to the current Region.
    */
  def copyWorkspaceImage(): Request[CopyWorkspaceImageResult, AWSError] = js.native
  def copyWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ CopyWorkspaceImageResult, Unit]): Request[CopyWorkspaceImageResult, AWSError] = js.native
  /**
    * Copies the specified image from the specified Region to the current Region.
    */
  def copyWorkspaceImage(params: CopyWorkspaceImageRequest): Request[CopyWorkspaceImageResult, AWSError] = js.native
  def copyWorkspaceImage(
    params: CopyWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyWorkspaceImageResult, Unit]
  ): Request[CopyWorkspaceImageResult, AWSError] = js.native
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(): Request[CreateIpGroupResult, AWSError] = js.native
  def createIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateIpGroupResult, Unit]): Request[CreateIpGroupResult, AWSError] = js.native
  /**
    * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
    */
  def createIpGroup(params: CreateIpGroupRequest): Request[CreateIpGroupResult, AWSError] = js.native
  def createIpGroup(
    params: CreateIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIpGroupResult, Unit]
  ): Request[CreateIpGroupResult, AWSError] = js.native
  /**
    * Creates the specified tags for the specified WorkSpaces resource.
    */
  def createTags(): Request[CreateTagsResult, AWSError] = js.native
  def createTags(callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResult, Unit]): Request[CreateTagsResult, AWSError] = js.native
  /**
    * Creates the specified tags for the specified WorkSpaces resource.
    */
  def createTags(params: CreateTagsRequest): Request[CreateTagsResult, AWSError] = js.native
  def createTags(
    params: CreateTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTagsResult, Unit]
  ): Request[CreateTagsResult, AWSError] = js.native
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(): Request[CreateWorkspacesResult, AWSError] = js.native
  def createWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspacesResult, Unit]): Request[CreateWorkspacesResult, AWSError] = js.native
  /**
    * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
    */
  def createWorkspaces(params: CreateWorkspacesRequest): Request[CreateWorkspacesResult, AWSError] = js.native
  def createWorkspaces(
    params: CreateWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateWorkspacesResult, Unit]
  ): Request[CreateWorkspacesResult, AWSError] = js.native
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(): Request[DeleteIpGroupResult, AWSError] = js.native
  def deleteIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIpGroupResult, Unit]): Request[DeleteIpGroupResult, AWSError] = js.native
  /**
    * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
    */
  def deleteIpGroup(params: DeleteIpGroupRequest): Request[DeleteIpGroupResult, AWSError] = js.native
  def deleteIpGroup(
    params: DeleteIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIpGroupResult, Unit]
  ): Request[DeleteIpGroupResult, AWSError] = js.native
  /**
    * Deletes the specified tags from the specified WorkSpaces resource.
    */
  def deleteTags(): Request[DeleteTagsResult, AWSError] = js.native
  def deleteTags(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResult, Unit]): Request[DeleteTagsResult, AWSError] = js.native
  /**
    * Deletes the specified tags from the specified WorkSpaces resource.
    */
  def deleteTags(params: DeleteTagsRequest): Request[DeleteTagsResult, AWSError] = js.native
  def deleteTags(
    params: DeleteTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTagsResult, Unit]
  ): Request[DeleteTagsResult, AWSError] = js.native
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and un-share the image if it is shared with other accounts. 
    */
  def deleteWorkspaceImage(): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  def deleteWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceImageResult, Unit]): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  /**
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and un-share the image if it is shared with other accounts. 
    */
  def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  def deleteWorkspaceImage(
    params: DeleteWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteWorkspaceImageResult, Unit]
  ): Request[DeleteWorkspaceImageResult, AWSError] = js.native
  /**
    * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister the directory.
    */
  def deregisterWorkspaceDirectory(): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  def deregisterWorkspaceDirectory(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWorkspaceDirectoryResult, Unit]): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Deregisters the specified directory. This operation is asynchronous and returns before the WorkSpace directory is deregistered. If any WorkSpaces are registered to this directory, you must remove them before you can deregister the directory.
    */
  def deregisterWorkspaceDirectory(params: DeregisterWorkspaceDirectoryRequest): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  def deregisterWorkspaceDirectory(
    params: DeregisterWorkspaceDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterWorkspaceDirectoryResult, Unit]
  ): Request[DeregisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccount(): Request[DescribeAccountResult, AWSError] = js.native
  def describeAccount(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountResult, Unit]): Request[DescribeAccountResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccount(params: DescribeAccountRequest): Request[DescribeAccountResult, AWSError] = js.native
  def describeAccount(
    params: DescribeAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountResult, Unit]
  ): Request[DescribeAccountResult, AWSError] = js.native
  /**
    * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccountModifications(): Request[DescribeAccountModificationsResult, AWSError] = js.native
  def describeAccountModifications(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountModificationsResult, Unit]): Request[DescribeAccountModificationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes modifications to the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def describeAccountModifications(params: DescribeAccountModificationsRequest): Request[DescribeAccountModificationsResult, AWSError] = js.native
  def describeAccountModifications(
    params: DescribeAccountModificationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountModificationsResult, Unit]
  ): Request[DescribeAccountModificationsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(): Request[DescribeClientPropertiesResult, AWSError] = js.native
  def describeClientProperties(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientPropertiesResult, Unit]): Request[DescribeClientPropertiesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
    */
  def describeClientProperties(params: DescribeClientPropertiesRequest): Request[DescribeClientPropertiesResult, AWSError] = js.native
  def describeClientProperties(
    params: DescribeClientPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClientPropertiesResult, Unit]
  ): Request[DescribeClientPropertiesResult, AWSError] = js.native
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(): Request[DescribeIpGroupsResult, AWSError] = js.native
  def describeIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpGroupsResult, Unit]): Request[DescribeIpGroupsResult, AWSError] = js.native
  /**
    * Describes one or more of your IP access control groups.
    */
  def describeIpGroups(params: DescribeIpGroupsRequest): Request[DescribeIpGroupsResult, AWSError] = js.native
  def describeIpGroups(
    params: DescribeIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIpGroupsResult, Unit]
  ): Request[DescribeIpGroupsResult, AWSError] = js.native
  /**
    * Describes the specified tags for the specified WorkSpaces resource.
    */
  def describeTags(): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]): Request[DescribeTagsResult, AWSError] = js.native
  /**
    * Describes the specified tags for the specified WorkSpaces resource.
    */
  def describeTags(params: DescribeTagsRequest): Request[DescribeTagsResult, AWSError] = js.native
  def describeTags(
    params: DescribeTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTagsResult, Unit]
  ): Request[DescribeTagsResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  def describeWorkspaceBundles(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceBundlesResult, Unit]): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
    */
  def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  def describeWorkspaceBundles(
    params: DescribeWorkspaceBundlesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceBundlesResult, Unit]
  ): Request[DescribeWorkspaceBundlesResult, AWSError] = js.native
  /**
    * Describes the available directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  def describeWorkspaceDirectories(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceDirectoriesResult, Unit]): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  /**
    * Describes the available directories that are registered with Amazon WorkSpaces.
    */
  def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  def describeWorkspaceDirectories(
    params: DescribeWorkspaceDirectoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceDirectoriesResult, Unit]
  ): Request[DescribeWorkspaceDirectoriesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  def describeWorkspaceImages(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagesResult, Unit]): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  /**
    * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
    */
  def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  def describeWorkspaceImages(
    params: DescribeWorkspaceImagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceImagesResult, Unit]
  ): Request[DescribeWorkspaceImagesResult, AWSError] = js.native
  /**
    * Describes the snapshots for the specified WorkSpace.
    */
  def describeWorkspaceSnapshots(): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  def describeWorkspaceSnapshots(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceSnapshotsResult, Unit]): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  /**
    * Describes the snapshots for the specified WorkSpace.
    */
  def describeWorkspaceSnapshots(params: DescribeWorkspaceSnapshotsRequest): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  def describeWorkspaceSnapshots(
    params: DescribeWorkspaceSnapshotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspaceSnapshotsResult, Unit]
  ): Request[DescribeWorkspaceSnapshotsResult, AWSError] = js.native
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(): Request[DescribeWorkspacesResult, AWSError] = js.native
  def describeWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesResult, Unit]): Request[DescribeWorkspacesResult, AWSError] = js.native
  /**
    * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
    */
  def describeWorkspaces(params: DescribeWorkspacesRequest): Request[DescribeWorkspacesResult, AWSError] = js.native
  def describeWorkspaces(
    params: DescribeWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesResult, Unit]
  ): Request[DescribeWorkspacesResult, AWSError] = js.native
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  def describeWorkspacesConnectionStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesConnectionStatusResult, Unit]
  ): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  /**
    * Describes the connection status of the specified WorkSpaces.
    */
  def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  def describeWorkspacesConnectionStatus(
    params: DescribeWorkspacesConnectionStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeWorkspacesConnectionStatusResult, Unit]
  ): Request[DescribeWorkspacesConnectionStatusResult, AWSError] = js.native
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(): Request[DisassociateIpGroupsResult, AWSError] = js.native
  def disassociateIpGroups(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIpGroupsResult, Unit]): Request[DisassociateIpGroupsResult, AWSError] = js.native
  /**
    * Disassociates the specified IP access control group from the specified directory.
    */
  def disassociateIpGroups(params: DisassociateIpGroupsRequest): Request[DisassociateIpGroupsResult, AWSError] = js.native
  def disassociateIpGroups(
    params: DisassociateIpGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateIpGroupsResult, Unit]
  ): Request[DisassociateIpGroupsResult, AWSError] = js.native
  /**
    * Imports the specified Windows 7 or Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
    */
  def importWorkspaceImage(): Request[ImportWorkspaceImageResult, AWSError] = js.native
  def importWorkspaceImage(callback: js.Function2[/* err */ AWSError, /* data */ ImportWorkspaceImageResult, Unit]): Request[ImportWorkspaceImageResult, AWSError] = js.native
  /**
    * Imports the specified Windows 7 or Windows 10 Bring Your Own License (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
    */
  def importWorkspaceImage(params: ImportWorkspaceImageRequest): Request[ImportWorkspaceImageResult, AWSError] = js.native
  def importWorkspaceImage(
    params: ImportWorkspaceImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ImportWorkspaceImageResult, Unit]
  ): Request[ImportWorkspaceImageResult, AWSError] = js.native
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable Bring Your Own License (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  def listAvailableManagementCidrRanges(
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagementCidrRangesResult, Unit]
  ): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  /**
    * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable Bring Your Own License (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
    */
  def listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  def listAvailableManagementCidrRanges(
    params: ListAvailableManagementCidrRangesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAvailableManagementCidrRangesResult, Unit]
  ): Request[ListAvailableManagementCidrRangesResult, AWSError] = js.native
  /**
    * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def modifyAccount(): Request[ModifyAccountResult, AWSError] = js.native
  def modifyAccount(callback: js.Function2[/* err */ AWSError, /* data */ ModifyAccountResult, Unit]): Request[ModifyAccountResult, AWSError] = js.native
  /**
    * Modifies the configuration of Bring Your Own License (BYOL) for the specified account.
    */
  def modifyAccount(params: ModifyAccountRequest): Request[ModifyAccountResult, AWSError] = js.native
  def modifyAccount(
    params: ModifyAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyAccountResult, Unit]
  ): Request[ModifyAccountResult, AWSError] = js.native
  /**
    * Modifies the properties of the specified Amazon WorkSpaces clients.
    */
  def modifyClientProperties(): Request[ModifyClientPropertiesResult, AWSError] = js.native
  def modifyClientProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientPropertiesResult, Unit]): Request[ModifyClientPropertiesResult, AWSError] = js.native
  /**
    * Modifies the properties of the specified Amazon WorkSpaces clients.
    */
  def modifyClientProperties(params: ModifyClientPropertiesRequest): Request[ModifyClientPropertiesResult, AWSError] = js.native
  def modifyClientProperties(
    params: ModifyClientPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyClientPropertiesResult, Unit]
  ): Request[ModifyClientPropertiesResult, AWSError] = js.native
  /**
    * Modifies the self-service WorkSpace management capabilities for your users. For more information, see Enable Self-Service WorkSpace Management Capabilities for Your Users.
    */
  def modifySelfservicePermissions(): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  def modifySelfservicePermissions(callback: js.Function2[/* err */ AWSError, /* data */ ModifySelfservicePermissionsResult, Unit]): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  /**
    * Modifies the self-service WorkSpace management capabilities for your users. For more information, see Enable Self-Service WorkSpace Management Capabilities for Your Users.
    */
  def modifySelfservicePermissions(params: ModifySelfservicePermissionsRequest): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  def modifySelfservicePermissions(
    params: ModifySelfservicePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifySelfservicePermissionsResult, Unit]
  ): Request[ModifySelfservicePermissionsResult, AWSError] = js.native
  /**
    * Specifies which devices and operating systems users can use to access their Workspaces. For more information, see  Control Device Access.
    */
  def modifyWorkspaceAccessProperties(): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  def modifyWorkspaceAccessProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceAccessPropertiesResult, Unit]): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  /**
    * Specifies which devices and operating systems users can use to access their Workspaces. For more information, see  Control Device Access.
    */
  def modifyWorkspaceAccessProperties(params: ModifyWorkspaceAccessPropertiesRequest): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  def modifyWorkspaceAccessProperties(
    params: ModifyWorkspaceAccessPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceAccessPropertiesResult, Unit]
  ): Request[ModifyWorkspaceAccessPropertiesResult, AWSError] = js.native
  /**
    * Modify the default properties used to create WorkSpaces.
    */
  def modifyWorkspaceCreationProperties(): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  def modifyWorkspaceCreationProperties(
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceCreationPropertiesResult, Unit]
  ): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  /**
    * Modify the default properties used to create WorkSpaces.
    */
  def modifyWorkspaceCreationProperties(params: ModifyWorkspaceCreationPropertiesRequest): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  def modifyWorkspaceCreationProperties(
    params: ModifyWorkspaceCreationPropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceCreationPropertiesResult, Unit]
  ): Request[ModifyWorkspaceCreationPropertiesResult, AWSError] = js.native
  /**
    * Modifies the specified WorkSpace properties.
    */
  def modifyWorkspaceProperties(): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  def modifyWorkspaceProperties(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspacePropertiesResult, Unit]): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  /**
    * Modifies the specified WorkSpace properties.
    */
  def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  def modifyWorkspaceProperties(
    params: ModifyWorkspacePropertiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspacePropertiesResult, Unit]
  ): Request[ModifyWorkspacePropertiesResult, AWSError] = js.native
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  def modifyWorkspaceState(callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceStateResult, Unit]): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  /**
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
    */
  def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  def modifyWorkspaceState(
    params: ModifyWorkspaceStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ModifyWorkspaceStateResult, Unit]
  ): Request[ModifyWorkspaceStateResult, AWSError] = js.native
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(): Request[RebootWorkspacesResult, AWSError] = js.native
  def rebootWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ RebootWorkspacesResult, Unit]): Request[RebootWorkspacesResult, AWSError] = js.native
  /**
    * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
    */
  def rebootWorkspaces(params: RebootWorkspacesRequest): Request[RebootWorkspacesResult, AWSError] = js.native
  def rebootWorkspaces(
    params: RebootWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebootWorkspacesResult, Unit]
  ): Request[RebootWorkspacesResult, AWSError] = js.native
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(): Request[RebuildWorkspacesResult, AWSError] = js.native
  def rebuildWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ RebuildWorkspacesResult, Unit]): Request[RebuildWorkspacesResult, AWSError] = js.native
  /**
    * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
    */
  def rebuildWorkspaces(params: RebuildWorkspacesRequest): Request[RebuildWorkspacesResult, AWSError] = js.native
  def rebuildWorkspaces(
    params: RebuildWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RebuildWorkspacesResult, Unit]
  ): Request[RebuildWorkspacesResult, AWSError] = js.native
  /**
    * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is registered. If this is the first time you are registering a directory, you will need to create the workspaces_DefaultRole role before you can register a directory. For more information, see  Creating the workspaces_DefaultRole Role.
    */
  def registerWorkspaceDirectory(): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  def registerWorkspaceDirectory(callback: js.Function2[/* err */ AWSError, /* data */ RegisterWorkspaceDirectoryResult, Unit]): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Registers the specified directory. This operation is asynchronous and returns before the WorkSpace directory is registered. If this is the first time you are registering a directory, you will need to create the workspaces_DefaultRole role before you can register a directory. For more information, see  Creating the workspaces_DefaultRole Role.
    */
  def registerWorkspaceDirectory(params: RegisterWorkspaceDirectoryRequest): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  def registerWorkspaceDirectory(
    params: RegisterWorkspaceDirectoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterWorkspaceDirectoryResult, Unit]
  ): Request[RegisterWorkspaceDirectoryResult, AWSError] = js.native
  /**
    * Restores the specified WorkSpace to its last known healthy state. You cannot restore a WorkSpace unless its state is  AVAILABLE, ERROR, or UNHEALTHY. Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Restore a WorkSpace. This operation is asynchronous and returns before the WorkSpace is completely restored.
    */
  def restoreWorkspace(): Request[RestoreWorkspaceResult, AWSError] = js.native
  def restoreWorkspace(callback: js.Function2[/* err */ AWSError, /* data */ RestoreWorkspaceResult, Unit]): Request[RestoreWorkspaceResult, AWSError] = js.native
  /**
    * Restores the specified WorkSpace to its last known healthy state. You cannot restore a WorkSpace unless its state is  AVAILABLE, ERROR, or UNHEALTHY. Restoring a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Restore a WorkSpace. This operation is asynchronous and returns before the WorkSpace is completely restored.
    */
  def restoreWorkspace(params: RestoreWorkspaceRequest): Request[RestoreWorkspaceResult, AWSError] = js.native
  def restoreWorkspace(
    params: RestoreWorkspaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreWorkspaceResult, Unit]
  ): Request[RestoreWorkspaceResult, AWSError] = js.native
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(): Request[RevokeIpRulesResult, AWSError] = js.native
  def revokeIpRules(callback: js.Function2[/* err */ AWSError, /* data */ RevokeIpRulesResult, Unit]): Request[RevokeIpRulesResult, AWSError] = js.native
  /**
    * Removes one or more rules from the specified IP access control group.
    */
  def revokeIpRules(params: RevokeIpRulesRequest): Request[RevokeIpRulesResult, AWSError] = js.native
  def revokeIpRules(
    params: RevokeIpRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeIpRulesResult, Unit]
  ): Request[RevokeIpRulesResult, AWSError] = js.native
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(): Request[StartWorkspacesResult, AWSError] = js.native
  def startWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ StartWorkspacesResult, Unit]): Request[StartWorkspacesResult, AWSError] = js.native
  /**
    * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
    */
  def startWorkspaces(params: StartWorkspacesRequest): Request[StartWorkspacesResult, AWSError] = js.native
  def startWorkspaces(
    params: StartWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartWorkspacesResult, Unit]
  ): Request[StartWorkspacesResult, AWSError] = js.native
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(): Request[StopWorkspacesResult, AWSError] = js.native
  def stopWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ StopWorkspacesResult, Unit]): Request[StopWorkspacesResult, AWSError] = js.native
  /**
    *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
    */
  def stopWorkspaces(params: StopWorkspacesRequest): Request[StopWorkspacesResult, AWSError] = js.native
  def stopWorkspaces(
    params: StopWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopWorkspacesResult, Unit]
  ): Request[StopWorkspacesResult, AWSError] = js.native
  /**
    * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
    */
  def terminateWorkspaces(): Request[TerminateWorkspacesResult, AWSError] = js.native
  def terminateWorkspaces(callback: js.Function2[/* err */ AWSError, /* data */ TerminateWorkspacesResult, Unit]): Request[TerminateWorkspacesResult, AWSError] = js.native
  /**
    * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
    */
  def terminateWorkspaces(params: TerminateWorkspacesRequest): Request[TerminateWorkspacesResult, AWSError] = js.native
  def terminateWorkspaces(
    params: TerminateWorkspacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TerminateWorkspacesResult, Unit]
  ): Request[TerminateWorkspacesResult, AWSError] = js.native
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  def updateRulesOfIpGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesOfIpGroupResult, Unit]): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  /**
    * Replaces the current rules of the specified IP access control group with the specified rules.
    */
  def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
  def updateRulesOfIpGroup(
    params: UpdateRulesOfIpGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRulesOfIpGroupResult, Unit]
  ): Request[UpdateRulesOfIpGroupResult, AWSError] = js.native
}

