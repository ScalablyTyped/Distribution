package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkSpaces
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_WorkSpaces: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    * Copies the specified image from the specified Region to the current Region.
    */
  def copyWorkspaceImage(): awsDashSdkLib.libRequestMod.Request[CopyWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyWorkspaceImage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Copies the specified image from the specified Region to the current Region.
    */
  def copyWorkspaceImage(params: CopyWorkspaceImageRequest): awsDashSdkLib.libRequestMod.Request[CopyWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def copyWorkspaceImage(
    params: CopyWorkspaceImageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CopyWorkspaceImageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CopyWorkspaceImageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Creates the specified tags for the specified WorkSpaces resource.
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
    * Creates the specified tags for the specified WorkSpaces resource.
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
    * Deletes the specified tags from the specified WorkSpaces resource.
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
    * Deletes the specified tags from the specified WorkSpaces resource.
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
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and un-share the image if it is shared with other accounts. 
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
    * Deletes the specified image from your account. To delete an image, you must first delete any bundles that are associated with the image and un-share the image if it is shared with other accounts. 
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
    * Describes the specified tags for the specified WorkSpaces resource.
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
    * Describes the specified tags for the specified WorkSpaces resource.
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
    * Modifies the properties of the specified Amazon WorkSpaces clients.
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
    * Modifies the properties of the specified Amazon WorkSpaces clients.
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
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
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
    * Sets the state of the specified WorkSpace. To maintain a WorkSpace without being interrupted, set the WorkSpace state to ADMIN_MAINTENANCE. WorkSpaces in this state do not respond to requests to reboot, stop, start, rebuild, or restore. An AutoStop WorkSpace in this state is not stopped. Users cannot log into a WorkSpace in the ADMIN_MAINTENANCE state.
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

