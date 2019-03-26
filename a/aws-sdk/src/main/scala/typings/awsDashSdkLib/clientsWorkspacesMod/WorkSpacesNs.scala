package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/workspaces", "WorkSpaces")
@js.native
object WorkSpacesNs extends js.Object {
  trait AccountModification extends js.Object {
    /**
      * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
      */
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined
    /**
      * The status of BYOL (whether BYOL is being enabled or disabled).
      */
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
    /**
      * The error code that is returned if the configuration of BYOL cannot be modified.
      */
    var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
    /**
      * The text of the error message that is returned if the configuration of BYOL cannot be modified.
      */
    var ErrorMessage: js.UndefOr[Description] = js.undefined
    /**
      * The state of the modification to the configuration of BYOL.
      */
    var ModificationState: js.UndefOr[DedicatedTenancyModificationStateEnum] = js.undefined
    /**
      * The timestamp when the modification of the BYOL configuration was started.
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait AssociateIpGroupsRequest extends js.Object {
    /**
      * The identifier of the directory.
      */
    var DirectoryId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DirectoryId
    /**
      * The identifiers of one or more IP access control groups.
      */
    var GroupIds: IpGroupIdList
  }
  
  trait AssociateIpGroupsResult extends js.Object
  
  trait AuthorizeIpRulesRequest extends js.Object {
    /**
      * The identifier of the group.
      */
    var GroupId: IpGroupId
    /**
      * The rules to add to the group.
      */
    var UserRules: IpRuleList
  }
  
  trait AuthorizeIpRulesResult extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ClientProperties extends js.Object {
    /**
      * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can choose to reconnect to their WorkSpaces without re-entering their credentials. 
      */
    var ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
  }
  
  trait ClientPropertiesResult extends js.Object {
    /**
      * Information about the Amazon WorkSpaces client.
      */
    var ClientProperties: js.UndefOr[ClientProperties] = js.undefined
    /**
      * The resource identifier, in the form of a directory ID.
      */
    var ResourceId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ComputeType extends js.Object {
    /**
      * The compute type.
      */
    var Name: js.UndefOr[Compute] = js.undefined
  }
  
  trait CreateIpGroupRequest extends js.Object {
    /**
      * The description of the group.
      */
    var GroupDesc: js.UndefOr[IpGroupDesc] = js.undefined
    /**
      * The name of the group.
      */
    var GroupName: IpGroupName
    /**
      * The rules to add to the group.
      */
    var UserRules: js.UndefOr[IpRuleList] = js.undefined
  }
  
  trait CreateIpGroupResult extends js.Object {
    /**
      * The identifier of the group.
      */
    var GroupId: js.UndefOr[IpGroupId] = js.undefined
  }
  
  trait CreateTagsRequest extends js.Object {
    /**
      * The identifier of the WorkSpace. To find this ID, use DescribeWorkspaces.
      */
    var ResourceId: NonEmptyString
    /**
      * The tags. Each WorkSpace can have a maximum of 50 tags.
      */
    var Tags: TagList
  }
  
  trait CreateTagsResult extends js.Object
  
  trait CreateWorkspacesRequest extends js.Object {
    /**
      * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
      */
    var Workspaces: WorkspaceRequestList
  }
  
  trait CreateWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpaces that could not be created.
      */
    var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.undefined
    /**
      * Information about the WorkSpaces that were created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete.
      */
    var PendingRequests: js.UndefOr[WorkspaceList] = js.undefined
  }
  
  trait DefaultWorkspaceCreationProperties extends js.Object {
    /**
      * The identifier of any security groups to apply to WorkSpaces when they are created.
      */
    var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.undefined
    /**
      * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
      */
    var DefaultOu: js.UndefOr[DefaultOu] = js.undefined
    /**
      * The public IP address to attach to all WorkSpaces that are created or rebuilt.
      */
    var EnableInternetAccess: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Specifies whether the directory is enabled for Amazon WorkDocs.
      */
    var EnableWorkDocs: js.UndefOr[BooleanObject] = js.undefined
    /**
      * Specifies whether the WorkSpace user is an administrator on the WorkSpace.
      */
    var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.undefined
  }
  
  trait DeleteIpGroupRequest extends js.Object {
    /**
      * The identifier of the IP access control group.
      */
    var GroupId: IpGroupId
  }
  
  trait DeleteIpGroupResult extends js.Object
  
  trait DeleteTagsRequest extends js.Object {
    /**
      * The identifier of the WorkSpace. To find this ID, use DescribeWorkspaces.
      */
    var ResourceId: NonEmptyString
    /**
      * The tag keys.
      */
    var TagKeys: TagKeyList
  }
  
  trait DeleteTagsResult extends js.Object
  
  trait DeleteWorkspaceImageRequest extends js.Object {
    /**
      * The identifier of the image.
      */
    var ImageId: WorkspaceImageId
  }
  
  trait DeleteWorkspaceImageResult extends js.Object
  
  trait DescribeAccountModificationsRequest extends js.Object {
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeAccountModificationsResult extends js.Object {
    /**
      * The list of modifications to the configuration of BYOL.
      */
    var AccountModifications: js.UndefOr[AccountModificationList] = js.undefined
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeAccountRequest extends js.Object
  
  trait DescribeAccountResult extends js.Object {
    /**
      * The IP address range, specified as an IPv4 CIDR block, used for the management network interface. The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
      */
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined
    /**
      * The status of BYOL (whether BYOL is enabled or disabled).
      */
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportResultEnum] = js.undefined
  }
  
  trait DescribeClientPropertiesRequest extends js.Object {
    /**
      * The resource identifiers, in the form of directory IDs.
      */
    var ResourceIds: ResourceIdList
  }
  
  trait DescribeClientPropertiesResult extends js.Object {
    /**
      * Information about the specified Amazon WorkSpaces clients.
      */
    var ClientPropertiesList: js.UndefOr[ClientPropertiesList] = js.undefined
  }
  
  trait DescribeIpGroupsRequest extends js.Object {
    /**
      * The identifiers of one or more IP access control groups.
      */
    var GroupIds: js.UndefOr[IpGroupIdList] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var MaxResults: js.UndefOr[Limit] = js.undefined
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeIpGroupsResult extends js.Object {
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Information about the IP access control groups.
      */
    var Result: js.UndefOr[WorkspacesIpGroupsList] = js.undefined
  }
  
  trait DescribeTagsRequest extends js.Object {
    /**
      * The identifier of the WorkSpace. To find this ID, use DescribeWorkspaces.
      */
    var ResourceId: NonEmptyString
  }
  
  trait DescribeTagsResult extends js.Object {
    /**
      * The tags.
      */
    var TagList: js.UndefOr[TagList] = js.undefined
  }
  
  trait DescribeWorkspaceBundlesRequest extends js.Object {
    /**
      * The identifiers of the bundles. You cannot combine this parameter with any other filter.
      */
    var BundleIds: js.UndefOr[BundleIdList] = js.undefined
    /**
      * The token for the next set of results. (You received this token from a previous call.)
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The owner of the bundles. You cannot combine this parameter with any other filter. Specify AMAZON to describe the bundles provided by AWS or null to describe the bundles that belong to your account.
      */
    var Owner: js.UndefOr[BundleOwner] = js.undefined
  }
  
  trait DescribeWorkspaceBundlesResult extends js.Object {
    /**
      * Information about the bundles.
      */
    var Bundles: js.UndefOr[BundleList] = js.undefined
    /**
      * The token to use to retrieve the next set of results, or null if there are no more results available. This token is valid for one day and must be used within that time frame.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeWorkspaceDirectoriesRequest extends js.Object {
    /**
      * The identifiers of the directories. If the value is null, all directories are retrieved.
      */
    var DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeWorkspaceDirectoriesResult extends js.Object {
    /**
      * Information about the directories.
      */
    var Directories: js.UndefOr[DirectoryList] = js.undefined
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeWorkspaceImagesRequest extends js.Object {
    /**
      * The identifier of the image.
      */
    var ImageIds: js.UndefOr[WorkspaceImageIdList] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var MaxResults: js.UndefOr[Limit] = js.undefined
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeWorkspaceImagesResult extends js.Object {
    /**
      * Information about the images.
      */
    var Images: js.UndefOr[WorkspaceImageList] = js.undefined
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
      */
    var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
  }
  
  trait DescribeWorkspacesConnectionStatusResult extends js.Object {
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Information about the connection status of the WorkSpace.
      */
    var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined
  }
  
  trait DescribeWorkspacesRequest extends js.Object {
    /**
      * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine this parameter with any other filter.
      */
    var BundleId: js.UndefOr[BundleId] = js.undefined
    /**
      * The identifier of the directory. In addition, you can optionally specify a specific directory user (see UserName). You cannot combine this parameter with any other filter.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The maximum number of items to return.
      */
    var Limit: js.UndefOr[Limit] = js.undefined
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The name of the directory user. You must specify this parameter with DirectoryId.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
    /**
      * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter. Because the CreateWorkspaces operation is asynchronous, the identifier it returns is not immediately available. If you immediately call DescribeWorkspaces with this identifier, no information is returned.
      */
    var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
  }
  
  trait DescribeWorkspacesResult extends js.Object {
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
      */
    var Workspaces: js.UndefOr[WorkspaceList] = js.undefined
  }
  
  trait DisassociateIpGroupsRequest extends js.Object {
    /**
      * The identifier of the directory.
      */
    var DirectoryId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DirectoryId
    /**
      * The identifiers of one or more IP access control groups.
      */
    var GroupIds: IpGroupIdList
  }
  
  trait DisassociateIpGroupsResult extends js.Object
  
  trait FailedCreateWorkspaceRequest extends js.Object {
    /**
      * The error code that is returned if the WorkSpace cannot be created.
      */
    var ErrorCode: js.UndefOr[ErrorType] = js.undefined
    /**
      * The text of the error message that is returned if the WorkSpace cannot be created.
      */
    var ErrorMessage: js.UndefOr[Description] = js.undefined
    /**
      * Information about the WorkSpace.
      */
    var WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined
  }
  
  trait FailedWorkspaceChangeRequest extends js.Object {
    /**
      * The error code that is returned if the WorkSpace cannot be rebooted.
      */
    var ErrorCode: js.UndefOr[ErrorType] = js.undefined
    /**
      * The text of the error message that is returned if the WorkSpace cannot be rebooted.
      */
    var ErrorMessage: js.UndefOr[Description] = js.undefined
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
  }
  
  trait ImportWorkspaceImageRequest extends js.Object {
    /**
      * The identifier of the EC2 image.
      */
    var Ec2ImageId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.Ec2ImageId
    /**
      * The description of the WorkSpace image.
      */
    var ImageDescription: WorkspaceImageDescription
    /**
      * The name of the WorkSpace image.
      */
    var ImageName: WorkspaceImageName
    /**
      * The ingestion process to be used when importing the image.
      */
    var IngestionProcess: WorkspaceImageIngestionProcess
  }
  
  trait ImportWorkspaceImageResult extends js.Object {
    /**
      * The identifier of the WorkSpace image.
      */
    var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
  }
  
  trait IpRuleItem extends js.Object {
    /**
      * The IP address range, in CIDR notation.
      */
    var ipRule: js.UndefOr[IpRule] = js.undefined
    /**
      * The description.
      */
    var ruleDesc: js.UndefOr[IpRuleDesc] = js.undefined
  }
  
  trait ListAvailableManagementCidrRangesRequest extends js.Object {
    /**
      * The IP address range to search. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block).
      */
    var ManagementCidrRangeConstraint: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ManagementCidrRangeConstraint
    /**
      * The maximum number of items to return.
      */
    var MaxResults: js.UndefOr[ManagementCidrRangeMaxResults] = js.undefined
    /**
      * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListAvailableManagementCidrRangesResult extends js.Object {
    /**
      * The list of available IP address ranges, specified as IPv4 CIDR blocks.
      */
    var ManagementCidrRanges: js.UndefOr[DedicatedTenancyCidrRangeList] = js.undefined
    /**
      * The token to use to retrieve the next set of results, or null if no more results are available.
      */
    var NextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ModificationState extends js.Object {
    /**
      * The resource.
      */
    var Resource: js.UndefOr[ModificationResourceEnum] = js.undefined
    /**
      * The modification state.
      */
    var State: js.UndefOr[ModificationStateEnum] = js.undefined
  }
  
  trait ModifyAccountRequest extends js.Object {
    /**
      * The IP address range, specified as an IPv4 CIDR block, for the management network interface. Specify an IP address range that is compatible with your network and in CIDR notation (that is, specify the range as an IPv4 CIDR block). The CIDR block size must be /16 (for example, 203.0.113.25/16). It must also be specified as available by the ListAvailableManagementCidrRanges operation.
      */
    var DedicatedTenancyManagementCidrRange: js.UndefOr[DedicatedTenancyManagementCidrRange] = js.undefined
    /**
      * The status of BYOL.
      */
    var DedicatedTenancySupport: js.UndefOr[DedicatedTenancySupportEnum] = js.undefined
  }
  
  trait ModifyAccountResult extends js.Object
  
  trait ModifyClientPropertiesRequest extends js.Object {
    /**
      * Information about the Amazon WorkSpaces client.
      */
    var ClientProperties: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.ClientProperties
    /**
      * The resource identifiers, in the form of directory IDs.
      */
    var ResourceId: NonEmptyString
  }
  
  trait ModifyClientPropertiesResult extends js.Object
  
  trait ModifyWorkspacePropertiesRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceId
    /**
      * The properties of the WorkSpace.
      */
    var WorkspaceProperties: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceProperties
  }
  
  trait ModifyWorkspacePropertiesResult extends js.Object
  
  trait ModifyWorkspaceStateRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceId
    /**
      * The WorkSpace state.
      */
    var WorkspaceState: TargetWorkspaceState
  }
  
  trait ModifyWorkspaceStateResult extends js.Object
  
  trait OperatingSystem extends js.Object {
    /**
      * The operating system.
      */
    var Type: js.UndefOr[OperatingSystemType] = js.undefined
  }
  
  trait RebootRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceId
  }
  
  trait RebootWorkspacesRequest extends js.Object {
    /**
      * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
      */
    var RebootWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebootWorkspaceRequests
  }
  
  trait RebootWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpaces that could not be rebooted.
      */
    var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.undefined
  }
  
  trait RebuildRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceId
  }
  
  trait RebuildWorkspacesRequest extends js.Object {
    /**
      * The WorkSpace to rebuild. You can specify a single WorkSpace.
      */
    var RebuildWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.RebuildWorkspaceRequests
  }
  
  trait RebuildWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpace that could not be rebuilt.
      */
    var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
  }
  
  trait RevokeIpRulesRequest extends js.Object {
    /**
      * The identifier of the group.
      */
    var GroupId: IpGroupId
    /**
      * The rules to remove from the group.
      */
    var UserRules: IpRevokedRuleList
  }
  
  trait RevokeIpRulesResult extends js.Object
  
  trait RootStorage extends js.Object {
    /**
      * The size of the root volume.
      */
    var Capacity: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait StartRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
  }
  
  trait StartWorkspacesRequest extends js.Object {
    /**
      * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
      */
    var StartWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StartWorkspaceRequests
  }
  
  trait StartWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpaces that could not be started.
      */
    var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
  }
  
  trait StopRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
  }
  
  trait StopWorkspacesRequest extends js.Object {
    /**
      * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
      */
    var StopWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.StopWorkspaceRequests
  }
  
  trait StopWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpaces that could not be stopped.
      */
    var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.undefined
  }
  
  trait Tag extends js.Object {
    /**
      * The key of the tag.
      */
    var Key: TagKey
    /**
      * The value of the tag.
      */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  trait TerminateRequest extends js.Object {
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.WorkspaceId
  }
  
  trait TerminateWorkspacesRequest extends js.Object {
    /**
      * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
      */
    var TerminateWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.TerminateWorkspaceRequests
  }
  
  trait TerminateWorkspacesResult extends js.Object {
    /**
      * Information about the WorkSpaces that could not be terminated.
      */
    var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates the specified IP access control group with the specified directory.
      */
    def associateIpGroups(): awsDashSdkLib.libRequestMod.Request[AssociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateIpGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates the specified IP access control group with the specified directory.
      */
    def associateIpGroups(params: AssociateIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[AssociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateIpGroups(
      params: AssociateIpGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
      */
    def authorizeIpRules(): awsDashSdkLib.libRequestMod.Request[AuthorizeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeIpRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeIpRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds one or more rules to the specified IP access control group. This action gives users permission to access their WorkSpaces from the CIDR address ranges specified in the rules.
      */
    def authorizeIpRules(params: AuthorizeIpRulesRequest): awsDashSdkLib.libRequestMod.Request[AuthorizeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def authorizeIpRules(
      params: AuthorizeIpRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AuthorizeIpRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AuthorizeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
      */
    def createIpGroup(): awsDashSdkLib.libRequestMod.Request[CreateIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIpGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an IP access control group. An IP access control group provides you with the ability to control the IP addresses from which users are allowed to access their WorkSpaces. To specify the CIDR address ranges, add rules to your IP access control group and then associate the group with your directory. You can add rules when you create the group or at any time using AuthorizeIpRules. There is a default IP access control group associated with your directory. If you don't associate an IP access control group with your directory, the default group is used. The default group includes a default rule that allows users to access their WorkSpaces from anywhere. You cannot modify the default IP access control group for your directory.
      */
    def createIpGroup(params: CreateIpGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createIpGroup(
      params: CreateIpGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the specified tags for the specified WorkSpace.
      */
    def createTags(): awsDashSdkLib.libRequestMod.Request[CreateTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates the specified tags for the specified WorkSpace.
      */
    def createTags(params: CreateTagsRequest): awsDashSdkLib.libRequestMod.Request[CreateTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createTags(
      params: CreateTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
      */
    def createWorkspaces(): awsDashSdkLib.libRequestMod.Request[CreateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates one or more WorkSpaces. This operation is asynchronous and returns before the WorkSpaces are created.
      */
    def createWorkspaces(params: CreateWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[CreateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createWorkspaces(
      params: CreateWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
      */
    def deleteIpGroup(): awsDashSdkLib.libRequestMod.Request[DeleteIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIpGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified IP access control group. You cannot delete an IP access control group that is associated with a directory.
      */
    def deleteIpGroup(params: DeleteIpGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteIpGroup(
      params: DeleteIpGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified tags from the specified WorkSpace.
      */
    def deleteTags(): awsDashSdkLib.libRequestMod.Request[DeleteTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified tags from the specified WorkSpace.
      */
    def deleteTags(params: DeleteTagsRequest): awsDashSdkLib.libRequestMod.Request[DeleteTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteTags(
      params: DeleteTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image. 
      */
    def deleteWorkspaceImage(): awsDashSdkLib.libRequestMod.Request[DeleteWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkspaceImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkspaceImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image. 
      */
    def deleteWorkspaceImage(params: DeleteWorkspaceImageRequest): awsDashSdkLib.libRequestMod.Request[DeleteWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteWorkspaceImage(
      params: DeleteWorkspaceImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWorkspaceImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
      */
    def describeAccount(): awsDashSdkLib.libRequestMod.Request[DescribeAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the configuration of bring your own license (BYOL) for the specified account.
      */
    def describeAccount(params: DescribeAccountRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccount(
      params: DescribeAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the specified account.
      */
    def describeAccountModifications(): awsDashSdkLib.libRequestMod.Request[DescribeAccountModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountModifications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountModificationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes modifications to the configuration of bring your own license (BYOL) for the specified account.
      */
    def describeAccountModifications(params: DescribeAccountModificationsRequest): awsDashSdkLib.libRequestMod.Request[DescribeAccountModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountModifications(
      params: DescribeAccountModificationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountModificationsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountModificationsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
      */
    def describeClientProperties(): awsDashSdkLib.libRequestMod.Request[DescribeClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClientProperties(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClientPropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified Amazon WorkSpaces clients.
      */
    def describeClientProperties(params: DescribeClientPropertiesRequest): awsDashSdkLib.libRequestMod.Request[DescribeClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeClientProperties(
      params: DescribeClientPropertiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClientPropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your IP access control groups.
      */
    def describeIpGroups(): awsDashSdkLib.libRequestMod.Request[DescribeIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIpGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more of your IP access control groups.
      */
    def describeIpGroups(params: DescribeIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[DescribeIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeIpGroups(
      params: DescribeIpGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified tags for the specified WorkSpace.
      */
    def describeTags(): awsDashSdkLib.libRequestMod.Request[DescribeTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified tags for the specified WorkSpace.
      */
    def describeTags(params: DescribeTagsRequest): awsDashSdkLib.libRequestMod.Request[DescribeTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeTags(
      params: DescribeTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeTagsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeTagsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
      */
    def describeWorkspaceBundles(): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceBundles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceBundlesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes the available WorkSpace bundles. You can filter the results using either bundle ID or owner, but not both.
      */
    def describeWorkspaceBundles(params: DescribeWorkspaceBundlesRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceBundles(
      params: DescribeWorkspaceBundlesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceBundlesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceBundlesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
      */
    def describeWorkspaceDirectories(): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceDirectories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the available AWS Directory Service directories that are registered with Amazon WorkSpaces.
      */
    def describeWorkspaceDirectories(params: DescribeWorkspaceDirectoriesRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceDirectories(
      params: DescribeWorkspaceDirectoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceDirectoriesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceDirectoriesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
      */
    def describeWorkspaceImages(): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list that describes one or more specified images, if the image identifiers are provided. Otherwise, all images in the account are described. 
      */
    def describeWorkspaceImages(params: DescribeWorkspaceImagesRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaceImages(
      params: DescribeWorkspaceImagesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspaceImagesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspaceImagesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
      */
    def describeWorkspaces(): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the specified WorkSpaces. You can filter the results by using the bundle identifier, directory identifier, or owner, but you can specify only one filter at a time.
      */
    def describeWorkspaces(params: DescribeWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspaces(
      params: DescribeWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the connection status of the specified WorkSpaces.
      */
    def describeWorkspacesConnectionStatus(): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesConnectionStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspacesConnectionStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspacesConnectionStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesConnectionStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes the connection status of the specified WorkSpaces.
      */
    def describeWorkspacesConnectionStatus(params: DescribeWorkspacesConnectionStatusRequest): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesConnectionStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeWorkspacesConnectionStatus(
      params: DescribeWorkspacesConnectionStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeWorkspacesConnectionStatusResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeWorkspacesConnectionStatusResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified IP access control group from the specified directory.
      */
    def disassociateIpGroups(): awsDashSdkLib.libRequestMod.Request[DisassociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateIpGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates the specified IP access control group from the specified directory.
      */
    def disassociateIpGroups(params: DisassociateIpGroupsRequest): awsDashSdkLib.libRequestMod.Request[DisassociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateIpGroups(
      params: DisassociateIpGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateIpGroupsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateIpGroupsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
      */
    def importWorkspaceImage(): awsDashSdkLib.libRequestMod.Request[ImportWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importWorkspaceImage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportWorkspaceImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Imports the specified Windows 7 or Windows 10 bring your own license (BYOL) image into Amazon WorkSpaces. The image must be an already licensed EC2 image that is in your AWS account, and you must own the image. 
      */
    def importWorkspaceImage(params: ImportWorkspaceImageRequest): awsDashSdkLib.libRequestMod.Request[ImportWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def importWorkspaceImage(
      params: ImportWorkspaceImageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportWorkspaceImageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable bring your own license (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
      */
    def listAvailableManagementCidrRanges(): awsDashSdkLib.libRequestMod.Request[ListAvailableManagementCidrRangesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAvailableManagementCidrRanges(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAvailableManagementCidrRangesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAvailableManagementCidrRangesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a list of IP address ranges, specified as IPv4 CIDR blocks, that you can use for the network management interface when you enable bring your own license (BYOL).  The management network interface is connected to a secure Amazon WorkSpaces management network. It is used for interactive streaming of the WorkSpace desktop to Amazon WorkSpaces clients, and to allow Amazon WorkSpaces to manage the WorkSpace.
      */
    def listAvailableManagementCidrRanges(params: ListAvailableManagementCidrRangesRequest): awsDashSdkLib.libRequestMod.Request[ListAvailableManagementCidrRangesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAvailableManagementCidrRanges(
      params: ListAvailableManagementCidrRangesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAvailableManagementCidrRangesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAvailableManagementCidrRangesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the configuration of bring your own license (BYOL) for the specified account.
      */
    def modifyAccount(): awsDashSdkLib.libRequestMod.Request[ModifyAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyAccount(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyAccountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the configuration of bring your own license (BYOL) for the specified account.
      */
    def modifyAccount(params: ModifyAccountRequest): awsDashSdkLib.libRequestMod.Request[ModifyAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyAccount(
      params: ModifyAccountRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyAccountResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyAccountResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the properties of the specified Amazon WorkSpaces client.
      */
    def modifyClientProperties(): awsDashSdkLib.libRequestMod.Request[ModifyClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClientProperties(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClientPropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the properties of the specified Amazon WorkSpaces client.
      */
    def modifyClientProperties(params: ModifyClientPropertiesRequest): awsDashSdkLib.libRequestMod.Request[ModifyClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyClientProperties(
      params: ModifyClientPropertiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyClientPropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyClientPropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified WorkSpace properties.
      */
    def modifyWorkspaceProperties(): awsDashSdkLib.libRequestMod.Request[ModifyWorkspacePropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyWorkspaceProperties(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyWorkspacePropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyWorkspacePropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Modifies the specified WorkSpace properties.
      */
    def modifyWorkspaceProperties(params: ModifyWorkspacePropertiesRequest): awsDashSdkLib.libRequestMod.Request[ModifyWorkspacePropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyWorkspaceProperties(
      params: ModifyWorkspacePropertiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyWorkspacePropertiesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyWorkspacePropertiesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in this state is not stopped. Users can log into a WorkSpace in the ADMIN_MAINTENANCE state.
      */
    def modifyWorkspaceState(): awsDashSdkLib.libRequestMod.Request[ModifyWorkspaceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyWorkspaceState(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyWorkspaceStateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyWorkspaceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, or rebuild. An AutoStop WorkSpace in this state is not stopped. Users can log into a WorkSpace in the ADMIN_MAINTENANCE state.
      */
    def modifyWorkspaceState(params: ModifyWorkspaceStateRequest): awsDashSdkLib.libRequestMod.Request[ModifyWorkspaceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def modifyWorkspaceState(
      params: ModifyWorkspaceStateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ModifyWorkspaceStateResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ModifyWorkspaceStateResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
      */
    def rebootWorkspaces(): awsDashSdkLib.libRequestMod.Request[RebootWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Reboots the specified WorkSpaces. You cannot reboot a WorkSpace unless its state is AVAILABLE or UNHEALTHY. This operation is asynchronous and returns before the WorkSpaces have rebooted.
      */
    def rebootWorkspaces(params: RebootWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[RebootWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebootWorkspaces(
      params: RebootWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebootWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebootWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
      */
    def rebuildWorkspaces(): awsDashSdkLib.libRequestMod.Request[RebuildWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebuildWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebuildWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebuildWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Rebuilds the specified WorkSpace. You cannot rebuild a WorkSpace unless its state is AVAILABLE, ERROR, or UNHEALTHY. Rebuilding a WorkSpace is a potentially destructive action that can result in the loss of data. For more information, see Rebuild a WorkSpace. This operation is asynchronous and returns before the WorkSpaces have been completely rebuilt.
      */
    def rebuildWorkspaces(params: RebuildWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[RebuildWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rebuildWorkspaces(
      params: RebuildWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RebuildWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RebuildWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more rules from the specified IP access control group.
      */
    def revokeIpRules(): awsDashSdkLib.libRequestMod.Request[RevokeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeIpRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeIpRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes one or more rules from the specified IP access control group.
      */
    def revokeIpRules(params: RevokeIpRulesRequest): awsDashSdkLib.libRequestMod.Request[RevokeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeIpRules(
      params: RevokeIpRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeIpRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeIpRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
      */
    def startWorkspaces(): awsDashSdkLib.libRequestMod.Request[StartWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Starts the specified WorkSpaces. You cannot start a WorkSpace unless it has a running mode of AutoStop and a state of STOPPED.
      */
    def startWorkspaces(params: StartWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[StartWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startWorkspaces(
      params: StartWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
      */
    def stopWorkspaces(): awsDashSdkLib.libRequestMod.Request[StopWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Stops the specified WorkSpaces. You cannot stop a WorkSpace unless it has a running mode of AutoStop and a state of AVAILABLE, IMPAIRED, UNHEALTHY, or ERROR.
      */
    def stopWorkspaces(params: StopWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[StopWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopWorkspaces(
      params: StopWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
      */
    def terminateWorkspaces(): awsDashSdkLib.libRequestMod.Request[TerminateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateWorkspaces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Terminates the specified WorkSpaces. Terminating a WorkSpace is a permanent action and cannot be undone. The user's data is destroyed. If you need to archive any user data, contact Amazon Web Services before terminating the WorkSpace. You can terminate a WorkSpace that is in any state except SUSPENDED. This operation is asynchronous and returns before the WorkSpaces have been completely terminated.
      */
    def terminateWorkspaces(params: TerminateWorkspacesRequest): awsDashSdkLib.libRequestMod.Request[TerminateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def terminateWorkspaces(
      params: TerminateWorkspacesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TerminateWorkspacesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TerminateWorkspacesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the current rules of the specified IP access control group with the specified rules.
      */
    def updateRulesOfIpGroup(): awsDashSdkLib.libRequestMod.Request[UpdateRulesOfIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRulesOfIpGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRulesOfIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRulesOfIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces the current rules of the specified IP access control group with the specified rules.
      */
    def updateRulesOfIpGroup(params: UpdateRulesOfIpGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateRulesOfIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRulesOfIpGroup(
      params: UpdateRulesOfIpGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRulesOfIpGroupResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRulesOfIpGroupResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateRulesOfIpGroupRequest extends js.Object {
    /**
      * The identifier of the group.
      */
    var GroupId: IpGroupId
    /**
      * One or more rules.
      */
    var UserRules: IpRuleList
  }
  
  trait UpdateRulesOfIpGroupResult extends js.Object
  
  trait UserStorage extends js.Object {
    /**
      * The size of the user storage.
      */
    var Capacity: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait Workspace extends js.Object {
    /**
      * The identifier of the bundle used to create the WorkSpace.
      */
    var BundleId: js.UndefOr[BundleId] = js.undefined
    /**
      * The name of the WorkSpace, as seen by the operating system.
      */
    var ComputerName: js.UndefOr[ComputerName] = js.undefined
    /**
      * The identifier of the AWS Directory Service directory for the WorkSpace.
      */
    var DirectoryId: js.UndefOr[DirectoryId] = js.undefined
    /**
      * The error code that is returned if the WorkSpace cannot be created.
      */
    var ErrorCode: js.UndefOr[WorkspaceErrorCode] = js.undefined
    /**
      * The text of the error message that is returned if the WorkSpace cannot be created.
      */
    var ErrorMessage: js.UndefOr[Description] = js.undefined
    /**
      * The IP address of the WorkSpace.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * The modification states of the WorkSpace.
      */
    var ModificationStates: js.UndefOr[ModificationStateList] = js.undefined
    /**
      * Indicates whether the data stored on the root volume is encrypted.
      */
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The operational state of the WorkSpace.
      */
    var State: js.UndefOr[WorkspaceState] = js.undefined
    /**
      * The identifier of the subnet for the WorkSpace.
      */
    var SubnetId: js.UndefOr[SubnetId] = js.undefined
    /**
      * The user for the WorkSpace.
      */
    var UserName: js.UndefOr[UserName] = js.undefined
    /**
      * Indicates whether the data stored on the user volume is encrypted.
      */
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The KMS key used to encrypt data stored on your WorkSpace.
      */
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
    /**
      * The properties of the WorkSpace.
      */
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined
  }
  
  trait WorkspaceBundle extends js.Object {
    /**
      * The bundle identifier.
      */
    var BundleId: js.UndefOr[BundleId] = js.undefined
    /**
      * The compute type. For more information, see Amazon WorkSpaces Bundles.
      */
    var ComputeType: js.UndefOr[ComputeType] = js.undefined
    /**
      * A description.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the bundle.
      */
    var Name: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * The owner of the bundle. This is the account identifier of the owner, or AMAZON if the bundle is provided by AWS.
      */
    var Owner: js.UndefOr[BundleOwner] = js.undefined
    /**
      * The size of the root volume.
      */
    var RootStorage: js.UndefOr[RootStorage] = js.undefined
    /**
      * The size of the user storage.
      */
    var UserStorage: js.UndefOr[UserStorage] = js.undefined
  }
  
  trait WorkspaceConnectionStatus extends js.Object {
    /**
      * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
      */
    var ConnectionState: js.UndefOr[ConnectionState] = js.undefined
    /**
      * The timestamp of the connection status check.
      */
    var ConnectionStateCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The timestamp of the last known user connection.
      */
    var LastKnownUserConnectionTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The identifier of the WorkSpace.
      */
    var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
  }
  
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
  
  trait WorkspaceImage extends js.Object {
    /**
      * The description of the image.
      */
    var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
    /**
      * The error code that is returned for the image.
      */
    var ErrorCode: js.UndefOr[WorkspaceImageErrorCode] = js.undefined
    /**
      * The text of the error message that is returned for the image.
      */
    var ErrorMessage: js.UndefOr[Description] = js.undefined
    /**
      * The identifier of the image.
      */
    var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
    /**
      * The name of the image.
      */
    var Name: js.UndefOr[WorkspaceImageName] = js.undefined
    /**
      * The operating system that the image is running. 
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * Specifies whether the image is running on dedicated hardware. When bring your own license (BYOL) is enabled, this value is set to DEDICATED. 
      */
    var RequiredTenancy: js.UndefOr[WorkspaceImageRequiredTenancy] = js.undefined
    /**
      * The status of the image.
      */
    var State: js.UndefOr[WorkspaceImageState] = js.undefined
  }
  
  trait WorkspaceProperties extends js.Object {
    /**
      * The compute type. For more information, see Amazon WorkSpaces Bundles.
      */
    var ComputeTypeName: js.UndefOr[Compute] = js.undefined
    /**
      * The size of the root volume.
      */
    var RootVolumeSizeGib: js.UndefOr[RootVolumeSizeGib] = js.undefined
    /**
      * The running mode. For more information, see Manage the WorkSpace Running Mode.
      */
    var RunningMode: js.UndefOr[RunningMode] = js.undefined
    /**
      * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60 minute intervals.
      */
    var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[RunningModeAutoStopTimeoutInMinutes] = js.undefined
    /**
      * The size of the user storage.
      */
    var UserVolumeSizeGib: js.UndefOr[UserVolumeSizeGib] = js.undefined
  }
  
  trait WorkspaceRequest extends js.Object {
    /**
      * The identifier of the bundle for the WorkSpace. You can use DescribeWorkspaceBundles to list the available bundles.
      */
    var BundleId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.BundleId
    /**
      * The identifier of the AWS Directory Service directory for the WorkSpace. You can use DescribeWorkspaceDirectories to list the available directories.
      */
    var DirectoryId: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.DirectoryId
    /**
      * Indicates whether the data stored on the root volume is encrypted.
      */
    var RootVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The tags for the WorkSpace.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The username of the user for the WorkSpace. This username must exist in the AWS Directory Service directory for the WorkSpace.
      */
    var UserName: awsDashSdkLib.clientsWorkspacesMod.WorkSpacesNs.UserName
    /**
      * Indicates whether the data stored on the user volume is encrypted.
      */
    var UserVolumeEncryptionEnabled: js.UndefOr[BooleanObject] = js.undefined
    /**
      * The KMS key used to encrypt data stored on your WorkSpace.
      */
    var VolumeEncryptionKey: js.UndefOr[VolumeEncryptionKey] = js.undefined
    /**
      * The WorkSpace properties.
      */
    var WorkspaceProperties: js.UndefOr[WorkspaceProperties] = js.undefined
  }
  
  trait WorkspacesIpGroup extends js.Object {
    /**
      * The description of the group.
      */
    var groupDesc: js.UndefOr[IpGroupDesc] = js.undefined
    /**
      * The identifier of the group.
      */
    var groupId: js.UndefOr[IpGroupId] = js.undefined
    /**
      * The name of the group.
      */
    var groupName: js.UndefOr[IpGroupName] = js.undefined
    /**
      * The rules.
      */
    var userRules: js.UndefOr[IpRuleList] = js.undefined
  }
  
  trait _Compute extends js.Object
  
  trait _ConnectionState extends js.Object
  
  trait _DedicatedTenancyModificationStateEnum extends js.Object
  
  trait _DedicatedTenancySupportResultEnum extends js.Object
  
  trait _ModificationResourceEnum extends js.Object
  
  trait _ModificationStateEnum extends js.Object
  
  trait _OperatingSystemType extends js.Object
  
  trait _ReconnectEnum extends js.Object
  
  trait _RunningMode extends js.Object
  
  trait _TargetWorkspaceState extends js.Object
  
  trait _WorkspaceDirectoryState extends js.Object
  
  trait _WorkspaceDirectoryType extends js.Object
  
  trait _WorkspaceImageIngestionProcess extends js.Object
  
  trait _WorkspaceImageRequiredTenancy extends js.Object
  
  trait _WorkspaceImageState extends js.Object
  
  trait _WorkspaceState extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ARN = java.lang.String
  type AccountModificationList = js.Array[AccountModification]
  type Alias = java.lang.String
  type BooleanObject = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdList = js.Array[BundleId]
  type BundleList = js.Array[WorkspaceBundle]
  type BundleOwner = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientPropertiesList = js.Array[ClientPropertiesResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.STANDARD
    - awsDashSdkLib.awsDashSdkLibStrings.PERFORMANCE
    - awsDashSdkLib.awsDashSdkLibStrings.POWER
    - awsDashSdkLib.awsDashSdkLibStrings.GRAPHICS
    - awsDashSdkLib.awsDashSdkLibStrings.POWERPRO
    - awsDashSdkLib.awsDashSdkLibStrings.GRAPHICSPRO
    - java.lang.String
  */
  type Compute = _Compute | java.lang.String
  type ComputerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.DISCONNECTED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - java.lang.String
  */
  type ConnectionState = _ConnectionState | java.lang.String
  type DedicatedTenancyCidrRangeList = js.Array[DedicatedTenancyManagementCidrRange]
  type DedicatedTenancyManagementCidrRange = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DedicatedTenancyModificationStateEnum = _DedicatedTenancyModificationStateEnum | java.lang.String
  type DedicatedTenancySupportEnum = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type DedicatedTenancySupportResultEnum = _DedicatedTenancySupportResultEnum | java.lang.String
  type DefaultOu = java.lang.String
  type Description = java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIdList = js.Array[DirectoryId]
  type DirectoryList = js.Array[WorkspaceDirectory]
  type DirectoryName = java.lang.String
  type DnsIpAddresses = js.Array[IpAddress]
  type Ec2ImageId = java.lang.String
  type ErrorType = java.lang.String
  type FailedCreateWorkspaceRequests = js.Array[FailedCreateWorkspaceRequest]
  type FailedRebootWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedRebuildWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStartWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedStopWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type FailedTerminateWorkspaceRequests = js.Array[FailedWorkspaceChangeRequest]
  type IpAddress = java.lang.String
  type IpGroupDesc = java.lang.String
  type IpGroupId = java.lang.String
  type IpGroupIdList = js.Array[IpGroupId]
  type IpGroupName = java.lang.String
  type IpRevokedRuleList = js.Array[IpRule]
  type IpRule = java.lang.String
  type IpRuleDesc = java.lang.String
  type IpRuleList = js.Array[IpRuleItem]
  type Limit = scala.Double
  type ManagementCidrRangeConstraint = java.lang.String
  type ManagementCidrRangeMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ROOT_VOLUME
    - awsDashSdkLib.awsDashSdkLibStrings.USER_VOLUME
    - awsDashSdkLib.awsDashSdkLibStrings.COMPUTE_TYPE
    - java.lang.String
  */
  type ModificationResourceEnum = _ModificationResourceEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_INITIATED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_IN_PROGRESS
    - java.lang.String
  */
  type ModificationStateEnum = _ModificationStateEnum | java.lang.String
  type ModificationStateList = js.Array[ModificationState]
  type NonEmptyString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WINDOWS
    - awsDashSdkLib.awsDashSdkLibStrings.LINUX
    - java.lang.String
  */
  type OperatingSystemType = _OperatingSystemType | java.lang.String
  type PaginationToken = java.lang.String
  type RebootWorkspaceRequests = js.Array[RebootRequest]
  type RebuildWorkspaceRequests = js.Array[RebuildRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLED
    - java.lang.String
  */
  type ReconnectEnum = _ReconnectEnum | java.lang.String
  type RegistrationCode = java.lang.String
  type ResourceIdList = js.Array[NonEmptyString]
  type RootVolumeSizeGib = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AUTO_STOP
    - awsDashSdkLib.awsDashSdkLibStrings.ALWAYS_ON
    - java.lang.String
  */
  type RunningMode = _RunningMode | java.lang.String
  type RunningModeAutoStopTimeoutInMinutes = scala.Double
  type SecurityGroupId = java.lang.String
  type StartWorkspaceRequests = js.Array[StartRequest]
  type StopWorkspaceRequests = js.Array[StopRequest]
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_MAINTENANCE
    - java.lang.String
  */
  type TargetWorkspaceState = _TargetWorkspaceState | java.lang.String
  type TerminateWorkspaceRequests = js.Array[TerminateRequest]
  type Timestamp = stdLib.Date
  type UserName = java.lang.String
  type UserVolumeSizeGib = scala.Double
  type VolumeEncryptionKey = java.lang.String
  type WorkspaceConnectionStatusList = js.Array[WorkspaceConnectionStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERING
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERING
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceDirectoryState = _WorkspaceDirectoryState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIMPLE_AD
    - awsDashSdkLib.awsDashSdkLibStrings.AD_CONNECTOR
    - java.lang.String
  */
  type WorkspaceDirectoryType = _WorkspaceDirectoryType | java.lang.String
  type WorkspaceErrorCode = java.lang.String
  type WorkspaceId = java.lang.String
  type WorkspaceIdList = js.Array[WorkspaceId]
  type WorkspaceImageDescription = java.lang.String
  type WorkspaceImageErrorCode = java.lang.String
  type WorkspaceImageId = java.lang.String
  type WorkspaceImageIdList = js.Array[WorkspaceImageId]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_REGULAR
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_GRAPHICS
    - awsDashSdkLib.awsDashSdkLibStrings.BYOL_GRAPHICSPRO
    - java.lang.String
  */
  type WorkspaceImageIngestionProcess = _WorkspaceImageIngestionProcess | java.lang.String
  type WorkspaceImageList = js.Array[WorkspaceImage]
  type WorkspaceImageName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.DEDICATED
    - java.lang.String
  */
  type WorkspaceImageRequiredTenancy = _WorkspaceImageRequiredTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceImageState = _WorkspaceImageState | java.lang.String
  type WorkspaceList = js.Array[Workspace]
  type WorkspaceRequestList = js.Array[WorkspaceRequest]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.IMPAIRED
    - awsDashSdkLib.awsDashSdkLibStrings.UNHEALTHY
    - awsDashSdkLib.awsDashSdkLibStrings.REBOOTING
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.REBUILDING
    - awsDashSdkLib.awsDashSdkLibStrings.MAINTENANCE
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_MAINTENANCE
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATING
    - awsDashSdkLib.awsDashSdkLibStrings.TERMINATED
    - awsDashSdkLib.awsDashSdkLibStrings.SUSPENDED
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type WorkspaceState = _WorkspaceState | java.lang.String
  type WorkspacesIpGroupsList = js.Array[WorkspacesIpGroup]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-04-08`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

